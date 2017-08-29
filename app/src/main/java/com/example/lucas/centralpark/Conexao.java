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

import java.io.IOException;


public class Conexao extends AppCompatActivity {

    EditText editEmailLogar, editSenhaLogar;
    Button btnLogar;
    TextView txtCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     //   @Override
   //     protected void onPostExecute(String result){
            //TextView.setText(result);
        }
 //   }
}