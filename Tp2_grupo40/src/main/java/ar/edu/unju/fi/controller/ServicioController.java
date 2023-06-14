package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaServicio;
import ar.edu.unju.fi.model.Servicio;

/**
 * Controlador que maneja las operaciones relacionadas con los servicios.
 */
@Controller
@RequestMapping("/servicio")
public class ServicioController {

    private ListaServicio listaServicios = new ListaServicio();

    /**
     * Maneja las solicitudes GET para mostrar la página de listado de servicios.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "servicios"
     */
    @GetMapping("/listado")
    public String getListaServiciosPage(Model model) {
        model.addAttribute("servicios", listaServicios.getServicios());
        return "servicios";
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de creación de un nuevo servicio.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "nuevo_servicio"
     */
    @GetMapping("/nuevo")
    public String getNuevoServicioPage(Model model) {
        boolean edicion = false;
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("edicion", edicion);
        return "nuevo_servicio";
    }

    /**
     * Maneja las solicitudes POST para guardar un nuevo servicio.
     * 
     * @param servicio el objeto Servicio recibido del formulario
     * @return un objeto ModelAndView que redirige a la página de listado de servicios
     */
    @PostMapping("/guardar")
    public ModelAndView guardarServicio(@ModelAttribute("servicio") Servicio servicio) {
        ModelAndView modelView = new ModelAndView("redirect:/servicio/listado");
        listaServicios.getServicios().add(servicio);
        modelView.addObject("servicios", listaServicios.getServicios());
        return modelView;
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de modificación de un servicio existente.
     * 
     * @param model  el modelo utilizado para pasar los datos a la vista
     * @param nombre el nombre del servicio a modificar
     * @return la vista "nuevo_servicio"
     */
    @GetMapping("/modificar/{nombre}")
    public String getModificarServicioPage(Model model, @PathVariable(value = "nombre") String nombre) {
        Servicio servicioEncontrado = new Servicio();
        boolean edicion = true;
        for (Servicio serv : listaServicios.getServicios()) {
            if (serv.getNombre().equals(nombre)) {
                servicioEncontrado = serv;
                break;
            }
        }
        model.addAttribute("servicio", servicioEncontrado);
        model.addAttribute("edicion", edicion);
        return "nuevo_servicio";
    }

    /**
     * Maneja las solicitudes POST para modificar un servicio existente.
     * 
     * @param servicio el objeto Servicio recibido del formulario
     * @return un String que redirige a la página de listado de servicios
     */
    @PostMapping("/modificar")
    public String modificarServicio(@ModelAttribute("servicio") Servicio servicio) {
        for (Servicio serv : listaServicios.getServicios()) {
            if (serv.getNombre().equals(servicio.getNombre())) {
                serv.setCodigo(servicio.getCodigo());
                serv.setNombre(servicio.getNombre());
                serv.setDescripcion(servicio.getDescripcion());
                break;
            }
        }
        return "redirect:/servicio/listado";
    }

    /**
     * Maneja las solicitudes GET para eliminar un servicio existente.
     * 
     * @param nombre el nombre del servicio a eliminar
     * @return un String que redirige a la página de listado de servicios
     */
    @GetMapping("/eliminar/{nombre}")
    public String eliminarServicio(@PathVariable(value = "nombre") String nombre) {
        for (Servicio serv : listaServicios.getServicios()) {
            if (serv.getNombre().equals(nombre)) {
                listaServicios.getServicios().remove(serv);
                break;
            }
        }
        return "redirect:/servicio/listado";
    }
}
