package com.example.teladelogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this); // Habilita o modo EdgeToEdge
        setContentView(R.layout.activity_main);

        // Configura o padding para evitar sobreposição com a barra de sistema
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referência ao botão do Motorista
        Button btnMotorista = findViewById(R.id.btnMotorista);

        // Referência ao botão do Passageiro
        Button btnPassageiro = findViewById(R.id.btnPassageiro);

        // Configurar o clique do botão do Motorista
        btnMotorista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar uma Intent para abrir a SegundaTela
                Intent intent = new Intent(MainActivity.this, testeTela.class);
                startActivity(intent); // Iniciar a nova Activity
            }
        });

        // Configurar o clique do botão do Passageiro
        btnPassageiro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Criar uma Intent para abrir a SegundaTela
                Intent intent = new Intent(MainActivity.this, testeTela.class);
                startActivity(intent); // Iniciar a nova Activity
            }
        });

    }
}