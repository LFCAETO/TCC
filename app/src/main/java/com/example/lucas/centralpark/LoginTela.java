package com.example.lucas.centralpark;


import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.ConnectException;


public class LoginTela extends AppCompatActivity {

    TextView aptoHeader;
    EditText editAptoLogar, editSenhaLogar;
    Button btnLogar;
    TextView CadastroTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editAptoLogar = (EditText) findViewById(R.id.editTextAptoLogar);
        editSenhaLogar = (EditText) findViewById(R.id.editTextSenhaLogar);
        btnLogar = (Button) findViewById(R.id.btnLogar);

        btnLogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(LoginTela.this, CentralPark.class);
                startActivity(i2);
            }
        });

        /*     ConnectivityManager connMgr = (ConnectivityManager)
                        getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()){
                String Apto = editEmailLogar.getText().toString();
                String Senha = editSenhaLogar.getText().toString();
                new SolicitaDados().execute(stringUrl);

                if(editEmailLogar == null || editSenhaLogar == null){
                        Toast.makeText(getApplicationContext(), "Nenhuma campo pode esta vazio", Toast.LENGTH_LONG).show();
                } else{
                        url = "http://127.0.0.1/login/logar.php";
                        parametros = "Apartamento = " + email + "&senha = " + senha;

                        new SolicitaDados().execute(url);
                        Intent i2 = new Intent(LoginTela.this, CentralPark.class);
                        startActivity(i2);
                      }
                } else{
                     Toast.makeText(getApplicationContext(), "Nenhuma conexão foi detectada", Toast.LENGTH_LONG).show();
                  }
            }
        });
    }

   *//* private class SolicitaDados extends AsyncTask<String, Void, String> {
         @Override
         protected String doInBackground(String... urls) {
             return Conexao.postDados(urls[0], parametros);
         }

         //OnPost execute
         @Override
         protected void onPostExecute(String result) {
             //TextView.setText(result);
         }
    }
    }*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}

