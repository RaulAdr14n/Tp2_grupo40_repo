package ar.edu.unju.fi.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ar.edu.unju.fi.model.Producto;
import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	@Autowired
	private List<Producto> listaproducto = new ArrayList<>();

	@GetMapping /*("/producto")*/
	public String mostrarFormularioAltaProducto(Model model) {
		model.addAttribute("producto", new Producto());
		return "nuevo_producto";
	}

	@PostMapping
	public String guardarProducto(@ModelAttribute("producto") @Valid Producto producto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "nuevo_producto";
		} else {
		listaproducto.add(producto);
		return "redirect:/producto/producto";
		}
	}

	@GetMapping("/lista")
	public String mostrarListaProductos(Model model) {
		model.addAttribute("productos", listaproducto);
		return "productos";
	}

}
