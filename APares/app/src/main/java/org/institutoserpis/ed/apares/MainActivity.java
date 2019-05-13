package org.institutoserpis.ed.apares;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    /*private Button button, button2, buton3, button4, button5, button6, button7, button8, button9, button10, button11, button12, buttonPlay, buttonPower;

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
    }*/

    private List<String> palabras = new ArrayList<>(
            Arrays.asList("En", "un", "lugar", "de")
    );
    private List<Integer> buttonIds = Arrays.asList(
            R.id.button1, R.id.button2, R.id.button3, R.id.button4,
            R.id.button5, R.id.button6, R.id.button7, R.id.button8
    );
    private boolean esPrimeraPalabra = true;
    private String primeraPalabra = "";
    private Button primerButton = null;
    private Handler handler = new Handler();

    private void initPalabras() {
        palabras.addAll(palabras);
        Collections.shuffle(palabras);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initPalabras();}

    private void onButtonClick(View view) {
        int index = buttonIds.indexOf(view.getId());
        String palabra = palabras.get(index);
        Button button = (Button)view;
        button.setText(palabra);
        if (esPrimeraPalabra) {
            primeraPalabra = palabra;
            primerButton = button;
            esPrimeraPalabra = false;

        }else {
            esPrimeraPalabra = true;
        }
            if (!palabra.equals(primeraPalabra))
                handler.postDelayed(() -> {
                    primerButton.setText("");
                    button.setText("");
                }, 4000
                );
        }
    }








