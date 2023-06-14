package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 * Controlador que gestiona las solicitudes relacionadas con los productos.
 */
@Controller
@RequestMapping("/producto")
public class ProductoController {

	@Autowired
	private List<Producto> listaproducto = new ArrayList<>();

	/**
	 * Maneja la solicitud GET para mostrar el formulario de alta de productos.
	 *
	 * @param model el modelo utilizado para enviar datos a la vista
	 * @return el nombre de la vista "nuevo_producto"
	 */
	@GetMapping
	public String mostrarFormularioAltaProducto(Model model) {
		model.addAttribute("producto", new Producto());
		return "nuevo_producto";
	}

	/**
	 * Maneja la solicitud POST para guardar un producto.
	 *
	 * @param producto el producto a guardar, obtenido del formulario
	 * @return una redirección a la lista de productos
	 */
    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute("producto") Producto producto) {
        listaproducto.add(producto);
        return "redirect:/producto/lista";
    }

	/**
	 * Maneja la solicitud GET para mostrar la lista de productos.
	 *
	 * @param model el modelo utilizado para enviar datos a la vista
	 * @return el nombre de la vista "productos"
	 */
	@GetMapping("/lista")
	public String mostrarListaProductos(Model model) {
		model.addAttribute("productos", listaproducto);
		return "productos";
	}
	/**
     * Maneja la solicitud GET para mostrar el formulario de edición de un producto existente.
     *
     * @param id     el ID del producto a editar
     * @param model  el modelo utilizado para enviar datos a la vista
     * @return el nombre de la vista "editar_producto"
     */
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEdicionProducto(@PathVariable("id") int id, Model model) {
        Producto producto = buscarProductoPorId(id);
        model.addAttribute("producto", producto);
        return "editar_producto";
    }

    /**
     * Maneja la solicitud POST para actualizar un producto existente.
     *
     * @param producto el producto a actualizar, obtenido del formulario
     * @return una redirección a la lista de productos
     */
    @PostMapping("/actualizar")
    public String actualizarProducto(@ModelAttribute("producto") Producto producto) {
        Producto productoExistente = buscarProductoPorId(producto.getId());
        if (productoExistente != null) {
            // Actualizar los datos del producto existente con los nuevos datos
            productoExistente.setNombre(producto.getNombre());
            productoExistente.setPrecio(producto.getPrecio());
            productoExistente.setCategoria(producto.getCategoria());
            productoExistente.setDescripcion(producto.getDescripcion());
        }
        return "redirect:/producto/lista";
    }

    /**
     * Maneja la solicitud GET para eliminar un producto.
     *
     * @param id el ID del producto a eliminar
     * @return una redirección a la lista de productos
     */
    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") int id) {
        Producto producto = buscarProductoPorId(id);
        if (producto != null) {
            listaproducto.remove(producto);
        }
        return "redirect:/producto/lista";
    }

    // ...

    private Producto buscarProductoPorId(int id) {
        for (Producto producto : listaproducto) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
}
