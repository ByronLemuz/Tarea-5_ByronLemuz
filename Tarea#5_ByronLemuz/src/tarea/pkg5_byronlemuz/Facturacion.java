/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;
 import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lesly
 */
public class Facturacion {
   
  private ArrayList<Producto> carrito = new ArrayList<Producto>();
  private double impuesto = 0.15;
  
  public void agregarProducto() {
    int idProducto = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el ID del producto:"));
    Producto producto = Producto.buscarProducto(idProducto);
    if (producto != null) {
      int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad a comprar:"));
      if (cantidad <= producto.getCantidad()) {
        producto.setCantidad(producto.getCantidad() - cantidad);
        carrito.add(producto);
        JOptionPane.showMessageDialog(null, "Producto agregado al carrito");
      } else {
        JOptionPane.showMessageDialog(null, "No hay suficiente cantidad en inventario");
      }
    } else {
      JOptionPane.showMessageDialog(null, "Producto no encontrado");
    }
  }
  
  public void mostrarFactura() {
    double total = 0;
    for (Producto producto : carrito) {
      total += producto.getPrecio() * producto.getCantidad();
    }
    double impuesto = total * this.impuesto;
    total += impuesto;
    JOptionPane.showMessageDialog(null, "Lista de productos comprados:\n" + carrito +
                                  "\nImpuesto sobre venta: $" + impuesto +
                                  "\nTotal a pagar: $" + total);
  }
}



