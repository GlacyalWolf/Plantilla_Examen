package com.example.plantilla_examen.ViewModel;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.plantilla_examen.Model.Hospital;
import com.example.plantilla_examen.R;

import java.util.ArrayList;

public class PrincipalRecyclerViewVM extends RecyclerView.Adapter<PrincipalRecyclerViewVM.AdapterPrincipalRecycler> {
    static ArrayList<Hospital> hospitalList;
    //static NavController nv;

    public PrincipalRecyclerViewVM(ArrayList<Hospital> hospitalList /*NavController nv*/) {
        this.hospitalList= hospitalList;
        //this.nv=nv;
    }

    public static class AdapterPrincipalRecycler extends RecyclerView.ViewHolder {
        TextView card;
        public AdapterPrincipalRecycler(final View card_row) {
            super(card_row);
            card = card_row.findViewById(R.id.card);
        }
    }

    @Override
    public AdapterPrincipalRecycler onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.principal_recycler_view_card,viewGroup,false);
        AdapterPrincipalRecycler apr = new AdapterPrincipalRecycler(v);
        return apr;
    }

    @Override
    public void onBindViewHolder(AdapterPrincipalRecycler adapterPrincipalRecycler, int i) {
        adapterPrincipalRecycler.card.setText(hospitalList.get(i).getHospitalName());

    }

    @Override
    public int getItemCount() {
        return hospitalList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView rv){
        super.onAttachedToRecyclerView(rv);
    }




}