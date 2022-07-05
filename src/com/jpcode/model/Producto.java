package com.jpcode.model;

public abstract class Producto implements Comparable<Producto>{
    
    protected String nombre;
    protected int precio;
    
    public Producto(){
        super();
    }
    
    public Producto(String nombre, int precio) {
        super();
        this.nombre = nombre;
        this.precio = precio;
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

    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Precio: $" + this.precio;
    }
    
    @Override
    public int compareTo(Producto otroProducto) {
  
        return this.precio - otroProducto.precio;
    }
}