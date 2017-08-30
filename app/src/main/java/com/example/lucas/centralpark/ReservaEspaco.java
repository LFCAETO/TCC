package com.example.lucas.centralpark;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ReservaEspaco extends AppCompatActivity {

    Spinner opcaoEspaco;
    Button btnCancelar, btnConfirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_reserva);

        opcaoEspaco = (Spinner) findViewById(R.id.spinnerEspaco);
        btnCancelar = (Button) findViewById(R.id.btnCancelaReserva);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmaReserva);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.arrayReserva, android.R.layout.simple_spinner_item);
        opcaoEspaco.setAdapter(adapter);

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Reserva Cancelada", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Reserva Efetuada", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}