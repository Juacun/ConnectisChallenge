package com.jpcode.model;

public class ProductoPorContenido extends Producto{
    
    private int contenido;

    public ProductoPorContenido() {
        super();
    }
    
    public ProductoPorContenido(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Contenido: " + this.contenido + "ml" + " /// " + "Precio: $" + this.precio;
    } 
}
