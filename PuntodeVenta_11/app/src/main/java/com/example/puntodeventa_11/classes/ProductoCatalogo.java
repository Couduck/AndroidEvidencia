package com.example.puntodeventa_11.classes;

import android.widget.ImageView;

public class ProductoCatalogo {

    ImageView imagenProducto;
    String nombreProducto;
    String precio;
    String descripcion;

    public ProductoCatalogo(String nombreProducto, String precio, String descripcion) {
        //this.imagenProducto = imagenProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public ImageView getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(ImageView imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
