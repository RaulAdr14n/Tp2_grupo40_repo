package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controlador que gestiona las solicitudes relacionadas con las páginas del encabezado.
 */
@Controller
public class HeaderController {

    /**
     * Maneja la solicitud GET para la página de "Consejos".
     *
     * @return el nombre de la vista "consejos"
     */
    @RequestMapping(value = "/consejos", method = RequestMethod.GET)
    public String getConsejosPage() {
        return "consejos";
    }

    /**
     * Maneja la solicitud GET para la página de "Nuevo Producto".
     *
     * @return el nombre de la vista "nuevo_producto"
     */
    @RequestMapping(value = "/nuevo_producto", method = RequestMethod.GET)
    public String getNuevoProducto() {
        return "nuevo_producto";
    }

    /**
     * Maneja la solicitud GET para la página de "Productos".
     *
     * @return el nombre de la vista "productos"
     */
    @RequestMapping(value = "/productos", method = RequestMethod.GET)
    public String getProductosPage() {
        return "productos";
    }

    /**
     * Maneja la solicitud GET para la página de "Servicio".
     *
     * @return el nombre de la vista "servicio"
     */
    @RequestMapping(value = "/servicio", method = RequestMethod.GET)
    public String getServicioPage() {
        return "servicio";
    }

    /**
     * Maneja la solicitud GET para la página de "Sucursales".
     *
     * @return el nombre de la vista "sucursales"
     */
    @RequestMapping(value = "/sucursales", method = RequestMethod.GET)
    public String getSucursalesPage() {
        return "sucursales";
    }

    /**
     * Maneja la solicitud GET para la página de "Contáctanos".
     *
     * @return el nombre de la vista "contactanos"
     */
    @RequestMapping(value = "/contactanos", method = RequestMethod.GET)
    public String getContactanosPage() {
        return "contactanos";
    }

    /**
     * Maneja la solicitud GET para la página de "Índice".
     *
     * @return el nombre de la vista "index"
     */
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndexPage() {
        return "index";
    }
}
