package com.example.lucas.centralpark;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class InformeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_informe, container, false);

        Spinner opcaoVisitante = (Spinner) v.findViewById(R.id.spinnerVisitante);
        Button btnCadastra = (Button) v.findViewById(R.id.btnConfirmarVisitante);
        Button btnCancelar = (Button) v.findViewById(R.id.btnCancelarVisitante);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.arrayVisitante, android.R.layout.simple_spinner_item);
        opcaoVisitante.setAdapter(adapter);


        btnCadastra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Visitante Cadastrado", Toast.LENGTH_SHORT).show();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.conteiner, new HomeFragment()).commit();
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Cadastrado Cancelado", Toast.LENGTH_SHORT).show();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.conteiner, new HomeFragment()).commit();
            }
        });
        return v;
    }
}
