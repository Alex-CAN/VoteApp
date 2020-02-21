package com.example.musica;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class repDemActivity extends AppCompatActivity {

//    ListView candList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep_dem);
//        candList = findViewById(R.id.candidates);
//        Candidate joe = new Candidate("Joe Biden", "Democrat", R.drawable.ic_launcher_background);
//        Candidate bernie = new Candidate("Bernie Sanders", "Democrat", R.drawable.ic_launcher_background);
//        Candidate bloom = new Candidate("Bloomberg", "Democrat", R.drawable.ic_launcher_background);
//        Candidate gab = new Candidate("Gab", "Democrat", R.drawable.ic_launcher_background);
//        Candidate warren = new Candidate("Warren", "Democrat", R.drawable.ic_launcher_background);
//        Candidate khloe = new Candidate("Khloe", "Democrat", R.drawable.ic_launcher_background);
//        Candidate styer = new Candidate("Styer", "Democrat", R.drawable.ic_launcher_background);
//        Candidate butti = new Candidate("Butti", "Democrat", R.drawable.ic_launcher_background);
//        Candidate weld = new Candidate("Weld", "Republican", R.drawable.ic_launcher_background);
//        Candidate trump = new Candidate("Trump", "Republican", R.drawable.ic_launcher_background);
//
//        ArrayList<Candidate> cands = new ArrayList<>();
//        cands.add(joe);
//        cands.add(bernie);
//        cands.add(bloom);
//        cands.add(gab);
//        cands.add(warren);
//        cands.add(khloe);
//        cands.add(styer);
//        cands.add(butti);
//        cands.add(weld);
//        cands.add(trump);
//
//
//        CandAdapter adapter = new CandAdapter(this, R.layout.cand_row, cands);
//        candList.setAdapter(adapter);

//        if (party == "dems"){
//
//        }
//        else if (party == "reps"){
//
//        }


    }

    public void showCandidate(View view) {
        Intent candidateView = new Intent(this, CandActivity.class);

        switch(view.getId()){
            case R.id.biden:
                candidateView.putExtra("name", "Joe Biden");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Joe Biden");
                candidateView.putExtra("img", R.drawable.biden);
                this.startActivity(candidateView);
                break;
            case R.id.bloomberg:
                candidateView.putExtra("name", "Bloomberg");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Bloomberg");
                candidateView.putExtra("img", R.drawable.bloomberg);

                this.startActivity(candidateView);
                break;
            case R.id.butti:
                candidateView.putExtra("name", "Buttigieg");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Buttigieg");
                candidateView.putExtra("img", R.drawable.butti);

                this.startActivity(candidateView);
                break;
            case R.id.gab:
                candidateView.putExtra("name", "Gabbard");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Gabbard");
                candidateView.putExtra("img", R.drawable.gab);

                this.startActivity(candidateView);
                break;
            case R.id.khloe:
                candidateView.putExtra("name", "Klobachur");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Klobachur");
                candidateView.putExtra("img", R.drawable.khloe);

                this.startActivity(candidateView);
                break;
            case R.id.sanders:
                candidateView.putExtra("name", "Bernie Sanders");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Bernie Sanders");
                candidateView.putExtra("img", R.drawable.sanders);

                this.startActivity(candidateView);
                break;
            case R.id.styer:
                candidateView.putExtra("name", "Styer");
                candidateView.putExtra("party", "Democrat");
                candidateView.putExtra("about", "Stuff about Styer");
                candidateView.putExtra("img", R.drawable.styer);

                this.startActivity(candidateView);
                break;
    }
}
}
