package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaConsejo;
import ar.edu.unju.fi.model.Consejo;

/**
 * Controlador que maneja las operaciones relacionadas con los consejos.
 */
@Controller
@RequestMapping("/consejo")
public class ConsejoController {

    // Lista de consejos
    private ListaConsejo listaConsejos = new ListaConsejo();

    /**
     * Maneja las solicitudes GET para mostrar la página de listado de consejos.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "consejos"
     */
    @GetMapping("/listado")
    public String getListaConsejosPage(Model model) {
        // Agrega la lista de consejos al modelo
        model.addAttribute("consejos", listaConsejos.getConsejos());
        return "consejos";
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de creación de un nuevo consejo.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "nuevo_consejo"
     */
    @GetMapping("/nuevo")
    public String getNuevaConsejoPage(Model model) {
        boolean edicion = false;
        // Agrega un nuevo objeto Consejo al modelo
        model.addAttribute("consejo", new Consejo());
        // Agrega la bandera de edición al modelo
        model.addAttribute("edicion", edicion);
        return "nuevo_consejo";
    }

    /**
     * Maneja las solicitudes POST para guardar un nuevo consejo.
     * 
     * @param consejo el objeto Consejo recibido del formulario
     * @return un objeto ModelAndView que redirige a la página de listado de consejos
     */
    @PostMapping("/guardar")
    public ModelAndView guardarConsejo(@ModelAttribute("consejo") Consejo consejo) {
        ModelAndView modelView = new ModelAndView("redirect:/consejo/listado");
        // Agrega el nuevo consejo a la lista de consejos
        listaConsejos.getConsejos().add(consejo);
        // Agrega la lista de consejos al modelo
        modelView.addObject("consejos", listaConsejos.getConsejos());
        return modelView;
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de modificación de un consejo existente.
     * 
     * @param model  el modelo utilizado para pasar los datos a la vista
     * @param titulo el título del consejo a modificar
     * @return la vista "nuevo_consejo"
     */
    @GetMapping("/modificar/{titulo}")
    public String getModificarConsejoPage(Model model, @PathVariable(value = "titulo") String titulo) {
        Consejo consejoEncontrado = new Consejo();
        boolean edicion = true;
        // Busca el consejo con el título especificado en la lista de consejos
        for (Consejo conse : listaConsejos.getConsejos()) {
            if (conse.getTitulo().equals(titulo)) {
                consejoEncontrado = conse;
                break;
            }
        }
        // Agrega el consejo encontrado al modelo
        model.addAttribute("consejo", consejoEncontrado);
        // Agrega la bandera de edición al modelo
        model.addAttribute("edicion", edicion);
        return "nuevo_consejo";
    }

    /**
     * Maneja las solicitudes POST para modificar un consejo existente.
     * 
     * @param consejo el objeto Consejo recibido del formulario
     * @return un String que redirige a la página de listado de consejos
     */
    @PostMapping("/modificar")
    public String modificarConsejo(@ModelAttribute("consejo") Consejo consejo) {
        // Busca el consejo en la lista de consejos y actualiza sus atributos
        for (Consejo conse : listaConsejos.getConsejos()) {
            if (conse.getTitulo().equals(consejo.getTitulo())) {
                conse.setCodigo(consejo.getCodigo());
                conse.setTitulo(consejo.getTitulo());
                conse.setDescripcion(consejo.getDescripcion());
                conse.setAutor(consejo.getAutor());
                conse.setFecha(consejo.getFecha());
                break;
            }
        }
        return "redirect:/consejo/listado";
    }

    /**
     * Maneja las solicitudes GET para eliminar un consejo existente.
     * 
     * @param titulo el título del consejo a eliminar
     * @return un String que redirige a la página de listado de consejos
     */
    @GetMapping("/eliminar/{titulo}")
    public String eliminarConsejo(@PathVariable(value = "titulo") String titulo) {
        // Busca el consejo con el título especificado en la lista de consejos y lo elimina
        for (Consejo conse : listaConsejos.getConsejos()) {
            if (conse.getTitulo().equals(titulo)) {
                listaConsejos.getConsejos().remove(conse);
                break;
            }
        }
        return "redirect:/consejo/listado";
    }
}
