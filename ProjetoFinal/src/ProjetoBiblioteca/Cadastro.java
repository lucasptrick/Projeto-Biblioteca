package ProjetoBiblioteca;

import java.util.List;

public class Cadastro {
	private List<Aluno> alunosCadastrados;
	private List<Professor> professoresCadastrados;
	private List<UsuarioExterno> USCadastrados;
	private List<Funcionario> funcionario;
	
	public Cadastro(List<Aluno> alunosCadastrados, List<Professor> professoresCadastrados,
			List<UsuarioExterno> uSCadastrados, List<Funcionario> funcionario) {
		super();
		this.alunosCadastrados = alunosCadastrados;
		this.professoresCadastrados = professoresCadastrados;
		USCadastrados = uSCadastrados;
		this.funcionario = funcionario;
	}

	public List<Aluno> getAlunosCadastrados() {
		return alunosCadastrados;
	}

	public void setAlunosCadastrados(List<Aluno> alunosCadastrados) {
		this.alunosCadastrados = alunosCadastrados;
	}

	public List<Professor> getProfessoresCadastrados() {
		return professoresCadastrados;
	}

	public void setProfessoresCadastrados(List<Professor> professoresCadastrados) {
		this.professoresCadastrados = professoresCadastrados;
	}

	public List<UsuarioExterno> getUSCadastrados() {
		return USCadastrados;
	}

	public void setUSCadastrados(List<UsuarioExterno> uSCadastrados) {
		USCadastrados = uSCadastrados;
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}
	
	
	
	
	
	
}
