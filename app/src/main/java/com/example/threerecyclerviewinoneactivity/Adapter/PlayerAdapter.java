package com.example.threerecyclerviewinoneactivity.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.threerecyclerviewinoneactivity.Model.PlayerModelClass;
import com.example.threerecyclerviewinoneactivity.Model.TeamModelClass;
import com.example.threerecyclerviewinoneactivity.R;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.ViewHolder> {
    @NonNull
    ArrayList<PlayerModelClass>playerList;
    Context context;

    public PlayerAdapter(@NonNull ArrayList<PlayerModelClass> playerList, Context context) {
        this.playerList = playerList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.player_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       PlayerModelClass playerModelClass=playerList.get(position);
       holder.PlayerText.setText(playerModelClass.getPlayerText1());
       holder.PlayerImg.setImageResource(playerModelClass.getPlayersImg());
    }

    @Override
    public int getItemCount() {
        return playerList.size();
    }
    public void filterList3(ArrayList<PlayerModelClass> filteredList3) {
        playerList = filteredList3;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView PlayerImg;
        TextView PlayerText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            PlayerImg=itemView.findViewById(R.id.ImgPlayer);
            PlayerText=itemView.findViewById(R.id.textplay1);


        }
    }
}
