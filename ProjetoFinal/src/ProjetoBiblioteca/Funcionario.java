package ProjetoBiblioteca;

import ClasseLivro.Livro;

public class Funcionario extends Pessoa {
	protected String cargo;
	protected double salario;

	public Funcionario() {
		super();

	}
	public Funcionario(String nome, int idade, int cpf, String endereco, String telefone, String email, String cargo, double salario) {
		super(nome, idade, cpf, endereco, telefone, email);
		this.cargo = cargo;
		this.salario = salario;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public Livro realizarEmprestimo(Livro livro) {
		System.out.println("Livro:"+livro.getTitulo()+" emprestado!");
		return livro;
	}
	@Override
	public void exibirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Informações do Funcionario");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("E-mail: "+getEmail());
		System.out.println("Cargo: "+getCargo());
		System.out.println("Salario: "+getSalario());
		System.out.println("-------------------------------------");
	}
	//Funcionalidade Especifica p/ a interface! 
	public String getInformacoes() {

		String informacoes = "Nome: " + getNome() + "\n";
		informacoes += "Idade: " + getIdade() + "\n";
		informacoes += "Endereço: " + getEndereco() + "\n";
		informacoes += "Telefone: " + getTelefone() + "\n";
		informacoes += "E-mail: " + getEmail() + "\n";
		informacoes += "Cargo: " + getCargo() + "\n";
		informacoes += "Salário: " + getSalario() + "\n";

		return informacoes;
	}

	public Livro adicionarLivro(Livro livro) {
		System.out.println("Livro :"+livro.getTitulo()+" adicionado!");
		return livro;
	}
	public Livro removerLivro(Livro livro) {
		System.out.println("Livro :"+livro.getTitulo()+" removido!");
		return livro;
	}

}