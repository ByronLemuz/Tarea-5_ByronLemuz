/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_byronlemuz;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author lesly
 */
public class Inventario {
   


  ArrayList<Producto> productos = new ArrayList<Producto>();

  public void modificarProducto() {
    if (productos.size() == 0) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    
    String codigo = JOptionPane.showInputDialog("Ingrese el código del producto a modificar");
    for (Producto p : productos) {
      if (p.getCodigo().equals(codigo)) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
        String precio = JOptionPane.showInputDialog("Ingrese el nuevo precio");
        p.setNombre(nombre);
        p.setPrecio(Double.parseDouble(precio));
        JOptionPane.showMessageDialog(null, "Producto modificado exitosamente");
        return;
      }
    }
    JOptionPane.showMessageDialog(null, "El producto no existe en el inventario");
  }
  
  public void eliminarProducto() {
    if (productos.size() == 0) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    
    String codigo = JOptionPane.showInputDialog("Ingrese el código del producto a eliminar");
    for (Producto p : productos) {
      if (p.getCodigo().equals(codigo)) {
        productos.remove(p);
        JOptionPane.showMessageDialog(null, "Producto eliminado exitosamente");
        return;
      }
    }
    JOptionPane.showMessageDialog(null, "El producto no existe en el inventario");
  }
  
  public void mostrarInforme() {
    if (productos.size() == 0) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    
    Collections.sort(productos);
    String informe = "";
    for (Producto p : productos) {
      informe += p.toString() + "\n";
    }
    JOptionPane.showMessageDialog(null, informe);
  }
}


