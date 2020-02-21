package com.example.musica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CandActivity extends AppCompatActivity {
    private TextView name;
    private TextView party;
    private ImageView pic;
    private TextView about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cand);


        name = findViewById(R.id.name);
        party = findViewById(R.id.party);
        pic = findViewById(R.id.pic);
        about = findViewById(R.id.about);

        Bundle bundle = getIntent().getExtras();

        String nameString = bundle.getString("name");
        String partyString = bundle.getString("party");
        String aboutString = bundle.getString("about");
        int picInt = bundle.getInt("img");

        name.setText(nameString);
        party.setText(partyString);
        about.setText(aboutString);
        pic.setImageResource(picInt);
    }
}
