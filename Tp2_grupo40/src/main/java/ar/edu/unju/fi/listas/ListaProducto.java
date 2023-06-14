package ar.edu.unju.fi.listas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import ar.edu.unju.fi.model.Producto;

/**
 * Clase que representa una lista de productos.
 */
@Component
public class ListaProducto {
    private List<Producto> productos;

    /**
     * Constructor de la clase ListaProducto.
     * Inicializa la lista de productos con algunos elementos de ejemplo.
     */
    public ListaProducto() {
        productos = new ArrayList<Producto>();
        productos.add(new Producto("Correa", 101, 150.0, "Artículo", 0, "Correa de nylon para perros"));
        productos.add(new Producto("Juguete para gatos", 102, 80.0, "Artículo", 10, "Juguete interactivo para gatos"));
        productos.add(new Producto("Alimento balanceado para perros", 201, 500.0, "Alimento", 15,
                "Alimento completo y equilibrado para perros"));
        productos.add(new Producto("Arena para gatos", 202, 200.0, "Artículo", 0, "Arena sanitaria para gatos"));
    }

    /**
     * Obtiene la lista de productos.
     * 
     * @return la lista de productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * Establece la lista de productos.
     * 
     * @param productos la lista de productos a establecer
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
