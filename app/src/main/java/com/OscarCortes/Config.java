package com.OscarCortes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Config extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        configureBack();
        configureCheckHome();
        configureCancel();
        configureCerrar();
    }

    private void configureBack() {
        Button optionsButton = (Button) findViewById(R.id.optionsButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }

        });
    }

    private void configureCheckHome() {
        Button checkHome = (Button) findViewById(R.id.checkButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }

        });
    }

    private void configureCerrar() {
        Button checkHome = (Button) findViewById(R.id.cerrarButton);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(Config.this, MainActivity));

            }

        });
    }

    private void configureCancel() {
        Button cancelButton = (Button) findViewById(R.id.cancelButtonHome);

        configButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                finish();
            }

        });

    }

}
