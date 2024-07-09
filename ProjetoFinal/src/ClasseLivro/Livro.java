package ClasseLivro;

public class Livro {
	private String titulo;
	private String autor;
	private String tema;
	private int anoPublicacao;
	private String disponivel;
	
	public Livro() {
		super();
	}
	
	public Livro(String titulo, String autor, String tema, int anoPublicacao, String disponivel) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.tema = tema;
		this.anoPublicacao = anoPublicacao;
		this.setDisponivel(disponivel);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public String getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(String disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
