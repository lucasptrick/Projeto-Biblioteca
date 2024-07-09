package ProjetoBiblioteca;

import ClasseLivro.Livro;

public class Administrador extends Funcionario {

	public Administrador() {
		super();
	}

	public Administrador(String nome, int idade, int cpf, String endereco, String telefone, String email, String cargo, double salario) {
		super(nome, idade, cpf, endereco, telefone, email, cargo, salario);
	}
	public void adicionarFuncionario(Funcionario funcionario) {
		System.out.println("Funcionario: "+funcionario.getNome()+" adicionado!");
	}
	public void removerFuncionario(Funcionario funcionario) {
		System.out.println("Funcionario: "+funcionario.getNome()+" removido!");
	}
	public Livro adicionarLivro(Livro livro) {
		System.out.println("Livro: "+livro.getTitulo()+" adicionado!");
		return livro;
	}
	public Livro removerLivro(Livro livro) {
		System.out.println("Livro:"+livro.getTitulo()+" removido!");
		return livro;
	}
}
