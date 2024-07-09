package ProjetoBiblioteca;

import ClasseLivro.Livro;

public class Professor extends Funcionario {
	private String disciplina;

	public Professor() {
		super();

	}


	public Professor(String nome, int idade, int cpf, String endereco, String telefone, String email, String cargo, double salario, String disciplina) {
		super(nome, idade, cpf, endereco, telefone, email, cargo, salario);
		this.disciplina=disciplina;
	}
	@Override
	public void exibirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Informações do Professor");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("E-mail: "+getEmail());
		System.out.println("Cargo: "+getCargo());
		System.out.println("Salario: "+getSalario());
		System.out.println("Disciplina: "+getDisciplina());
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
		informacoes += "Disciplina: " + getDisciplina() + "\n";

		return informacoes;
	}

	@Override
	public Livro realizarEmprestimo(Livro livro) {
		System.out.println("Livro: "+livro.getTitulo()+" emprestado!");
		return livro;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

}