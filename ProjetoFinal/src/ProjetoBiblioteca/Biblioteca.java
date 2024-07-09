package ProjetoBiblioteca;

import java.util.List;

import ClasseLivro.Livro;

public class Biblioteca {
	private String nome;
	private String endereco;
	private List<Livro> livrosDisponiveis;
	private Cadastro userCadastrado;
	private Administrador administrador;
	private List<Emprestimo> emprestimos;
	
	public Biblioteca() {
		super();

	}

	public Biblioteca(String nome, String endereco, List<Livro> livrosDisponiveis, Cadastro userCadastrado,
			Administrador administrador, List<Emprestimo> emprestimos) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.livrosDisponiveis = livrosDisponiveis;
		this.userCadastrado = userCadastrado;
		this.administrador = administrador;
		this.emprestimos = emprestimos;
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
	public List<Livro> getLivrosDisponiveis() {
		return livrosDisponiveis;
	}
	public void setLivrosDisponiveis(List<Livro> livrosDisponiveis) {
		this.livrosDisponiveis = livrosDisponiveis;
	}
	public Cadastro getUserCadastrado() {
		return userCadastrado;
	}
	public void setUserCadastrado(Cadastro userCadastrado) {
		this.userCadastrado = userCadastrado;
	}
	public Administrador getAdministrador() {
		return administrador;
	}
	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}
	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
	
	
}