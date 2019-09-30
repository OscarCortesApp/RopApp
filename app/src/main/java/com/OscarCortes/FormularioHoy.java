package com.OscarCortes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CancellationSignal;

import java.text.Normalizer;

public class FormularioHoy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulariohoy);

        configureOptionsButton();
        configureCheckHome();
        configureCancel();
    }

    private void configureOptionsButton() {
        Button optionsButton = (Button) findViewById(R.id.optionsButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(FormularioHoy.this, Config));
            }

        });
    }

    private void configureCheckHome() {
        Button checkHome = (Button) findViewById(R.id.checkButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(FormularioHoy.this, Sugerencias));
            }

        });
    }

    private void configureCancel() {
        Button cancelButton = (Button) findViewById(R.id.cancelButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(FormularioHoy.this, MainActivity);
            }

        });

    }

}
