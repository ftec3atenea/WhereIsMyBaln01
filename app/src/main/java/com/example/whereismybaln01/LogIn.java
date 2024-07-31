package com.example.whereismybaln01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_log_in);

        // instanciar las variables a usar
        Button btnLogin2 = findViewById(R.id.btn_login2);
        TextView forgot2 = findViewById(R.id.forgot2);
        TextView ntc2 = findViewById(R.id.ntc2);

        // poner en escucha los botones
        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // confirmamos que se ha iniciado sesión
                Toast.makeText(LogIn.this, "¡WoW!", Toast.LENGTH_SHORT).show();
            }
        });

        // poner en escucha los textviews
        forgot2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // creamos el intento de cambio de pantalla
                Intent irARecovery = new Intent(LogIn.this, Recovery.class);
                // ejecutamos el cambio de pantalla
                startActivity(irARecovery);
            }
        });

        ntc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // creamos el intento de cambio de pantalla
                Intent irASignUp = new Intent(LogIn.this, SignUp.class);
                // ejecutamos el cambio de pantalla
                startActivity(irASignUp);
            }
        });
    }
}