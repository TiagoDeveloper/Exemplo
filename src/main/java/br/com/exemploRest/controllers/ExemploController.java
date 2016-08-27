package br.com.exemploRest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.exemploRest.model.Cliente;
import br.com.exemploRest.model.TipoCliente;

@Controller
@RequestMapping("exemplo")
public class ExemploController {

	@RequestMapping("home")
	public String home(Cliente cliente, Model model) {

		model.addAttribute("tipos", TipoCliente.values());

		return "home";
	}

	@RequestMapping("tipo")
	public String objeto(Cliente cliente) {
	
		if (cliente.getTipo().equals(TipoCliente.COMPRA))
			return "forward:/exemploRest/compra";else
		if (cliente.getTipo().equals(TipoCliente.VENDA))
			return "forward:/exemploRest/venda";else
		if (cliente.getTipo().equals(TipoCliente.RECLAMAÇÃO))
			return "forward:/exemploRest/reclamacao";else
		return null;
	}
}
