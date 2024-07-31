package com.example.whereismybaln01;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash);

        /* -------------------- ESTA ES LA ANIMACIÓN DESDE EL CÓDIGO XML -------------------- */
        // Intanciamos la variable, enlazamos el mundo visual con la lógica
        TextView titulo0 = findViewById(R.id.titulo0);

        //Crear la animación que vamos a usar (desde la visual) y la cargamos
        Animation anim_rotate = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);

        //Ejecutar la animación
        titulo0.startAnimation(anim_rotate);
        /* ---- ---------------------------- FIN ------------------------------------------- */


        /* ------------------- ESTA ES LA ANIMACIÓN DESDE EL JAVA -------------------- */
        // Intanciamos la variable, enlazamos el mundo visual con la lógica
        ImageView logo0 = findViewById(R.id.fondo0);

        // Crear la animación que vamos a usar
        Animation fadeIn = new AlphaAnimation(0, 1);
        // fijamos la duración de la animación
        fadeIn.setDuration(2000);
        // ejecutamos la animación
        logo0.startAnimation(fadeIn);

        // ejecutamos la animación de salida
        logo0.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(intent);
                finish();// garantizamos que se ejecute una vez y se elimine de la pila
            }
        }, 5000);
        /* ---- ---------------------------- FIN ------------------------------------------- */
    }
}
