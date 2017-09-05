package com.example.lucas.centralpark;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class ViewVisitanteFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_view_visitante, container, false);

        TextView txtcadastro = (TextView) v.findViewById(R.id.txtCadastroVisitantes);

        txtcadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager manager = getFragmentManager();
                manager.beginTransaction().replace(R.id.conteiner, new InformeFragment()).commit();
            }
        });

        return v;
    }

}
