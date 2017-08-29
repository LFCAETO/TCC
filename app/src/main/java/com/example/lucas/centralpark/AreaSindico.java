package com.example.lucas.centralpark;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AreaSindico extends AppCompatActivity {
    Button btnCadastrar, btnAlterar, btnDeletar, btnVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areasindico);

        btnCadastrar = (Button) findViewById(R.id.btnCadastrar);
        btnAlterar = (Button) findViewById(R.id.btnAlterar);
        btnDeletar = (Button) findViewById(R.id.btnDeletar);
        btnVoltar = (Button) findViewById(R.id.btnVoltar);

        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AreaSindico.this, CadastroTela.class);
                startActivity(i);
            }
        });

        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "INACESSÍVEL NO MOMENTO", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnDeletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "INACESSÍVEL NO MOMENTO", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}