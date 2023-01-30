/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

/**
 *
 * @author lesly
 */
public class ProductosLimpieza {
   
  private String tipo;
  private String marca;
  private String codigo;
  private double precio;
  private int cantidadInventario;
  private String proveedor;
  private String nombreProducto;

  public ProductosLimpieza(String tipo, String marca, String codigo, double precio, int cantidadInventario, String proveedor, String nombreProducto) {
    this.tipo = tipo;
    this.marca = marca;
    this.codigo = codigo;
    this.precio = precio;
    this.cantidadInventario = cantidadInventario;
    this.proveedor = proveedor;
    this.nombreProducto = nombreProducto;
  }

  public String getTipo() {
    return tipo;
  }

  public String getMarca() {
    return marca;
  }

  public String getCodigo() {
    return codigo;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidadInventario() {
    return cantidadInventario;
  }

  public String getProveedor() {
    return proveedor;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }
}


