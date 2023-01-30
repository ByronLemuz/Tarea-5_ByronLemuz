
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tarea.pkg5_byronlemuz.Producto;
/**
 *
 * @author lesly
 */
public class Menu {
    

public class Main {
  
  static ArrayList<Producto> inventario = new ArrayList<>();
  static ArrayList<Producto> cesta = new ArrayList<>();
  
  public static void main(String[] args) {
    int opcion = 0;
    do {
      opcion = Integer.parseInt(JOptionPane.showInputDialog(
        "1. Agregar Producto\n" +
        "2. Modificar Producto\n" +
        "3. Eliminar Producto\n" +
        "4. Simulación de Facturación\n" +
        "5. Reporte\n" +
        "Seleccione una opción: "
      ));
      switch (opcion) {
        case 1: agregarProducto(); break;
        case 2: modificarProducto(); break;
        case 3: eliminarProducto(); break;
        case 4: simularFacturacion(); break;
        case 5: generarReporte(); break;
        case 6: JOptionPane.showMessageDialog(null, "Hasta pronto!"); break;
        default: JOptionPane.showMessageDialog(null, "Opción no válida"); break;
      }
    } while (opcion != 6);
  }
  
  static void agregarProducto() {
    // Código para agregar producto al inventario
  }
  
  static void modificarProducto() {
    if (inventario.isEmpty()) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    // Código para modificar producto en el inventario
  }
  
  static void eliminarProducto() {
    if (inventario.isEmpty()) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    // Código para eliminar producto en el inventario
  }
  
  static void simularFacturacion() {
    if (inventario.isEmpty()) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    // Código para simular la facturación
  }
  
  static void generarReporte() {
    if (inventario.isEmpty()) {
      JOptionPane.showMessageDialog(null, "No hay productos en el inventario");
      return;
    }
    // Código para generar el reporte
  }
}

}
