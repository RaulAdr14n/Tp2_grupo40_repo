package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

/**
 * Clase que representa un servicio.
 */
@Component
public class Servicio {
    private String codigo;
    private String nombre;
    private String descripcion;

    /**
     * Constructor parametrizado de la clase Servicio.
     *
     * @param codigo      el código del servicio
     * @param nombre      el nombre del servicio
     * @param descripcion la descripción del servicio
     */
    public Servicio(String codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    /**
     * Constructor vacío de la clase Servicio.
     */
    public Servicio() {
        // Constructor vacío requerido por Spring
    }

    /**
     * Obtiene el código del servicio.
     *
     * @return el código del servicio
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del servicio.
     *
     * @param codigo el código del servicio
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el nombre del servicio.
     *
     * @return el nombre del servicio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del servicio.
     *
     * @param nombre el nombre del servicio
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la descripción del servicio.
     *
     * @return la descripción del servicio
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del servicio.
     *
     * @param descripcion la descripción del servicio
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
