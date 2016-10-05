package boletimescolar.info.boletimelavamosnos.view.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import boletimescolar.info.boletimelavamosnos.R;


public class RecylerViewAdapter2 extends RecyclerView.Adapter<RecylerViewAdapter2.RecyclerViewHolder> {

    //Arrays
    String[] materias2;
    Double[] notas2;
    String[] precisaTirar;

    public RecylerViewAdapter2(String[] materias2, String[] precisaTirar, Double[] notas2) {
        this.materias2 = materias2;
        this.notas2 = notas2;
        this.precisaTirar = precisaTirar;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_precisa_tirar, parent, false);
        RecyclerViewHolder recyclerViewHolder2 = new RecyclerViewHolder(view);

        return recyclerViewHolder2;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.materia2.setText(materias2[position]);
        holder.nota2.setText(String.valueOf(notas2[position]));
        holder.precisaTirar.setText(precisaTirar[position]);

    }


    @Override
    public int getItemCount() {
        return materias2.length;
    }

    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView materia2, nota2, precisaTirar;

        public RecyclerViewHolder(View view) {
            super(view);
            materia2 = (TextView) view.findViewById(R.id.materia2);
            nota2 = (TextView) view.findViewById(R.id.nota2);
            precisaTirar = (TextView) view.findViewById(R.id.precisaTirar);

        }

    }

}


