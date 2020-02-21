package com.example.musica;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

class CandAdapter extends ArrayAdapter<Candidate> {
    private Context context;
    int mRes;
//
//    public CandAdapter(@NonNull Context context, int resource, @NonNull List<Candidate> objects, Context context1) {
//        super(context, resource, objects);
//        this.context = context1;
//    }

    public CandAdapter(repDemActivity rda, int cand_row, ArrayList<Candidate> cands) {
        super(rda, cand_row, cands);
        context = rda;
        mRes= cand_row;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        String name = getItem(position).getName();
        String party = getItem(position).getParty();
        int img = getItem(position).getImg();

        Candidate candidate = new Candidate(name,party,img);

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(mRes, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.name);
        TextView tvParty = (TextView) convertView.findViewById(R.id.party);

        return convertView;


    }
}
