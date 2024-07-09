package ProjetoBiblioteca;

import ClasseLivro.Livro;

public class UsuarioExterno extends Pessoa{

	
	public UsuarioExterno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsuarioExterno(String nome, int idade, int cpf, String endereco, String telefone, String email) {
		super(nome, idade, cpf, endereco, telefone, email);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Livro realizarEmprestimo(Livro livro) {
		System.out.println("Livro: "+livro.getTitulo()+" emprestado!");
		return livro;
	}

	@Override
	public void exibirInfo() {
		System.out.println("-------------------------------------");
		System.out.println("Informações do Usúario");
		System.out.println("Nome: "+getNome());
		System.out.println("Idade: "+getIdade());
		System.out.println("Endereço: "+getEndereco());
		System.out.println("Telefone: "+getTelefone());
		System.out.println("E-mail: "+getEmail());	
		System.out.println("-------------------------------------");
	}

	
}
