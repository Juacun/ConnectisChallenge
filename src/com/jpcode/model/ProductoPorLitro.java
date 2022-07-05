package com.jpcode.model;

public class ProductoPorLitro extends Producto {
    
    private double litros;

    public ProductoPorLitro() {
        super();
    }
    
    public ProductoPorLitro(String nombre, int precio, double litros) {
        super(nombre, precio);
        this.litros = litros;
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
    
    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }

    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Litros: " + this.litros + " /// " + "Precio: $" + this.precio;
    }
}
