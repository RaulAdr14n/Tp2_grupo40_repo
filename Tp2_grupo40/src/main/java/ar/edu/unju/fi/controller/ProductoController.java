package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
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
    @PostMapping
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
}
