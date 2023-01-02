package com.example.threerecyclerviewinoneactivity.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.threerecyclerviewinoneactivity.Model.SupportModelClass;
import com.example.threerecyclerviewinoneactivity.Model.TeamModelClass;
import com.example.threerecyclerviewinoneactivity.R;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.ViewHolder> {
    @NonNull
    ArrayList<TeamModelClass>teamList;
    Context context;

    public TeamAdapter(@NonNull ArrayList<TeamModelClass> teamList, Context context) {
        this.teamList = teamList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.team_item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
   TeamModelClass teamModelClass=teamList.get(position);
   holder.ImgTeam.setImageResource(teamModelClass.getTeamImg());
    holder.textTeam.setText(teamModelClass.getTeamText1());
     holder.cardViewTeam.setBackgroundColor(Color.parseColor(teamModelClass.getColor()));
    }

    @Override
    public int getItemCount() {
        return teamList.size();
    }
    public void filterList2(ArrayList<TeamModelClass> filteredList2) {
        teamList = filteredList2;
        notifyDataSetChanged();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardViewTeam;
        TextView textTeam;
        ImageView ImgTeam;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardViewTeam=itemView.findViewById(R.id.cardTeam);
            textTeam=itemView.findViewById(R.id.textTeam1);
            ImgTeam=itemView.findViewById(R.id.ImgTeam);
        }
    }
}
