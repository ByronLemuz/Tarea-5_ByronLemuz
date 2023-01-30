/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

import java.util.Date;

/**
 *
 * @author lesly
 */
public class Liquidos {
    private String categoria;
    private String empaque;
    private String tamanio;
    private String nombreProducto;
    private float precio;
    private Date fechaVencimiento;
    
    public Liquidos(String categoria, String empaque, String tamanio, String nombreProducto, float precio, Date fechaVencimiento) {
        this.categoria = categoria;
        this.empaque = empaque;
        this.tamanio = tamanio;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public String getEmpaque() {
        return empaque;
    }
    
    public String getTamanio() {
        return tamanio;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public float getPrecio() {
        return precio;
    }
    
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
}


