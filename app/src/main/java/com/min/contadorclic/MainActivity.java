package com.min.contadorclic;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int contador=0;
    Button click,resul;
    TextView solucion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        click=findViewById(R.id.Clic);
        resul=findViewById(R.id.BotonResul);
        solucion=findViewById(R.id.Resultado);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contador++;

            }
        });
        resul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                solucion.setText("Le has dado al boton: " + contador+ " veces");
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

}