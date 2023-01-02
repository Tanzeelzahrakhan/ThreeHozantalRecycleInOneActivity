package com.example.threerecyclerviewinoneactivity.Activity;

import static com.example.threerecyclerviewinoneactivity.R.id.editSearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.threerecyclerviewinoneactivity.Adapter.PlayerAdapter;
import com.example.threerecyclerviewinoneactivity.Adapter.Sport_AdapterClass;
import com.example.threerecyclerviewinoneactivity.Adapter.TeamAdapter;
import com.example.threerecyclerviewinoneactivity.Model.PlayerModelClass;
import com.example.threerecyclerviewinoneactivity.Model.SupportModelClass;
import com.example.threerecyclerviewinoneactivity.Model.TeamModelClass;
import com.example.threerecyclerviewinoneactivity.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     RecyclerView RecyclerViewSport,RecyclerViewPlayer,RecyclerViewTeam;
     ArrayList<SupportModelClass>supportList=new ArrayList<>();
     Sport_AdapterClass sport_adapterClass;
     ArrayList<TeamModelClass>teamList=new ArrayList<>();
     TeamAdapter teamAdapter;
     ArrayList<PlayerModelClass>playerList=new ArrayList<>();
     PlayerAdapter playerAdapter;
    EditText editTextSearch;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextSearch=findViewById(editSearch);
        RecyclerViewSport=findViewById(R.id.RecyclerForSport);
        RecyclerViewPlayer=findViewById(R.id.RecyclerForPlayer);
        RecyclerViewTeam=findViewById(R.id.RecyclerForTeams);

        LinearLayoutManager linearLayoutManager1=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerViewSport.setLayoutManager(linearLayoutManager1);

        LinearLayoutManager linearLayoutManager2=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerViewTeam.setLayoutManager(linearLayoutManager2);

        LinearLayoutManager linearLayoutManager3=new LinearLayoutManager(MainActivity.this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerViewPlayer.setLayoutManager(linearLayoutManager3);

        supportList.add(new SupportModelClass(R.drawable.ic_football,"Football"));
        supportList.add(new SupportModelClass(R.drawable.ic_tennis,"Tennis"));
        supportList.add(new SupportModelClass(R.drawable.ic_hockey,"Hockey"));
        supportList.add(new SupportModelClass(R.drawable.ic_basketball,"Basketball"));
        supportList.add(new SupportModelClass(R.drawable.ic_emoji,"Smile Emoji"));
        supportList.add(new SupportModelClass(R.drawable.ic_videoplayer,"Video Player"));
        supportList.add(new SupportModelClass(R.drawable.ic_ball,"Badminton"));
        Sport_AdapterClass sport_adapterClass=new Sport_AdapterClass(supportList,MainActivity.this);
        RecyclerViewSport.setAdapter(sport_adapterClass);




        teamList.add(new TeamModelClass(R.drawable.paris,"Paris","#4d4dff"));
        teamList.add(new TeamModelClass(R.drawable.contry,"Bayern","#ff3333"));
        teamList.add(new TeamModelClass(R.drawable.boss,"Borussia","#d2ff4d"));
        teamList.add(new TeamModelClass(R.drawable.paris,"Paris","#4d4dff"));
        teamList.add(new TeamModelClass(R.drawable.pak,"Pakistan","#006600"));
        teamList.add(new TeamModelClass(R.drawable.iraaq,"Iraq","#b3d9ff"));
        teamList.add(new TeamModelClass(R.drawable.flagiran,"Iran","#d699ff"));
        TeamAdapter teamAdapter=new TeamAdapter(teamList,MainActivity.this);
        RecyclerViewTeam.setAdapter(teamAdapter);


      playerList.add(new PlayerModelClass(R.drawable.aa,"Tanzeel"));
      playerList.add(new PlayerModelClass(R.drawable.ii,"Muqdas"));
      playerList.add(new PlayerModelClass(R.drawable.ll,"Mehrab"));
      playerList.add(new PlayerModelClass(R.drawable.cc,"Alia"));
      playerList.add(new PlayerModelClass(R.drawable.dd,"Iqra"));
      playerList.add(new PlayerModelClass(R.drawable.ee,"Nimra"));
      playerList.add(new PlayerModelClass(R.drawable.ll,"Sana"));
      playerList.add(new PlayerModelClass(R.drawable.aa,"Fazeelat"));
      playerList.add(new PlayerModelClass(R.drawable.cc,"Zainab"));
        PlayerAdapter playerAdapter=new PlayerAdapter(playerList,MainActivity.this);
        RecyclerViewPlayer.setAdapter(playerAdapter);

     editTextSearch.addTextChangedListener(new TextWatcher() {
         @Override
         public void beforeTextChanged(CharSequence s, int start, int count, int after) {

         }

         @Override
         public void onTextChanged(CharSequence s, int start, int before, int count) {

         }

         @Override
         public void afterTextChanged(Editable s) {
                   filter(s.toString());
                   filter2(s.toString());
                   filter3(s.toString());

         }
     });

    }
    private void filter(String text){
        ArrayList<SupportModelClass>filterSportList=new ArrayList<>();
        for (SupportModelClass item:supportList){
        if (item.getSportsText().contains(text.toLowerCase())){
            filterSportList.add(item);
        }
        }
        sport_adapterClass.filterList(filterSportList);
    }
    private void filter2(String text){
        ArrayList<TeamModelClass>filterTeamtList=new ArrayList<>();
        for (TeamModelClass item:teamList){
            if (item.getTeamText1().contains(text.toLowerCase())){
                filterTeamtList.add(item);
            }
        }
        teamAdapter.filterList2(filterTeamtList);
    }
    private void filter3(String text){
        ArrayList<PlayerModelClass>filterPlayerList=new ArrayList<>();
        for (PlayerModelClass item:playerList){
            if (item.getPlayerText1().contains(text.toLowerCase())){
                filterPlayerList.add(item);
            }
        }
        playerAdapter.filterList3(filterPlayerList);
    }
}
  /*  private void filters(String text) {

        ArrayList<Sport_ModalClass> filteredList=new ArrayList<>();

        for (Sport_ModalClass item : SportList)
        {
            if (item.getSportText().contains(text.toLowerCase()))
            {
                filteredList.add(item);
            }
        }
        sportAdapter.filterList(filteredList);
    }*/