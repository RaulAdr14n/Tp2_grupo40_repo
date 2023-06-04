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

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private List<Producto> listaproducto = new ArrayList<>();

	@GetMapping
	public String mostrarFormularioAltaProducto(Model model) {
		model.addAttribute("producto", new Producto());
		return "nuevo_producto";
	}

	@PostMapping
	public String guardarProducto(@ModelAttribute("producto") Producto producto) {
		listaproducto.add(producto);
		return "redirect:/producto/lista";
	}

	@GetMapping("/lista")
	public String mostrarListaProductos(Model model) {
		model.addAttribute("productos", listaproducto);
		return "productos";
	}

}
