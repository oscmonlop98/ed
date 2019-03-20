package org.institutoserpis.ed.apostdelayed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
    }

    public void onButtonClick(View view) {
        Log.i(MainActivity.class.getSimpleName(), "Ejectutando onButtonCLick");
        button.setText("Hola soy el bola");

        /*button.postDelayed(new Runnable() {
            @Override
            public void run() {
                button.setText("");
            }
        }, 5000);*/

        button.postDelayed( () -> button.setText(""), 5000);
        button.postDelayed( this::kkita, 5000);

    }

    private void kkita() {
        button.setText("");
    }

}
