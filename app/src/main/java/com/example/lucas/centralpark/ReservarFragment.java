package com.example.lucas.centralpark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;


public class ReservarFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_reserva, container, false);

        Spinner opcaoEspaco = (Spinner) v.findViewById(R.id.spinnerEspaco);
        Button btnCancelar = (Button) v.findViewById(R.id.btnCancelaReserva);
        Button btnConfirmar = (Button) v.findViewById(R.id.btnConfirmaReserva);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this.getActivity(), R.array.arrayReserva, android.R.layout.simple_spinner_item);
        opcaoEspaco.setAdapter(adapter);

        final EditText dataEvento = (EditText) v.findViewById(R.id.dataEvento);
        dataEvento.addTextChangedListener(Mask.insert("##/##/####", dataEvento));

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Reserva Cadastrada com Sucesso", Toast.LENGTH_SHORT).show();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.conteiner, new HomeFragment()).commit();
            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Reserva Cancelada", Toast.LENGTH_SHORT).show();
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.conteiner, new HomeFragment()).commit();
            }
        });
        return v;
    }


}