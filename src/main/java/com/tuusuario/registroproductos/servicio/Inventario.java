/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuusuario.registroproductos.servicio;
import com.tuusuario.registroproductos.modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmiranda
 */
public class Inventario {
    private List<Producto> productos;
    
    public Inventario()
    {
        productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto)
    {
        if (producto == null)
                throw new IllegalArgumentException("Debe agregar un producto");
        productos.add(producto);
    }
    
    public List<Producto> obtenerProductos()
    {
        return productos;
    }
    
    public Producto buscarPorNombre(String nombre)
    {
        for(Producto p : productos)
        {
           if( p.getNombre().equalsIgnoreCase(nombre))
               return p;
        }
        return null;
    }
    
    
}
