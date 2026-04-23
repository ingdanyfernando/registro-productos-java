package com.tuusuario.registroproductos.modelo;


public class Producto {
private String nombre;
private double precio;
private int stock;


    public Producto(String nombre, double precio, int stock) {
        if(nombre == null || nombre.isEmpty())
            throw new IllegalArgumentException("el nombre es OBLIGATORIO");
        this.nombre = nombre;
        
        if(precio<0)
            throw new IllegalArgumentException("No se aceptan valores NEGATIVSO");
        this.precio = precio;
            
        if(stock < 0)
            throw new IllegalArgumentException("Stok no puede ser NEGATIVO");
            
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
    
    public boolean hayStock()
    {
       return  stock > 0; 
    }
    
    

    
}
