package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class fragment_prueba_C extends Fragment {


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_prueba,container,false);

        ListView lv = view.findViewById(R.id.lvNombres);
        AdaptadorPrueba adaptadorPrueba = new AdaptadorPrueba(getNombres(),getContext());

        lv.setAdapter(adaptadorPrueba);

        return view;
    }

    private ArrayList<EntidadNombre> getNombres() {

        ArrayList<EntidadNombre> nombres = new ArrayList<EntidadNombre>();

        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Juan"));
        nombres.add(new EntidadNombre("roberto"));
        nombres.add(new EntidadNombre("Vic"));
        nombres.add(new EntidadNombre("Tu"));
        nombres.add(new EntidadNombre("11"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Juan"));
        nombres.add(new EntidadNombre("roberto"));
        nombres.add(new EntidadNombre("Vic"));
        nombres.add(new EntidadNombre("Tu"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("333"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Juan"));
        nombres.add(new EntidadNombre("roberto"));
        nombres.add(new EntidadNombre("Vic"));
        nombres.add(new EntidadNombre("Tu"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("333"));
        nombres.add(new EntidadNombre("33333rto"));
        nombres.add(new EntidadNombre("2222c"));
        nombres.add(new EntidadNombre("11"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Juan"));
        nombres.add(new EntidadNombre("roberto"));
        nombres.add(new EntidadNombre("Vic"));
        nombres.add(new EntidadNombre("Tu"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("Pedro"));
        nombres.add(new EntidadNombre("333"));
        nombres.add(new EntidadNombre("33333rto"));
        nombres.add(new EntidadNombre("2222c"));
        nombres.add(new EntidadNombre("11"));

        return nombres;


    }
}
