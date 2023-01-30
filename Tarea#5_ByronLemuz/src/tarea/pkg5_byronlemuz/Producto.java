/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tarea.pkg5_byronlemuz;

import java.util.ArrayList;

/**
 *
 * @author lesly
 */
public interface Producto {

  
    public static Producto buscarProducto(int Producto);

   
    String getNombre();
    int getCantidad();
    double getPrecio();

    public Object getCodigo();

    public void setNombre(String nombre);

    public void setPrecio(double parseDouble);

    public void setCantidad(int i);

    
}





