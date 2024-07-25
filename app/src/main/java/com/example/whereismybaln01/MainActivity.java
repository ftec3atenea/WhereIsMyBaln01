package com.example.whereismybaln01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Intanciamos la variable, enlazamos el mundo visual con la lógica
        //TextView titulo1 = findViewById(R.id.titulo1);
        Button btnLogin = findViewById(R.id.btn_login);

        //Crear la animación que vamos a usar
        //Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);

        //Ejecutar la animación
        //titulo1.startAnimation(anim_out);

        //Ponemos en escucha a los botones
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pasoSignUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(pasoSignUp);
            }
        });

    }
}