package com.example.threerecyclerviewinoneactivity.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.threerecyclerviewinoneactivity.Model.SupportModelClass;
import com.example.threerecyclerviewinoneactivity.R;

import java.util.ArrayList;

public class Sport_AdapterClass extends RecyclerView.Adapter<Sport_AdapterClass.ViewHolder> {
    ArrayList<SupportModelClass>SupportList;
    Context context;

    public Sport_AdapterClass(ArrayList<SupportModelClass> supportList, Context context) {
        SupportList = supportList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.sports_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SupportModelClass supportModelClass=SupportList.get(position);
        holder.SportImg.setImageResource(supportModelClass.getSportsImg());
        holder.SportText.setText(supportModelClass.getSportsText());


    }

    @Override
    public int getItemCount() {
        return SupportList.size();
    }
    public void filterList(ArrayList<SupportModelClass> filteredList) {
        SupportList =filteredList;
        notifyDataSetChanged();

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView SportText;
        ImageView SportImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            SportText=itemView.findViewById(R.id.textSport);
            SportImg=itemView.findViewById(R.id.ImgSport);


        }
    }
}
