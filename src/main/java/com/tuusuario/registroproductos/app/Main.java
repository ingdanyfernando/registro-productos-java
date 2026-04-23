/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tuusuario.registroproductos.app;
import com.tuusuario.registroproductos.modelo.Producto;
import com.tuusuario.registroproductos.servicio.Inventario;

/**
 *
 * @author dmiranda
 */
public class Main {
    public static void main(String[] args) {
      
        //CREAR UN INVENTARIO
        Inventario inventario = new Inventario();
        
      //AGREGAR TRES PRODUCTOS VALIDOS
        inventario.agregarProducto(new Producto("Teclado",150,10));
        inventario.agregarProducto(new Producto("Mouse",170,5));
        inventario.agregarProducto(new Producto("Monitor",1250,3));  
        
        //PROBAR UN PRODUCTO INVALIDO USANDO TRY CATCH
        try
        {
        inventario.agregarProducto(new Producto("Teclado",150,-1));
        }
        catch(Exception e)
        {
            System.out.println("El producto no es VALIDO..."+e);
        } 
        
          
        //LISTAR TODOS LOS PRODCUTOS
        if(inventario.obtenerProductos().isEmpty())
        {
            System.out.println("No hay productos ingresados");
            return;
        }
        for(Producto p : inventario.obtenerProductos())
                {
                  System.out.println("PRODUCTO: "+p.getNombre());
                  System.out.println("PRECIO: "+p.getPrecio());
                  System.out.println("STOCK:"+p.getStock());
                  System.out.println("-----------------------------------------");
                }
        
        //BUSCAR UN PRODUTO
       
       if(inventario.buscarPorNombre("Teclado")!=null)
           System.out.println("Producto Encontario");
       else
       System.out.println("Producto NO encontrado"); 
    }
   
         
       
}
