using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    private bool isNew = false;
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
		treeView.AppendColumn("Nombre", new CellRendererText(), "text", 0);
		treeView.AppendColumn("Teléfono", new CellRendererText(), "text", 1);
		ListStore listStore = new ListStore(typeof(String), typeof(String));
		treeView.Model = listStore;
		listStore.AppendValues("Rosa", "777666555");
		listStore.AppendValues("Pepe", "777666554");
		listStore.AppendValues("Ana", "777666553");

		editAction.Sensitive = false;

		newAction.Activated += (sender, e) => {
			vBoxContacto.Visible = true;
			treeView.Sensitive = false;
            isNew = true;
		};

        editAction.Activated += (sender, e) => {
            vBoxContacto.Visible = true;
            treeView.Sensitive = false;
            treeView.Selection.GetSelected(out TreeIter treeIter);
            string nombre = (string)treeView.Model.GetValue(treeIter, 0);
            string telefono = (string)treeView.Model.GetValue(treeIter, 1);
            Console.WriteLine("Nombre={0} Teléfono={1}", nombre, telefono);
            entryNombre.Text = nombre;
            entryTelefono.Text = telefono;
            isNew = false;
        };
        acceptButton.Clicked += (sender, e) => {
            if (isNew) {
                listStore.AppendValues(entryNombre.Text, entryTelefono.Text);
            } else {
                treeView.Selection.GetSelected(out TreeIter treeIter);
                listStore.SetValue(treeIter, 0, entryNombre.Text);
                listStore.SetValue(treeIter, 1, entryTelefono.Text);
            }
            vBoxContacto.Visible = false;
            treeView.Sensitive = true;
        };
        cancelButton.Clicked += (sender, e) =>
        {
            vBoxContacto.Visible = false;
            treeView.Sensitive = true;
        };



        deleteButton.Activated += (sender, e) => {
            treeView.Selection.GetSelected(out TreeIter treeIter);
            treeView.Model.SetValue(treeIter, 0, "");
            treeView.Model.SetValue(treeIter, 1, "");


        };

        treeView.Selection.Changed += (sender, e) => 
            editAction.Sensitive = treeView.Selection.CountSelectedRows() > 0;
    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }
}
