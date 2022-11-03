package com.example.examgrader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MyVH> {

    Context context;
    ArrayList<DatosExamen> list;

    public RVAdapter(Context context, ArrayList<DatosExamen> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false);
        return new MyVH(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVH holder, int position) {

        DatosExamen datosExamen = list.get(position);
        holder.txtname.setText(datosExamen.getNombre_examen());
        holder.txtsubject.setText(datosExamen.getNombre_materia());
        holder.txtopciones.setText(datosExamen.getNum_opciones());
        holder.txtpreguntas.setText(datosExamen.getNum_preguntas());
        holder.txtbuenas.setText(Double.toString(datosExamen.getPntos_correcta()));
        holder.txtmalas.setText(Double.toString(datosExamen.getPntos_incorrecta()));

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyVH extends RecyclerView.ViewHolder {

        TextView txtname, txtsubject, txtpreguntas, txtopciones, txtbuenas, txtmalas;

        public MyVH(@NonNull View itemView) {

            super(itemView);

            txtname = itemView.findViewById(R.id.txt_name);
            txtsubject = itemView.findViewById(R.id.txt_subject);
            txtpreguntas = itemView.findViewById(R.id.txt_preguntas);
            txtopciones =  itemView.findViewById(R.id.txt_opciones);
            txtbuenas = itemView.findViewById(R.id.txt_buenas);
            txtmalas = itemView.findViewById(R.id.txt_malas);


        }
    }


//    private Context context;
//    ArrayList<DatosExamen> list = new ArrayList<>();
//
//    public RVAdapter(Context ctx){
//        this.context = ctx;
//
//    }
//
//    public void  setItems (ArrayList<DatosExamen> examen){
//        list.addAll(examen);
//    }
//
//
//
//    @NonNull
//    @Override
//    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
////        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item, parent, false);
//        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, parent, false);
//        return new DatosExamenVH(view);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
//
//        DatosExamenVH vh = (DatosExamenVH) holder;
//        DatosExamen examen = list.get(position);
//        vh.txt_name.setText(examen.getNombre_materia());
//        vh.txt_subject.setText(examen.getNombre_materia());
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return list.size();
//    }
}
