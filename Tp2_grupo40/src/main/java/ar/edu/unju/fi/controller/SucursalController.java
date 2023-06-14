package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.fi.listas.ListaSucursal;
import ar.edu.unju.fi.model.Sucursal;

/**
 * Controlador que maneja las operaciones relacionadas con las sucursales.
 */
@Controller
@RequestMapping("/sucursal")
public class SucursalController {

    private ListaSucursal listaSucursales = new ListaSucursal();

    /**
     * Maneja las solicitudes GET para mostrar la página de listado de sucursales.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "sucursales"
     */
    @GetMapping("/listado")
    public String getListaSucursalesPage(Model model) {
        model.addAttribute("sucursales", listaSucursales.getSucursales());
        return "sucursales";
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de creación de una nueva sucursal.
     * 
     * @param model el modelo utilizado para pasar los datos a la vista
     * @return la vista "nueva_sucursal"
     */
    @GetMapping("/nuevo")
    public String getNuevaSucursalPage(Model model) {
        boolean edicion = false;
        model.addAttribute("sucursal", new Sucursal());
        model.addAttribute("edicion", edicion);
        return "nueva_sucursal";
    }

    /**
     * Maneja las solicitudes POST para guardar una nueva sucursal.
     * 
     * @param sucursal el objeto Sucursal recibido del formulario
     * @return un objeto ModelAndView que redirige a la página de listado de sucursales
     */
    @PostMapping("/guardar")
    public ModelAndView guardarSucursal(@ModelAttribute("sucursal") Sucursal sucursal) {
        ModelAndView modelView = new ModelAndView("redirect:/sucursal/listado");
        listaSucursales.getSucursales().add(sucursal);
        modelView.addObject("sucursales", listaSucursales.getSucursales());
        return modelView;
    }

    /**
     * Maneja las solicitudes GET para mostrar la página de modificación de una sucursal existente.
     * 
     * @param model  el modelo utilizado para pasar los datos a la vista
     * @param nombre el nombre de la sucursal a modificar
     * @return la vista "nueva_sucursal"
     */
    @GetMapping("/modificar/{nombre}")
    public String getModificarSucursalPage(Model model, @PathVariable(value = "nombre") String nombre) {
        Sucursal sucursalEncontrada = new Sucursal();
        boolean edicion = true;
        for (Sucursal sucu : listaSucursales.getSucursales()) {
            if (sucu.getNombre().equals(nombre)) {
                sucursalEncontrada = sucu;
                break;
            }
        }
        model.addAttribute("sucursal", sucursalEncontrada);
        model.addAttribute("edicion", edicion);
        return "nueva_sucursal";
    }

    /**
     * Maneja las solicitudes POST para modificar una sucursal existente.
     * 
     * @param sucursal el objeto Sucursal recibido del formulario
     * @return un String que redirige a la página de listado de sucursales
     */
    @PostMapping("/modificar")
    public String modificarSucursal(@ModelAttribute("sucursal") Sucursal sucursal) {
        for (Sucursal sucu : listaSucursales.getSucursales()) {
            if (sucu.getNombre().equals(sucursal.getNombre())) {
                sucu.setIdentificador(sucursal.getIdentificador());
                sucu.setNombre(sucursal.getNombre());
                sucu.setDireccion(sucursal.getDireccion());
                sucu.setCiudad(sucursal.getCiudad());
                sucu.setTelefono(sucursal.getTelefono());
                sucu.setCorreoElectronico(sucursal.getCorreoElectronico());
                sucu.setHorarioAtencion(sucursal.getHorarioAtencion());
                sucu.setFechaApertura(sucursal.getFechaApertura());
                break;
            }
        }
        return "redirect:/sucursal/listado";
    }

    /**
     * Maneja las solicitudes GET para eliminar una sucursal existente.
     * 
     * @param nombre el nombre de la sucursal a eliminar
     * @return un String que redirige a la página de listado de sucursales
     */
    @GetMapping("/eliminar/{nombre}")
    public String eliminarSucursal(@PathVariable(value = "nombre") String nombre) {
        for (Sucursal sucu : listaSucursales.getSucursales()) {
            if (sucu.getNombre().equals(nombre)) {
                listaSucursales.getSucursales().remove(sucu);
                break;
            }
        }
        return "redirect:/sucursal/listado";
    }
}
