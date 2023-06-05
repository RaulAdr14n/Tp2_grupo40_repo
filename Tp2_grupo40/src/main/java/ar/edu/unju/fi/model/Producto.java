package ar.edu.unju.fi.model;

import org.springframework.stereotype.Component;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

@Component
public class Producto {
	@NotEmpty(message="Es obligatorio que coloque nombre al producto")
	@Size(min=5, max=72, message="El nombre si o si debe contener entre 5 y 72 caracteres, (incluidos los espacios)")
	private String nombre;
	@PositiveOrZero(message="El codigo de barras no debe contener un numero negativo")
	private long codigo;
	@Positive(message="El precio no debe ser negativo")
	@Min(value = 1, message = "El precio no puede ser inferior a uno")
	@Max(value = 100000, message = "No trabajamos con productos que solo se vendan a precio dolar")
	@NotEmpty(message = "No debe dejar en blanco el espacio para colocar el precio de su producto")
	private double precio;
	@NotBlank(message = "Complete el espacio con una categoria porfavor")
	private String categoria;
	private int descuento;
	@NotBlank(message = "Complete el espacio con una descripcion porfavor")
	private String descripcion;


	// Constructor parametrizado
	public Producto(String nombre, int codigo, double precio, String categoria, int descuento, String descripcion) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
		this.categoria = categoria;
		this.descuento = descuento;
		this.descripcion = descripcion;
	}

	// Constructor vacío
	public Producto() {
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	// Método para calcular el descuento del producto
	public double calcularDescuento() {
		double precioConDescuento = precio;

		if (descuento > 0 && descuento <= 50) {
			double descuentoPorcentaje = descuento / 100.0;
			precioConDescuento = precio - (precio * descuentoPorcentaje);
		}

		return precioConDescuento;
	}
}
