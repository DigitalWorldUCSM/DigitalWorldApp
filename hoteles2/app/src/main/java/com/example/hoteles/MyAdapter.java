package com.example.hoteles;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;

    ArrayList<DataHoteles> list;

    public MyAdapter(Context context, ArrayList<DataHoteles> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        DataHoteles datohotel = list.get(position);
        holder.Nombre.setText(datohotel.getNombre());
        holder.Direccion.setText(datohotel.getDireccion());
        holder.Habitacion.setText(datohotel.getHabitacion());
        holder.Precio.setText(datohotel.getPrecio());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static  class MyViewHolder extends RecyclerView.ViewHolder{
        TextView Nombre, Direccion, Habitacion, Precio;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            Nombre = itemView.findViewById(R.id.Nombre);
            Direccion = itemView.findViewById(R.id.Direccion);
            Habitacion = itemView.findViewById(R.id.Habitacion);
            Precio = itemView.findViewById(R.id.Precio);
        }
    }
}