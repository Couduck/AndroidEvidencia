package com.example.puntodeventa_11;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import com.example.puntodeventa_11.classes.CatalogoOnlineCustomAdapter;
import com.example.puntodeventa_11.classes.ProductoCatalogo;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Catalogo_Online#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Catalogo_Online extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    ListView lista;
    EditText editName, editDate;
    ImageButton btnAdd;
    private int day, month, year;
    ArrayList<ProductoCatalogo> listItems;
    CatalogoOnlineCustomAdapter adapter;


    public Catalogo_Online() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Catalogo_Online.
     */
    // TODO: Rename and change types and number of parameters
    public static Catalogo_Online newInstance(String param1, String param2) {
        Catalogo_Online fragment = new Catalogo_Online();
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

        View v = inflater.inflate(R.layout.fragment_catalogo__online, container, false);

        listItems = new ArrayList<ProductoCatalogo>();

        String[] nombres = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
        String[] precios = {"$200", "$100", "$300", "$400", "$750"};
        String[] descripciones = {"Descripcion 1", "Descripcion 2", "Descripcion 3", "Descripcion 4", "Descripcion 5"};

        for(int i = 0; i < nombres.length; i++)
        {
            listItems.add(new ProductoCatalogo(nombres[i], precios[i], descripciones[i]));
        }


        lista = (ListView) v.findViewById(R.id.listaCatalogo);
        adapter = new CatalogoOnlineCustomAdapter(getActivity().getApplicationContext(), R.layout.item_list_catalogo_online, listItems);
        lista.setAdapter(adapter);

        return v ;
    }
}