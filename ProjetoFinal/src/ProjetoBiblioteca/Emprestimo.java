package ProjetoBiblioteca;

import ClasseLivro.Livro;

public class Emprestimo {
	private Pessoa pessoa;
	private Livro livro;
	private String dataEmprestimo;
	private String dataDevolucao;
	
	
	public Emprestimo(Pessoa pessoa, Livro livro, String dataEmprestimo, String dataDevolucao) {
		super();
		this.pessoa = pessoa;
		this.livro = livro;
		this.dataEmprestimo = dataEmprestimo;
		this.dataDevolucao = dataDevolucao;
	}
	
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	public void setDataEmprestimo(String dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}
	public String getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	
	
	
}
