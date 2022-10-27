package com.example.puntodeventa_11.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.puntodeventa_11.R;

import java.util.ArrayList;

public class CatalogoOnlineCustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<ProductoCatalogo> listaCatalogo = new ArrayList<ProductoCatalogo>();
    private int layout;

    public CatalogoOnlineCustomAdapter(Context context, int layout, ArrayList<ProductoCatalogo> lista)
    {
        this.context = context;
        this.layout = layout;
        this.listaCatalogo = lista;
    }

    @Override
    public int getCount() {
        return listaCatalogo.size();
    }

    @Override
    public ProductoCatalogo getItem(int i) {
       return this.listaCatalogo.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);

        View v = layoutInflater.inflate(R.layout.item_list_catalogo_online,null);

        TextView nombre = v.findViewById(R.id.Nombre);
        TextView precio = v.findViewById(R.id.Precio);
        TextView descripcion = v.findViewById(R.id.Descripcion);
        ImageView imagen = v.findViewById(R.id.Imagen);


        ProductoCatalogo producto = getItem(i);

        nombre.setText(producto.getNombreProducto());
        precio.setText(producto.getPrecio());
        descripcion.setText(producto.getDescripcion());
        imagen.setImageResource(R.drawable.producto_prueba);

        return v;
    }
}
