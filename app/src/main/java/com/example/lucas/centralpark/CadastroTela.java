package com.example.lucas.centralpark;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CadastroTela extends AppCompatActivity {

    EditText editNome, editSobrenome, editTelefone, editApto, editBloco, editSenha, editVeiculo, editNumGaragem;
    RadioButton rbProprietario, rbLocatario;
    RadioButton rbSindico;
    Button btnConfirmar, btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome = (EditText) findViewById(R.id.edittextNome);
        editSobrenome = (EditText) findViewById(R.id.editTextSobrenome);
        editTelefone = (EditText) findViewById(R.id.editTextTelefone);
        editApto = (EditText) findViewById(R.id.editTextApto);
        editBloco = (EditText) findViewById(R.id.editTextBloco);
        editSenha = (EditText) findViewById(R.id.editTextSenha);
        editVeiculo = (EditText) findViewById(R.id.editTextVeiculo);
        editNumGaragem = (EditText) findViewById(R.id.editTextNumGaragem);

        rbProprietario = (RadioButton) findViewById(R.id.RbProprietario);
        rbLocatario = (RadioButton) findViewById(R.id.RbLocatario);
        rbSindico = (RadioButton) findViewById(R.id.RbSindico);

        btnCancelar = (Button) findViewById(R.id.btnCancelar);
        btnConfirmar = (Button) findViewById(R.id.btnConfirmar);

        editTelefone.addTextChangedListener(Mask.insert("(##)#####-####", editTelefone));


        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                finish();
            }
        });

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Morador cadastrado com sucesso", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }
}