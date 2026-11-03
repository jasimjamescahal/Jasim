package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DonateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        Button btnConfirmDonate = findViewById(R.id.btnConfirmDonate);
        btnConfirmDonate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DonateActivity.this, "Thank you for your generous donation!", Toast.LENGTH_LONG).show();
            }
        });
    }
}