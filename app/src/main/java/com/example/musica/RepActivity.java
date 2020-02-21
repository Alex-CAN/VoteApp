package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rep);


    }

    public void showCandidate(View view) {

        Intent candidateView = new Intent(this, CandActivity.class);
        candidateView.putExtra("party", "Republican");

        switch(view.getId()){
            case R.id.weld:
                candidateView.putExtra("name", "Weld");
                candidateView.putExtra("about", "Stuff about Weld");
                candidateView.putExtra("img", R.drawable.weld);

                this.startActivity(candidateView);
                break;
        case R.id.trump:
                candidateView.putExtra("name", "Donald Trump");
                candidateView.putExtra("party", "Republican");
                candidateView.putExtra("about", "Stuff about Donald Trump");
                candidateView.putExtra("img", R.drawable.trump);

                this.startActivity(candidateView);
                break;

    }

    }
}
