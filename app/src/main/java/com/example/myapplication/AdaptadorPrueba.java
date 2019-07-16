package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.ArrayList;

public class AdaptadorPrueba extends BaseAdapter {

    private ArrayList<EntidadNombre> listaNombres;
    private Context context ;

    public AdaptadorPrueba(ArrayList<EntidadNombre> listaNombres, Context context) {
        this.listaNombres = listaNombres;
        this.context = context;
    }

    @Override
    public int getCount() {
        return listaNombres.size();
    }

    @Override
    public Object getItem(int i) {
        return listaNombres.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        EntidadNombre entidadNombre = (EntidadNombre) getItem(i);

        view = LayoutInflater.from(context).inflate(R.layout.item_nombre,null);
        TextView txtV = view.findViewById(R.id.txt_nombre);
        txtV.setText(entidadNombre.getNombre());
        return view;
    }
}
