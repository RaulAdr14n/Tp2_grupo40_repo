package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * Clase que representa un producto.
 */
@Component
public class Producto {
    private String nombre;
    private int codigo;
    private double precio;
    private String categoria;
    private int descuento;
    private String descripcion;

    /**
     * Constructor parametrizado de la clase Producto.
     *
     * @param nombre      el nombre del producto
     * @param codigo      el código del producto
     * @param precio      el precio del producto
     * @param categoria   la categoría del producto
     * @param descuento   el descuento aplicado al producto
     * @param descripcion la descripción del producto
     */
    public Producto(String nombre, int codigo, double precio, String categoria, int descuento, String descripcion) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.categoria = categoria;
        this.descuento = descuento;
        this.descripcion = descripcion;
    }

    /**
     * Constructor vacío de la clase Producto.
     */
    public Producto() {
    }

    /**
     * Obtiene el nombre del producto.
     *
     * @return el nombre del producto
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre el nombre del producto
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el código del producto.
     *
     * @return el código del producto
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del producto.
     *
     * @param codigo el código del producto
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return el precio del producto
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio el precio del producto
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la categoría del producto.
     *
     * @return la categoría del producto
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * Establece la categoría del producto.
     *
     * @param categoria la categoría del producto
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * Obtiene el descuento aplicado al producto.
     *
     * @return el descuento aplicado al producto
     */
    public int getDescuento() {
        return descuento;
    }

    /**
     * Establece el descuento aplicado al producto.
     *
     * @param descuento el descuento aplicado al producto
     */
    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    /**
     * Obtiene la descripción del producto.
     *
     * @return la descripción del producto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del producto.
     *
     * @param descripcion la descripción del producto
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Calcula el precio del producto con el descuento aplicado.
     *
     * @return el precio del producto con el descuento aplicado
     */
    public double calcularDescuento() {
        double precioConDescuento = precio;

        if (descuento > 0 && descuento <= 50) {
            double descuentoPorcentaje = descuento / 100.0;
            precioConDescuento = precio - (precio * descuentoPorcentaje);
        }

        return precioConDescuento;
    }

    /**
     * Obtiene el identificador del producto.
     *
     * @return el identificador del producto
     */
    public int getId() {
        return 0;
    }
}
