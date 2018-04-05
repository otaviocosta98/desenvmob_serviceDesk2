package br.usjt.desenvmob.aula03.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.desenvmob.aula03.R;
import br.usjt.desenvmob.aula03.model.Chamado;
import br.usjt.desenvmob.aula03.model.ChamadoNetwork;

public class MainActivity extends Activity {
    public static final String CHAMADO = "br.usjt.desenvmob.aula03.chamados";
    private EditText txtFila;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFila = (EditText) findViewById(R.id.buscar_fila);
        context = this;
    }

    public void buscarChamados(View view) {
        String fila = txtFila.getText().toString();
        new DownloadJSONChamado().execute("http:/meuIP:8080/arqsw_sdesk_a1/rest/chamados");
//        Intent intent = new Intent(this, ListarChamadosActivity.class);
//        intent.putExtra(FILA, fila);
//        startActivity(intent);
    }

    private class DownloadJSONChamado extends AsyncTask<String , Void , ArrayList<Chamado>> {

        @Override
        protected ArrayList<Chamado> doInBackground(String... strings) {
            ArrayList<Chamado> chamados = new ArrayList<>();

            try {
                //acho que o parametro string pode ser passado nesse buscar chamado. Testar depois
                chamados = ChamadoNetwork.buscarChamados("http://meuIP:8080/arqsw_sdesk_a1/rest/chamados");
            } catch (IOException e) {
                e.printStackTrace();
            }

            return chamados;
        }

        protected void onPostExecute(ArrayList<Chamado> chamados){
            Intent i = new Intent(context, ListarChamadosActivity.class);
            i.putExtra(CHAMADO, chamados);
            startActivity(i);
        }
    }
}
