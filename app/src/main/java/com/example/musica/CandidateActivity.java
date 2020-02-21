package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CandidateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);
    }

    public void demORepView(View view) {
        Intent demView = new Intent(this, repDemActivity.class);
        Intent repView = new Intent(this, RepActivity.class);

        if (view.getId() == R.id.dems) {
            startActivity(demView);
        }
        else if(view.getId() == R.id.reps){
            startActivity(repView);

        }
    }
}
