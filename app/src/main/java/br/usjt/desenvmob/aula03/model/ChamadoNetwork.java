package br.usjt.desenvmob.aula03.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by arqdsis on 28/03/2018.
 */

public class ChamadoNetwork {

    private static ArrayList<Fila> _filas = null;
    public static ArrayList<Fila> getFilas(String urlRest, String urlImg) throws IOException {
        if(_filas == null){
            _filas = buscarFilas(urlRest);
        }
        for(Fila fila: _filas){
            fila.setImagem(getFigura(urlImg));
        }
        return _filas;
    }

    private static final DateFormat formater  = new SimpleDateFormat("dd-MM-yyyy");

    public static ArrayList<Chamado> buscarChamados(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        ArrayList<Chamado> chamados = new ArrayList<>();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        try {
            JSONArray lista = new JSONArray(json);
            for (int i = 0; i < lista.length(); i++){
                JSONObject item = (JSONObject)  lista.get(i);
                Chamado chamado = new Chamado();
                chamado.setNumero(item.getInt("numero"));
                String sDataAbertura = item.getString("dataAbertura");
                String sDataFechamento = item.getString("dataFechamento");
                chamado.setDescricao(item.getString("descricao"));
                chamado.setStatus(item.getString("status"));
                try{
                    chamado.setDataAbertura((Date)formater.parse(sDataAbertura));
                } catch (ParseException e){
                    e.printStackTrace();
                }
                try{
                    chamado.setDataFechamento((Date)formater.parse(sDataFechamento));
                } catch (ParseException e){
                    e.printStackTrace();
                }
                JSONObject filaItem = item.getJSONObject("fila");
                Fila fila = new Fila();
                fila.setId(filaItem.getInt("id"));
                fila.setNome(filaItem.getString("nome"));
                chamado.setFila(fila);
                chamados.add(chamado);
            }
        } catch (JSONException e) {
            e.printStackTrace();
            throw new IOException(e);
        }
        return chamados;
    }

    public static ArrayList<Fila> buscarFilas(String url) throws IOException {
        OkHttpClient client = new OkHttpClient();
        ArrayList<Fila> filas = new ArrayList<>();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        String json = response.body().string();
        try{
            JSONArray lista = new JSONArray(json);
            for (int i = 0; i < lista.length(); i++){
                JSONObject item = (JSONObject) lista.get(i);
                Fila fila = new Fila();
                fila.setId(item.getInt("id"));
                fila.setNome(item.getString("nome"));
                fila.setFigura(item.getString("caminhoFigura"));
                filas.add(fila);
            }
        } catch (JSONException e){
            e.printStackTrace();
            throw new IOException(e);
        }
        return filas;
    }

    public static Bitmap getFigura(String url) throws IOException {
        Bitmap img = null;
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url).build();
        Response response = client.newCall(request).execute();
        InputStream is = response.body().byteStream();
        img = BitmapFactory.decodeStream(is);
        is.close();
        return img;
    }
}
