using System;
using Gtk;

public partial class MainWindow : Gtk.Window
{
    public MainWindow() : base(Gtk.WindowType.Toplevel)
    {
        Build();
        buttonAceptar.Clicked += delegate {
            String nombre = entryNombre.Text;
            labelSaludo.Text = "Hola " + nombre;
            Console.WriteLine("Click en buttonAceptar con nombre=" + nombre);


        };

        //int index = 0;
        //for (int row = 0; row < 9; row++)
        //    for (int xolumn = 0;)
        Button button = new Button(Stock.Close);
        button.Visible = true;
        vbox3.Add(button);

    }

    protected void OnDeleteEvent(object sender, DeleteEventArgs a)
    {
        Application.Quit();
        a.RetVal = true;
    }

    protected void OnButtonAceptarClicked(object sender, EventArgs e)
    {


    }
}
