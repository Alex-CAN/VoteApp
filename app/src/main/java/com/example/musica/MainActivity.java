package com.example.musica;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView vote;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vote = findViewById(R.id.vote);
        Path path = new Path();
        path.arcTo(0f, 0f, 1000f, 1000f, 270f, -180f, true);
        ObjectAnimator animator = ObjectAnimator.ofFloat(vote, View.X, View.Y, path);
        animator.setDuration(2000);
        animator.start();

    }

    public void openCandidates(View view) {
        Intent candidateView = new Intent(this, CandidateActivity.class);
        this.startActivity(candidateView);
    }
}
