package com.OscarCortes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        configureOptionsButton();
        configureHoy();
        configureTomorrow();

    }

    private void configureOptionsButton() {
        Button optionsButton = (Button) findViewById(R.id.optionsButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, Config));
            }

        });
    }

    private void configureHoy() {
        Button horButton = (Button) findViewById(R.id.hoyButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, FormularioHoy));
            }

        });
    }

    private void configureTomorrow() {
        Button tomorrowButton = (Button) findViewById(R.id.tomorrowButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Login.this, FormularioTomorrow);
            }

        });

    }

}
