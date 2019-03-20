package org.institutoserpis.ed.apares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private Button button, button2, buton3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonPlay, buttonPower;

    String palabras [];
    Button [] botonera = new Button [12];

    int aciertos = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View view) {
        Button button = (Button) view;
        button.setText("UNO");


    }

    public void onButtonClick2(View view) {
        Button button2 = (Button) view;
        button2.setText("DOS");
    }

    /*private List<String> palabras = new ArrayList<>(
            Arrays.asList("En", "un", "lugar", "de")
    );
    private List<Integer> buttonIds = Arrays.asList(
            R.id.button, R.id.button2
    );
    private void initPalabras() {
        palabras.addAll(palabras);
        Collections.shuffle(palabras);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPalabras();

        private void onButtonClick(View view) {
        int index = buttonIds.indexOf(view.getId());
        Button button = (Button)view;
        button.setText(palabras.get(index));
        }
    }*/






}
