package model;

public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private int cep;
    private int telefone;
    private String email;
    
	public Cliente(int id, String nome, String endereco, int cep, int telefone, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.cep = cep;
		this.telefone = telefone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
  
   
}
