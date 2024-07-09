package ProjetoBiblioteca;

import ClasseLivro.Livro;
import ProjetoBiblioteca.AppInterface;

public class Aluno extends Pessoa {
	private String matricula;
	private String curso;
	
	public Aluno() {
		super();
	}
	
	public Aluno(String nome, int idade, int cpf, String endereco, String telefone, String email, String matricula, String curso) {
		super(nome, idade, cpf, endereco, telefone, email);
		this.matricula = matricula;
		this.curso = curso;
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public Livro realizarEmprestimo(Livro livro) {
		//Funcionalidade Especifica p/ a interface! 
		AppInterface app = new AppInterface();
		System.out.println("Livro: "+livro.getTitulo()+" emprestado!");
		app.displayText("Livro: "+livro.getTitulo()+" emprestado!");
		return livro;
	}

	@Override
	public void exibirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Informações do Aluno");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("E-mail: "+getEmail());
		System.out.println("Matricula: "+getMatricula());
		System.out.println("Curso: "+getCurso());
		System.out.println("-------------------------------------");
	}
	
	
	//Funcionalidade Especifica p/ a interface! 
	public String getInformacoes() {
	    
	    String informacoes = "Nome: " + getNome() + "\n";
	    informacoes += "Idade: " + getIdade() + "\n";
	    informacoes += "Endereço: " + getEndereco() + "\n";
	    informacoes += "Telefone: " + getTelefone() + "\n";
	    informacoes += "E-mail: " + getEmail() + "\n";
	    informacoes += "Matricula: " + getMatricula() + "\n";
	    informacoes += "Curso: " + getCurso() + "\n";

	    return informacoes;
	}


}