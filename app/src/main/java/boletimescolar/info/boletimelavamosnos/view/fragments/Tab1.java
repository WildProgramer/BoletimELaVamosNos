package boletimescolar.info.boletimelavamosnos.view.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import boletimescolar.info.boletimelavamosnos.R;
import boletimescolar.info.boletimelavamosnos.model.domain.ProvaDomain;
import boletimescolar.info.boletimelavamosnos.model.fragmentmodel.Tab1Model;
import boletimescolar.info.boletimelavamosnos.view.adapters.RecyclerViewAdapter;
import boletimescolar.info.boletimelavamosnos.view.adapters.RecylerViewAdapter2;

/**
 * Created by hp1 on 21-01-2015.
 */
public class Tab1 extends Fragment {



    private Tab1Model tab1Model;


    //RecyclerView1 Gorick

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;
    private RecyclerView.LayoutManager layoutManager;

    private List<ProvaDomain> provaArray = new ArrayList<>();
//    String[] materias = {"Português", "Matemática", "Inglês"};
//    Double[] notas = {7.5, 10.0, 2.7};
//    Integer[] faltas = {5, 6, 3};

    //RecyclerView2 Gorick

    private RecyclerView recyclerView2;
    private RecyclerView.Adapter recyclerViewAdapter2;
    private RecyclerView.LayoutManager layoutManager2;
    String[] materias2 = {"Geografia", "História", "Inglês"};
    String[] precisaTirar = {"Precisa tirar:", "Precisa tirar:", "Precisa tirar:"};
    Double[] notas2 = {7.5, 10.0, 2.7};



    Button pesquisar;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v =inflater.inflate(R.layout.fragment_tab1,container,false);



        instanceCrap(v);

        tab1Model.provaFetch();

        for(ProvaDomain provaDomain : provaArray){

            Log.d("Array", String.valueOf(provaDomain.getNota()));


        }
        Log.d("MyLog", "Chamou fragment tab1");



        //Botão pesquisar
        pesquisar = (Button) v.findViewById(R.id.pesquisar);
        pesquisar.setBackgroundResource(R.color.colorPrimary);
        pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });

        return v;
    }

    public void instanceCrap(View v){

        //RecyclerView1 Gorick

        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        recyclerViewAdapter = new RecyclerViewAdapter(provaArray);
        layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(recyclerViewAdapter);

        //Fim do RecyclerView1 Gorick

        //RecyclerView2 Gorick

        recyclerView2 = (RecyclerView) v.findViewById(R.id.recycler_view2);
        recyclerViewAdapter2 = new RecylerViewAdapter2(materias2, precisaTirar, notas2);
        layoutManager2 = new LinearLayoutManager(getActivity());
        recyclerView2.setLayoutManager(layoutManager2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setAdapter(recyclerViewAdapter2);



        //Instanciar o model

        tab1Model = new Tab1Model(provaArray,getActivity(), recyclerViewAdapter);

    }
}