package br.com.exemploRest.model;

public class Cliente {

	private Long id;
	private String nome;
	private TipoCliente tipo;

	public Cliente() {

	}

	public Cliente(Long id, String nome, TipoCliente tipo) {
		this.id = id;
		this.nome = nome;
		this.tipo = tipo;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipo;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", tipo=" + tipo + "]";
	}

}
