package com.example.plantilla_examen.Model;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static ArrayList<Hospital> hList(){
        ArrayList<Hospital> listaH = new ArrayList<Hospital>();

        Hospital h1 = new Hospital(1,"sant pau");
        Hospital h2 = new Hospital(2,"sant pere");

        listaH.add(h1);
        listaH.add(h2);
        return listaH;

    }
}
