package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeaderController {
	@RequestMapping(value = "/consejos", method = RequestMethod.GET)
	public String getConsejosPage(){
		return "consejos";
	}
	@GetMapping("/productos")
	public String getProductosPage(){
		return "productos";
	}
	@GetMapping("/servicio")
	public String getServicioPage(){
		return "servicio";
	}
	@GetMapping("/sucursales")
	public String getSucursalesPage(){
		return "sucursales";
	}
	@GetMapping("/contactanos")
	public String getContactanosPage(){
		return "contactanos";
	}
	@GetMapping("/index")
	public String getIndexPage(){
		return "index";
	}
	@GetMapping("/nuevo_producto")
	public String getNuevoProductoPage() {
		return "nuevo_producto";
	}
}
