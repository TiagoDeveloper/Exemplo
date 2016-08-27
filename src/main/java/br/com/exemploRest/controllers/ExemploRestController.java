package br.com.exemploRest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.exemploRest.model.Cliente;

@Controller
@RequestMapping("exemploRest")
public class ExemploRestController {


	
	@RequestMapping("compra")
	public String compra(Cliente cliente){
		System.out.println(cliente.getId()+" - "+cliente.getNome());
		return "compra/compra";
	}
	
	@RequestMapping("venda")
	public String venda(Cliente cliente){
		System.out.println(cliente.getId()+" - "+cliente.getNome());
		return "venda/venda";
	}
	
	@RequestMapping("reclamacao")
	public String reclamacao(Cliente cliente){
		System.out.println(cliente.getId()+" - "+cliente.getNome());
		return "reclamacao/reclamacao";
	}
}
