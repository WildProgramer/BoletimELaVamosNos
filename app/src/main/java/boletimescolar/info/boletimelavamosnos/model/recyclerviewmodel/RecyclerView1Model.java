package boletimescolar.info.boletimelavamosnos.model.recyclerviewmodel;

import android.graphics.Color;
import android.widget.TextView;

import boletimescolar.info.boletimelavamosnos.R;
import boletimescolar.info.boletimelavamosnos.view.adapters.RecyclerViewAdapter;

/**
 * Created by Norb7492 on 13/09/2016.
 */
public class RecyclerView1Model {


    //mudar para cor vermelha quando nota menor que 5

    public void corNota(TextView notaTxt,double nota){


        if(nota < 5){

            notaTxt.setText(String.valueOf(nota));
            notaTxt.setTextColor(Color.RED);



        }else{

            notaTxt.setText(String.valueOf(nota));

        }




    }


    public void materias(TextView materiaTxt, int materia){


        switch (materia){

            case 1:
                materiaTxt.setText(R.string.portugues);
                break;
            case 2:
                materiaTxt.setText(R.string.matematica);
                break;
            case 3:
                materiaTxt.setText(R.string.ingles);
                break;




        }

    }
}
