package com.example.plantilla_examen.View;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.plantilla_examen.Model.Listas;
import com.example.plantilla_examen.Model.DHospital;
import com.example.plantilla_examen.R;
import com.example.plantilla_examen.Repo.Repository;
import com.example.plantilla_examen.ViewModel.PrincipalRecyclerViewVM;


public class PrincipalRecyclerView extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public PrincipalRecyclerView() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PrincipalRecyclerView.
     */
    // TODO: Rename and change types and number of parameters
    public static PrincipalRecyclerView newInstance(String param1, String param2) {
        PrincipalRecyclerView fragment = new PrincipalRecyclerView();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view =inflater.inflate(R.layout.fragment_principal_recycler_view, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        PrincipalRecyclerViewVM adapter = new PrincipalRecyclerViewVM(Repository.getHospitales(getContext()));
        recyclerView.setAdapter(adapter);
        return view;
    }


}
