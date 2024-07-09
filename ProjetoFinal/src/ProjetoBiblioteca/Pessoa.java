package ProjetoBiblioteca;

import ClasseLivro.Livro;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private int cpf;
	private String endereco;
	private String telefone;
	private String email;
	
	public Pessoa() {
		super();
	}
	
	public Pessoa(String nome, int idade, int cpf, String endereco, String telefone, String email) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
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

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract Livro realizarEmprestimo(Livro livro);
	public abstract void exibirInfo();
	
	
}
