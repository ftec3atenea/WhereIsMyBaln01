package com.example.whereismybaln01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);

        //Intanciamos la variable, enlazamos el mundo visual con la lógica
        Button btnSignup3 = findViewById(R.id.btn_signup3);
        TextView ytc3 = findViewById(R.id.ytc3);
        CheckBox cb3 = findViewById(R.id.cb3);

        //Ponemos en escucha el botón
        btnSignup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cb3.isChecked()){
                    // confirmamos que se ha registrado
                    Toast.makeText(SignUp.this, "¡Cool!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //Ponemos en escucha el textview
        ytc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Creamos el intento de cambio de pantalla
                Intent irALogin = new Intent(SignUp.this, LogIn.class);
                //Ejecutamos el cambio de pantalla
                startActivity(irALogin);
            }
        });
    }
}