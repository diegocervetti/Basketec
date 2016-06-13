package ar.edu.eestn1ee.basketec;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by dog on 5/14/2016.
 */
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        View miView = (View) findViewById(R.id.logo);

        //Anima fade-in el logo
        miView.setAlpha(0f);
        miView.animate().alpha(1f).setDuration(1500);
        //Handler para esperar 4segs. antes de animar fade-out el logo
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                // Anima y luego llama al método que pasa a la activity principal
                View miView = (View) findViewById(R.id.logo);
                miView.animate().alpha(0);
                pasarAlMenu();
            }
        }, 4000);
    }

    //Método para pasar a la pantalla principal - MainActivity
    public void pasarAlMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        finish();
        startActivity(intent);
    }
}

