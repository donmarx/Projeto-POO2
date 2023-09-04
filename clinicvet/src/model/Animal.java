package model;

public class Animal {
	private int id;
	private String nome;
	private int idade;
	private String peso;
	private String sexo;
	private int id_especie;
	private int id_cliente;
	
	public Animal(int id, String nome, String peso, String sexo, int id_especie, int id_cliente) {
		super();
		this.id = id;
		this.nome = nome;
		this.peso = peso;
		this.sexo = sexo;
		this.id_especie = id_especie;
		this.id_cliente = id_cliente;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getId_especie() {
		return id_especie;
	}

	public void setId_especie(int id_especie) {
		this.id_especie = id_especie;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}
	
	
	
	

}
