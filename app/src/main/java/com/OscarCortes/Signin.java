package com.OscarCortes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        configureCheckHome();
        configureCancel();
    }

    private void configureCheckHome() {
        Button checkHome = (Button) findViewById(R.id.checkButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Signin.this, MainActivity));
            }

        });
    }

    private void configureCancel() {
        Button cancelButton = (Button) findViewById(R.id.cancelButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Signin.this, MainActivity);
            }

        });

    }

    private void configureOptionsButton() {
        Button optionsButton = (Button) findViewById(R.id.optionsButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Signin.this, Config));
            }

        });
    }
}
