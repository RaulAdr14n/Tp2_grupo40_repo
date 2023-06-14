package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaProducto;
import ar.edu.unju.fi.model.Producto;

/**
 * Controlador que maneja las operaciones relacionadas con los productos.
 */
@Controller
@RequestMapping("/producto")
public class ProductoController {

    private ListaProducto listaProductos = new ListaProducto();

    /**
     * Maneja las solicitudes GET para mostrar la página de listado de productos.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "productos"
     */
    @GetMapping("/listado")
    public String getListaProductosPage(Model model) {
        model.addAttribute("productos", listaProductos.getProductos());
        return "productos";
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de creación de un nuevo producto.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "nuevo_producto"
     */
    @GetMapping("/nuevo")
    public String getNuevoProductoPage(Model model) {
        boolean edicion = false;
        model.addAttribute("producto", new Producto());
        model.addAttribute("edicion", edicion);
        return "nuevo_producto";
    }

    /**
     * Maneja las solicitudes POST para guardar un nuevo producto.
     * 
     * @param producto el objeto Producto recibido del formulario
     * @return un objeto ModelAndView que redirige a la página de listado de productos
     */
    @PostMapping("/guardar")
    public ModelAndView guardarProducto(@ModelAttribute("producto") Producto producto) {
        ModelAndView modelView = new ModelAndView("redirect:/producto/listado");
        listaProductos.getProductos().add(producto);
        modelView.addObject("productos", listaProductos.getProductos());
        return modelView;
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de modificación de un producto existente.
     * 
     * @param model  el modelo utilizado para pasar los datos a la vista
     * @param nombre el nombre del producto a modificar
     * @return la vista "nuevo_producto"
     */
    @GetMapping("/modificar/{nombre}")
    public String getModificarProductoPage(Model model, @PathVariable(value = "nombre") String nombre) {
        Producto productoEncontrado = new Producto();
        boolean edicion = true;
        for (Producto prod : listaProductos.getProductos()) {
            if (prod.getNombre().equals(nombre)) {
                productoEncontrado = prod;
                break;
            }
        }
        model.addAttribute("producto", productoEncontrado);
        model.addAttribute("edicion", edicion);
        return "nuevo_producto";
    }

    /**
     * Maneja las solicitudes POST para modificar un producto existente.
     * 
     * @param producto el objeto Producto recibido del formulario
     * @return un String que redirige a la página de listado de productos
     */
    @PostMapping("/modificar")
    public String modificarProducto(@ModelAttribute("producto") Producto producto) {
        for (Producto prod : listaProductos.getProductos()) {
            if (prod.getNombre().equals(producto.getNombre())) {
                prod.setNombre(producto.getNombre());
                prod.setCodigo(producto.getCodigo());
                prod.setPrecio(producto.getPrecio());
                prod.setCategoria(producto.getCategoria());
                prod.setDescripcion(producto.getDescripcion());
                break;
            }
        }
        return "redirect:/producto/listado";
    }

    /**
     * Maneja las solicitudes GET para eliminar un producto existente.
     * 
     * @param nombre el nombre del producto a eliminar
     * @return un String que redirige a la página de listado de productos
     */
    @GetMapping("/eliminar/{nombre}")
    public String eliminarProducto(@PathVariable(value = "nombre") String nombre) {
        for (Producto prod : listaProductos.getProductos()) {
            if (prod.getNombre().equals(nombre)) {
                listaProductos.getProductos().remove(prod);
                break;
            }
        }
        return "redirect:/producto/listado";
    }
}
