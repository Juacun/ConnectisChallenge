package com.jpcode;

import com.jpcode.model.Producto;
import com.jpcode.model.ProductoPorContenido;
import com.jpcode.model.ProductoPorLitro;
import com.jpcode.model.ProductoPorPeso;
import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        
        List<Producto> miLista = cargarListaProductos();
        
        imprimirListaProductos(miLista);
        ordenarListaProductos(miLista);
        System.out.println("Producto mas caro: " + miLista.get(miLista.size()-1).getNombre());
        System.out.println("Producto mas barato: " + miLista.get(0).getNombre());
        
    }
    
    public static List<Producto> cargarListaProductos(){
        
        List<Producto> listaProductos = new ArrayList<Producto>();
        
        listaProductos.add(new ProductoPorLitro("Coca-Cola Zero", 20, 1.5));
        listaProductos.add(new ProductoPorLitro("Coca-Cola", 18, 1.5));
        listaProductos.add(new ProductoPorContenido("Shampoo Sedal", 19, 500));
        listaProductos.add(new ProductoPorPeso("Frutillas", 64, "Kilo"));
        
        return listaProductos;
    }
    
    public static void ordenarListaProductos(List<Producto> listaDesordenada) {
        
        for (int i = 0; i < listaDesordenada.size() -1; i++) {
            
            if(listaDesordenada.get(i).compareTo(listaDesordenada.get(i+1)) > 0){
                
                Producto aux = listaDesordenada.get(i);
                listaDesordenada.set(i, listaDesordenada.get(i+1));
                listaDesordenada.set(i+1, aux);
            }
        }
    }
    
    public static void imprimirListaProductos(List<Producto> lista) {
        
        for (Producto producto : lista) {
            System.out.println(producto.toString());
        }
    }
}
