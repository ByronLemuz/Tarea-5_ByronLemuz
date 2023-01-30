/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

/**
 *
 * @author lesly
 */
public class FrutasVerduras {
    
    private float precio;
    private int cantidadInventario;
    private String categoria;
    
    public FrutasVerduras(float precio, int cantidadInventario, String categoria) {
        this.precio = precio;
        this.cantidadInventario = cantidadInventario;
        this.categoria = categoria;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public int getCantidadInventario() {
        return cantidadInventario;
    }
    
    public String getCategoria() {
        return categoria;
    }
}


