package boletimescolar.info.boletimelavamosnos.model.fragmentmodel;


import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;

import org.json.JSONObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import boletimescolar.info.boletimelavamosnos.controler.volleythread.ProvasVolleyThread;
import boletimescolar.info.boletimelavamosnos.model.domain.ProvaDomain;
import boletimescolar.info.boletimelavamosnos.model.ips.Ip;
import boletimescolar.info.boletimelavamosnos.model.sharedpreferences.AlunoShared;
import boletimescolar.info.boletimelavamosnos.singleton.VolleySingleton;
import boletimescolar.info.boletimelavamosnos.view.adapters.RecyclerViewAdapter;

/**
 * Created by Norb7492 on 13/09/2016.
 */
public class Tab1Model {


    private Context ctx;
    private Map<String, String> params;
    private ProvaDomain provaDomain = new ProvaDomain();
    private RecyclerViewAdapter recyclerViewAdapter;
    private List<ProvaDomain> provaArray;



    public Tab1Model(List<ProvaDomain> provaArray, Context ctx, RecyclerViewAdapter recyclerViewAdapter){
        this.ctx = ctx;
        this.recyclerViewAdapter = recyclerViewAdapter;
        this.provaArray = provaArray;



    }


    //Buscar as provas
    public void provaFetch() {

        params = new HashMap<String, String>();
        params.put("acao", "prova");
        params.put("id_aluno", String.valueOf(AlunoShared.getIdUser(ctx)));

        Log.d("MyLog", "Chamou aqui");


        ProvasVolleyThread provasVolleyThread = new ProvasVolleyThread(provaArray,recyclerViewAdapter, provaDomain, Request.Method.POST, Ip.ip, params, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {


                recyclerViewAdapter.showArray();
                recyclerViewAdapter.notifyDataSetChanged();







            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("MyLog", String.valueOf(error));


                }

        }

        );
        VolleySingleton.getInstance(ctx).addToRequestQueue(provasVolleyThread );


    }


}
