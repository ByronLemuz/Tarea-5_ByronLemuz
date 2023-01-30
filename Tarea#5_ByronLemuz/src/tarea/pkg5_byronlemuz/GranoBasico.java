/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

/**
 *
 * @author lesly
 */
public class GranoBasico {
    
  private String nombre;
  private int cantidadQuintales;
  private double precio;
  private String unidadMedida;
  private String lugarProcedencia;

  public GranoBasico(String nombre, int cantidadQuintales, double precio, String unidadMedida, String lugarProcedencia) {
    this.nombre = nombre;
    this.cantidadQuintales = cantidadQuintales;
    this.precio = precio;
    this.unidadMedida = unidadMedida;
    this.lugarProcedencia = lugarProcedencia;
  }

  public String getNombre() {
    return nombre;
  }

  public int getCantidadQuintales() {
    return cantidadQuintales;
  }

  public double getPrecio() {
    return precio;
  }

  public String getUnidadMedida() {
    return unidadMedida;
  }

  public String getLugarProcedencia() {
    return lugarProcedencia;
  }
}


