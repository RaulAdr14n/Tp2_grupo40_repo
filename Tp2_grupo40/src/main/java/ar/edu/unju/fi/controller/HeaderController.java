package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeaderController {
	@RequestMapping(value = "/consejos", method = RequestMethod.GET)
	public String getConsejosPage(){
		return "consejos";
	}
	@RequestMapping(value = "/productos", method = RequestMethod.GET)
	public String getProductosPage(){
		return "productos";
	}
	@RequestMapping(value = "/servicio", method = RequestMethod.GET)
	public String getServicioPage(){
		return "servicio";
	}
	@RequestMapping(value = "/sucursales", method = RequestMethod.GET)
	public String getSucursalesPage(){
		return "sucursales";
	}
	@RequestMapping(value = "/contactanos", method = RequestMethod.GET)
	public String getContactanosPage(){
		return "contactanos";
	}
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndexPage(){
		return "index";
	}
}
