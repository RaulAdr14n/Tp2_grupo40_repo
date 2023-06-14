package ar.edu.unju.fi.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * Clase que representa un consejo.
 */
@Component
public class Consejo {
    // Atributos del consejo
    private String codigo;
    private String titulo;
    private String descripcion;
    private String autor;
    
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fecha;

    /**
     * Constructor vacío requerido por Spring.
     */
    public Consejo() {
        // Constructor vacío requerido por Spring
    }

    /**
     * Constructor de la clase Consejo.
     * 
     * @param codigo      el código del consejo
     * @param titulo      el título del consejo
     * @param descripcion la descripción del consejo
     * @param autor       el autor del consejo
     * @param fecha       la fecha del consejo
     */
    public Consejo(String codigo, String titulo, String descripcion, String autor,
            @DateTimeFormat(pattern = "dd-MM-yyyy") Date fecha) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.autor = autor;
        this.fecha = fecha;
    }

    // Getters and Setters

    /**
     * Obtiene el código del consejo.
     * 
     * @return el código del consejo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del consejo.
     * 
     * @param codigo el código del consejo a establecer
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene el título del consejo.
     * 
     * @return el título del consejo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del consejo.
     * 
     * @param titulo el título del consejo a establecer
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene la descripción del consejo.
     * 
     * @return la descripción del consejo
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del consejo.
     * 
     * @param descripcion la descripción del consejo a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el autor del consejo.
     * 
     * @return el autor del consejo
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del consejo.
     * 
     * @param autor el autor del consejo a establecer
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene la fecha del consejo.
     * 
     * @return la fecha del consejo
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha del consejo.
     * 
     * @param fecha la fecha del consejo a establecer
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
