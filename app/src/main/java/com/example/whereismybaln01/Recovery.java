package com.example.whereismybaln01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Recovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recovery);

        // instanciar las variables a usar
        Button btnLogin22 = findViewById(R.id.btn_login22);
        TextView ytc22 = findViewById(R.id.ytc22);
        TextView ntc22 = findViewById(R.id.ntc22);

        // poner en escucha los botones
        btnLogin22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // le vamos a decir al usuario que se ha enviado un correo
                Toast.makeText(Recovery.this, "¡Correo enviado!", Toast.LENGTH_SHORT).show();

                // creamos el intento de cambio de pantalla
                Intent irAMain = new Intent(Recovery.this, MainActivity.class);
                // ejecutamos el cambio de pantalla
                startActivity(irAMain);
            }
        });

        // poner en escucha los textview
        ytc22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // creamos el intento de cambio de pantalla
                Intent irALogin = new Intent(Recovery.this, LogIn.class);
                // ejecutamos el cambio de pantalla
                startActivity(irALogin);
            }
        });

        ntc22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // creamos el intento de cambio de pantalla
                Intent irASignUp = new Intent(Recovery.this, SignUp.class);
                // ejecutamos el cambio de pantalla
                startActivity(irASignUp);
            }
        });
    }
}