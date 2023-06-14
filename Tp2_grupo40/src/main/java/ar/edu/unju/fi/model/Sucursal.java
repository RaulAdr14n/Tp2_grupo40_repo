package ar.edu.unju.fi.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
public class Sucursal {
    private Integer identificador; // Identificador único para la sucursal
    private String nombre; // Nombre de la sucursal
    private String direccion; // Dirección física de la sucursal
    private String ciudad; // Ciudad donde se encuentra la sucursal
    private String telefono; // Número de teléfono de la sucursal
    private String correoElectronico; // Dirección de correo electrónico de la sucursal
    private String horarioAtencion; // Horario de atención de la sucursal
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaApertura; // Fecha en que se abrió la sucursal

    public Sucursal() {
        // Constructor vacío requerido por Spring
    }

    public Sucursal(Integer identificador, String nombre, String direccion, String ciudad, String telefono,
            String correoElectronico, String horarioAtencion,
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaApertura) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.horarioAtencion = horarioAtencion;
        this.fechaApertura = fechaApertura;
    }
    
    // Getters y Setters

    public Integer getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Integer identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getHorarioAtencion() {
        return horarioAtencion;
    }

    public void setHorarioAtencion(String horarioAtencion) {
        this.horarioAtencion = horarioAtencion;
    }

    public Date getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(Date fechaApertura) {
        this.fechaApertura = fechaApertura;
    }
}
