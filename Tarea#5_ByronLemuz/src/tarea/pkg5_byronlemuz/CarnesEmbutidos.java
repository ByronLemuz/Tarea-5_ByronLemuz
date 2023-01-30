/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

/**
 *
 * @author lesly
 */
public class CarnesEmbutidos {
    
    private String lugarProcedencia;
    private int cantidadInventario;
    private String tipo;
    private float precio;
    
    public CarnesEmbutidos(String lugarProcedencia, int cantidadInventario, String tipo, float precio) {
        this.lugarProcedencia = lugarProcedencia;
        this.cantidadInventario = cantidadInventario;
        this.tipo = tipo;
        this.precio = precio;
    }
    
    public String getLugarProcedencia() {
        return lugarProcedencia;
    }
    
    public int getCantidadInventario() {
        return cantidadInventario;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public float getPrecio() {
        return precio;
    }
}


