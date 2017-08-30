package com.example.lucas.centralpark;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.Toast;


public class InformeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_informe, container, false);

        Button btnCadastra = (Button) v.findViewById(R.id.btnConfirmarVisitante);
        Button btnCancelar = (Button) v.findViewById(R.id.btnCancelarVisitante);

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
