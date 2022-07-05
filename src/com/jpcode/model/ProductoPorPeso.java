package com.jpcode.model;

public class ProductoPorPeso extends Producto{
    
    private String unidadDeVenta;

    public ProductoPorPeso() {
        super();
    }
    
    public ProductoPorPeso(String nombre, int precio, String unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
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
    
    public String getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(String unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " /// " + "Precio: $" + this.precio + " /// " + "Unidad de Venta: " + this.unidadDeVenta ;
    }  
}
