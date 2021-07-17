package com.example.hoteles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHotelesAdapter extends RecyclerView.Adapter<MyHotelesAdapter.ViewHolder> {

    MyHotelesData[] myHotelesData;
    Context context;
    public MyHotelesAdapter(MyHotelesData[] myHotelesData, HomeSistema activity) {
        this.myHotelesData = myHotelesData;
        this.context = activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.hoteles_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyHotelesData myHotelesDataList = myHotelesData[position];
        holder.textViewName.setText(myHotelesDataList.getHotelesName());
        holder.textViewdate.setText(myHotelesDataList.getHotelesData());
        holder.HotelImage.setImageResource(myHotelesDataList.getHotelesImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,myHotelesDataList.getHotelesName(),Toast.LENGTH_LONG).show();
            }
        });
    }
    @Override
    public int getItemCount() {

        return myHotelesData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView HotelImage;
        TextView textViewName;
        TextView textViewdate;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            HotelImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewdate = itemView.findViewById(R.id.textdate);


        }
    }
}
