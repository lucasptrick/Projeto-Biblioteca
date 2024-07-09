package ProjetoBiblioteca;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import ClasseLivro.Livro;

public class AppInterface extends JFrame {
	private JTextArea textArea;
	private JTextArea inputUser;
	
	public AppInterface() {
		setTitle("Biblioteca");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 500);
		setLayout(null);
		setLocationRelativeTo(null);
		
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea);
		scroll.setBounds(10, 10, 700, 400);
		add(scroll);
		
		inputUser = new JTextArea();
		inputUser.setBounds(10, 420, 800, 50);
		add(inputUser);
	}
	
	public void displayText(String text) {
		textArea.append(text + "\n");
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	public static void main(String[] args) {
		AppInterface app = new AppInterface();
		app.setVisible(true);

		// Livros
		Livro livroFantasia1 = new Livro("Harry Potter", "JK Rowling", "Fantasia", 1997, "Esgotado");
		Livro livroFantasia2 = new Livro("Percy Jackson", "Rick Riordan", "Fantasia", 2005, "Disponivel");
		Livro livroDistopia1 = new Livro("1984", "George Orwell", "Distopia", 1949, "Disponivel");
		Livro livroDistopia2 = new Livro("Admirável Mundo Novo", "Aldous Huxley", "Distopia", 1932, "Disponível");
		Livro livroTerror1 = new Livro("O Iluminado", "Stephen King", "Terror", 1977, "Disponível");
		Livro livroTerror2 = new Livro("It: A Coisa", "Stephen King", "Terror", 1986, "Disponivel");
		Livro livroRomance1 = new Livro("Orgulho e Preconceito", "Jane Austen", "Romance", 1813, "Disponível");
		Livro livroRomance2 = new Livro("Romeu e Julieta", "William Shakespeare", "Romance", 1597, "Disponivel");
		Livro livroFiccao1 = new Livro("1984", "George Orwell", "Ficção", 1949, "Disponível");
		Livro livroFiccao2 = new Livro("Duna", "Frank Herbert", "Ficção", 1965, "Esgotado");
		List<Livro> livros = new ArrayList<>();
		livros.add(livroFantasia1);
		livros.add(livroFantasia2);
		livros.add(livroDistopia1);
		livros.add(livroDistopia2);
		livros.add(livroTerror1);
		livros.add(livroTerror2);
		livros.add(livroRomance1);
		livros.add(livroRomance2);
		livros.add(livroFiccao1);
		livros.add(livroFiccao2);

		// Alunos
		Pessoa aluno01 = new Aluno("Renato", 15, 1111111, "Rua dos trouxas, N.1, Palmares, PE", "(81) 40028922", "AmoCoxinha@gmail.com", "MTR0111", "Médio");
		Pessoa aluno02 = new Aluno("Carlos", 17, 2222222, "Rua dos espertos, N.2, Ribeirão, PE", "(81) 22982004", "OdeioPastel@gmail.com", "MTR0222", "IPI");	
		Pessoa aluno03 = new Aluno("Patricia", 18, 4444444, "Quilombo P, N.77, Palmares, PE", "(81) 1414141414", "PatrikiaEstrela@gmail.com", "MTR0333", "Redes");
		Pessoa aluno04 = new Aluno("Ana", 17, 4444444, "Quilombo P, N.77, Palmares, PE", "(81) 1414141414", "AnaKonda@hotmail.com", "MTR0444", "ADS");
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add((Aluno) aluno01);
		alunos.add((Aluno) aluno02);
		alunos.add((Aluno) aluno03);
		alunos.add((Aluno) aluno04);

		// Professores
		Pessoa professor01 = new Professor("Rafaella", 31, 010101010, "Cafofo dos prof, N.001, Palmares, PE", "(81) 12121212121", "RafaelaSouza@gmail.com", "Professora", 4000, "Matematica");
		Pessoa professor02 = new Professor("Lucio", 28, 101010101, "Cafofo dos prof, N.002, Palmares, PE", "(81) 21212121212", "LucioRodrigues@gmail.com", "Professor", 3000, "História");
		List<Professor> professores = new ArrayList<Professor>();
		professores.add((Professor) professor01);
		professores.add((Professor) professor02);

		// Usuarios Externos
		Pessoa user01 = new UsuarioExterno("Harry", 14, 3333333, "Rua dos Alfeneiros, N.4, Little Whinging, SUR", "(810)1112131415 ", "MeSalvaSirius@gmail.com");
		List<UsuarioExterno> usersExternos = new ArrayList<UsuarioExterno>();
		usersExternos.add((UsuarioExterno) user01);

		// Administrador
		Pessoa adm = new Administrador("Lucas", 47, 00000000, "Cafofo dos prof, N.001, Palmares, PE", "(81) 181818181818", "LeitoraFuriosa@gmail.com", "Bibliotecaria", 2800);

		// Funcionarios
		Pessoa func1 = new Funcionario("João", 21, 454545454, "Alojamento dos funcionarios, N.1, Palmares, PE", "(81) 00099999", "FuncionariosBili@gmail.com", "Funcionario", 1800);
		Pessoa func2 = new Funcionario("Pedro", 19, 373737373, "Alojamento dos funcionarios, N.1, Palmares, PE", "(81) 0008888", "FuncionariosBili@gmail.com", "Funcionario", 1800);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add((Funcionario) func1);
		funcionarios.add((Funcionario) func2);
		funcionarios.add((Funcionario) adm);

		// Emprestimos
		Emprestimo emp1 = new Emprestimo(professor01, livroFiccao2, "12/06/2023", "14/06/2023");
		Emprestimo emp2 = new Emprestimo(professor02, livroFiccao1, "12/06/2023", "Ainda não devolvido");
		Emprestimo emp3 = new Emprestimo(user01, livroFiccao2, "02/05/2023", "Ainda não devolvido");
		List<Emprestimo> Emprestimos = new ArrayList<Emprestimo>();
		Emprestimos.add(emp1);
		Emprestimos.add(emp2);
		Emprestimos.add(emp3);

		// Cadastro
		Cadastro cadastrados = new Cadastro(alunos, professores, usersExternos, funcionarios);

		// Biblioteca
		Biblioteca Biblioteca1 = new Biblioteca("Prazeres", "Centro, N.34, Palmares, PE", livros, cadastrados, (Administrador) adm, Emprestimos); 

		// Menu Principal
		int opcao = 0;
		app.displayText("====== Bem-Vindo(a) a Biblioteca ======");
		while (opcao != 6) {
			app.displayText("=================================");
			app.displayText("	Menu");
			app.displayText("\n1. Lista de Livros da Biblioteca");
			app.displayText("2. Solicitar um emprestimo de um livro");
			app.displayText("3. Realizar uma devolução de um livro");
			app.displayText("4. Lista de Emprestimos");
			app.displayText("5. Outro");
			app.displayText("6. Sair");
			String opcao1 = JOptionPane.showInputDialog("Digite a opção desejada: ");
			
			if (ValidacaoInteiro(opcao1)) {
			    opcao = Integer.parseInt(opcao1);
			    
			    if (opcao == 1) {
			        // Código para a opção 1
			    	app.displayText("====== Confira a Lista dos nossos Livros ======");
					for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
						app.displayText("➜ Titulo: "+livrosD.getTitulo()+"\nAutor: "+livrosD.getAutor()+"\nAno de publicação: "+livrosD.getAnoPublicacao()+"\nTema: "+livrosD.getTema()+"\nSituação: "+livrosD.getDisponivel());
						app.displayText("--------------------------------------");
					}
					
			    } else if (opcao == 2) {
			        // Código para a opção 2
			    	app.displayText("\n====== Livros Disponíveis para Emprestimo ======");
					app.displayText("\n--------------------------------------");
					for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
						if (livrosD.getDisponivel().equals("Disponivel")) {
							app.displayText("➜ Titulo: "+livrosD.getTitulo()+"\nAutor: "+livrosD.getAutor()+"\nAno de publicação: "+livrosD.getAnoPublicacao()+"\nTema: "+livrosD.getTema()+"\nSituação: "+livrosD.getDisponivel());
							app.displayText("--------------------------------------");
						}
					}
					
					app.displayText("\n Identifique-se como um dos usuários abaixos:");
					app.displayText("1. Aluno");
					app.displayText("2. Funcionário");
					app.displayText("3. Professor");
					app.displayText("4. Visitante");
					int id = 0;
					id = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: "));
					
					switch (id) {
					case 1:
						String matricula;
						matricula = JOptionPane.showInputDialog("Digite sua matricula:");
						boolean matriculaEncontrada = false;
						for (Aluno aluno1 : cadastrados.getAlunosCadastrados()) {
							if (matricula.equals(aluno1.getMatricula())) {
								matriculaEncontrada = true;
								app.displayText("Bem-vindo "+aluno1.getNome()+"!");
								String inputLivro = JOptionPane.showInputDialog("Digite corretamente o nome livro disponível desejado abaixo:");
								boolean livroEncontrado = false;
								for (Livro livroD : Biblioteca1.getLivrosDisponiveis()) {
									if(livroD.getTitulo().equalsIgnoreCase(inputLivro)) {
										livroEncontrado = true;
										Emprestimo newEmp = new Emprestimo(aluno1, livroD, "27/06/23", "Ainda não devolvido");
										Emprestimos.add(newEmp);
										livroD.setDisponivel("Esgotado");
										JOptionPane.showMessageDialog(null, aluno1.realizarEmprestimo(livroD).getTitulo(), "Emprestimo Realizado", JOptionPane.WARNING_MESSAGE);

										app.displayText("--------------------------------------");
										break;
									}
								}
								if (!livroEncontrado){
									UIManager.put("OptionPane.noButtonText", "Non");
									UIManager.put("OptionPane.okButtonText", "Ok");
									UIManager.put("OptionPane.yesButtonText", "Oui");

									JFrame parent = new JFrame();


									String multiLineMsg[] = { "Olá "+aluno1.getNome(), "seu livro não foi encontrado!"} ;
									JOptionPane.showMessageDialog(parent, multiLineMsg);

								}
							}
						}
						break;
						
					case 2:
						String cargo;
						cargo = JOptionPane.showInputDialog("Digite seu cargo:");
						for (Funcionario funcionario1 : funcionarios) {
							if(cargo.equals(funcionario1.getCargo())) {
								app.displayText("Bem-vindo "+funcionario1.getNome()+"!");
								String inputLivro = JOptionPane.showInputDialog("Digite corretamente o nome livro disponível desejado abaixo:");
								boolean livroEncontrado = false;
								for (Livro livroD : Biblioteca1.getLivrosDisponiveis()) {
									if(livroD.getTitulo().equals(inputLivro)) {
										livroEncontrado = true;
										Emprestimo newEmp = new Emprestimo(funcionario1, livroD, "27/06/23", "Ainda não devolvido");
										Emprestimos.add(newEmp);
										livroD.setDisponivel("Esgotado");
										JOptionPane.showMessageDialog(null, funcionario1.realizarEmprestimo(livroD).getTitulo(), "Emprestimo Realizado", JOptionPane.WARNING_MESSAGE);

										app.displayText("--------------------------------------");
										break;
									}
								}
								if (!livroEncontrado){
									UIManager.put("OptionPane.noButtonText", "Non");
									UIManager.put("OptionPane.okButtonText", "Ok");
									UIManager.put("OptionPane.yesButtonText", "Oui");

									JFrame parent = new JFrame();


									String multiLineMsg[] = { "Olá "+funcionario1.getNome(), "seu livro não foi encontrado!"} ;
									JOptionPane.showMessageDialog(parent, multiLineMsg);

								}
							}
						}
						break;
						
					case 3:
						String disciplina;
						disciplina = JOptionPane.showInputDialog("Digite sua disciplina:");
						for (Professor professor1 : professores) {
							if (disciplina.equals(professor1.getDisciplina())) {
								app.displayText("Bem-vindo "+professor1.getNome()+"!");
								String inputLivro = JOptionPane.showInputDialog("Digite corretamente o nome livro disponível desejado abaixo:");
								boolean livroEncontrado = false;
								for (Livro livroD : Biblioteca1.getLivrosDisponiveis()) {
									if(livroD.getTitulo().equals(inputLivro)) {
										livroEncontrado = true;
										Emprestimo newEmp = new Emprestimo(professor1, livroD, "27/06/23", "Ainda não devolvido");
										Emprestimos.add(newEmp);
										livroD.setDisponivel("Esgotado");
										JOptionPane.showMessageDialog(null, professor1.realizarEmprestimo(livroD).getTitulo(), "Emprestimo Realizado", JOptionPane.WARNING_MESSAGE);

										app.displayText("--------------------------------------");
										break;
									}
								}
								if (!livroEncontrado){
									UIManager.put("OptionPane.noButtonText", "Non");
									UIManager.put("OptionPane.okButtonText", "Ok");
									UIManager.put("OptionPane.yesButtonText", "Oui");

									JFrame parent = new JFrame();


									String multiLineMsg[] = { "Olá "+professor1.getNome(), "seu livro não foi encontrado!"} ;
									JOptionPane.showMessageDialog(parent, multiLineMsg);

								}
							}
						}
						break;
						
					case 4:	
						String email;
						email = JOptionPane.showInputDialog("Digite sua disciplina:");
						for (UsuarioExterno visitante1 : usersExternos) {
							if (email.equals(visitante1.getEmail())) {
								app.displayText("Bem-vindo "+visitante1.getNome()+"!");
								String inputLivro = JOptionPane.showInputDialog("Digite corretamente o nome livro disponível desejado abaixo:");
								boolean livroEncontrado = false;
								for (Livro livroD : Biblioteca1.getLivrosDisponiveis()) {
									if(livroD.getTitulo().equals(inputLivro)) {
										livroEncontrado = true;
										Emprestimo newEmp = new Emprestimo(visitante1, livroD, "27/06/23", "Ainda não devolvido");
										Emprestimos.add(newEmp);
										livroD.setDisponivel("Esgotado");
										JOptionPane.showMessageDialog(null, visitante1.realizarEmprestimo(livroD).getTitulo(), "Emprestimo Realizado", JOptionPane.WARNING_MESSAGE);

										app.displayText("--------------------------------------");
										break;
									}
								}
								if (!livroEncontrado){
									UIManager.put("OptionPane.noButtonText", "Non");
									UIManager.put("OptionPane.okButtonText", "Ok");
									UIManager.put("OptionPane.yesButtonText", "Oui");

									JFrame parent = new JFrame();


									String multiLineMsg[] = { "Olá "+visitante1.getNome(), "seu livro não foi encontrado!"} ;
									JOptionPane.showMessageDialog(parent, multiLineMsg);

								}
							}
						}
						break;
					}
			    } else if (opcao == 3) {
			        // Código para a opção 3
					String nome;
					nome = JOptionPane.showInputDialog("Digite seu nome:");
					for (Emprestimo emprestimo : Biblioteca1.getEmprestimos()) {
						if (nome.equals(emprestimo.getPessoa().getNome())) {
							app.displayText("Bem-vindo "+emprestimo.getPessoa().getNome()+"!");
							String devolverLivro = JOptionPane.showInputDialog("Digite o nome do livro para devolução:");
							boolean livroEncontradoDevolucao = false;
							for (Emprestimo emprestimos : Biblioteca1.getEmprestimos()) {
								if (emprestimos.getDataDevolucao().equals("Ainda não devolvido")) {
									if (devolverLivro.equals(emprestimos.getLivro().getTitulo())) {
										emprestimos.getLivro().setDisponivel("Disponivel");
										emprestimos.setDataDevolucao("28/06/2023");
										app.displayText("Pronto, "+emprestimos.getPessoa().getNome()+" sua devolução foi realizada!");
										app.displayText("--------------------------------------");
										livroEncontradoDevolucao = true;
										break;
									}
								}
							}
							if (!livroEncontradoDevolucao) {
								UIManager.put("OptionPane.noButtonText", "Non");
								UIManager.put("OptionPane.okButtonText", "Ok");
								UIManager.put("OptionPane.yesButtonText", "Oui");

								JFrame parent = new JFrame();


								String multiLineMsg[] = { "Olá "+emprestimo.getPessoa().getNome() , "seu livro não foi encontrado!"} ;
								JOptionPane.showMessageDialog(parent, multiLineMsg);
						        app.displayText("O livro não foi encontrado");
						    }
						}
					}
					
			    } else if (opcao == 4) {
			        // Código para a opção 4
			    	app.displayText("===== Lista de Emprestimos =====");
					for (Emprestimo emprestimo : Biblioteca1.getEmprestimos()) {
						app.displayText("➜ Usuário: " + emprestimo.getPessoa().getNome()+"\nLivro: " + emprestimo.getLivro().getTitulo()+"\nData de Empréstimo: " + emprestimo.getDataEmprestimo()+"\nData de Devolução: " + emprestimo.getDataDevolucao());
						app.displayText("--------------------------------------");
					}
					
			    } else if (opcao == 5) {
			    	app.displayText("Bem vindo as opções de segurança!");
			    	Object resposta = JOptionPane.showInputDialog(null, "Identifique-se como Funcionario-Administrador??", "Acesso Restrito a Sevidores", JOptionPane.QUESTION_MESSAGE, null, new String[] { "Administrador","Funcionario"}, "Administrador");
			    	app.displayText("Olá "+resposta+"!");
			    	if (resposta.equals("Funcionario")) {
			    		String nome = JOptionPane.showInputDialog("Por questões de segurança, informe seu nome: ");
			    		boolean funcionarioEncontrado = false;
			    		for (Funcionario funcionari0s : cadastrados.getFuncionario()) {
			    			if (nome.equalsIgnoreCase(funcionari0s.getNome())) {
			    				funcionarioEncontrado = true;
					            break;
			    			}
							
						}
			    		if (funcionarioEncontrado) {
			    			app.displayText("O que deseja fazer?");
			    			app.displayText("1. Adicionar livro");
			    			app.displayText("2. Remover livro");
			    			app.displayText("3. Exibir informações");
			    			app.displayText("Escolha a opção: ");
			    			String opcaoFunc = JOptionPane.showInputDialog("Digite a opção desejada: ");
			    			if (ValidacaoInteiro(opcaoFunc)) {
			    				int escolha = Integer.parseInt(opcaoFunc);
			    				if (escolha == 1) {
			    					/*Adicionar livro*/
			    					String tituloLivro = JOptionPane.showInputDialog("Título: ");
			    					String autorLivro = JOptionPane.showInputDialog("Autor: ");
			    					String temaLivro = JOptionPane.showInputDialog("Tema: ");
			    					String anoPublicacao = JOptionPane.showInputDialog("Ano de Publicação: ");
			    					int anoPublicacaoLivro = Integer.parseInt(anoPublicacao);
			    					
			    					Livro novoLivro = new Livro(tituloLivro, autorLivro, temaLivro ,anoPublicacaoLivro, "Disponivel");

								    Biblioteca1.getLivrosDisponiveis().add(novoLivro);
								    
								    ((Funcionario) func1).adicionarLivro(novoLivro);
			    					app.displayText("Livro adicionado!");
			    					
			    					
			    					
			    				} else if (escolha == 2) {
			    					/*Remover livro*/
			    					String tituloLivroRemover = JOptionPane.showInputDialog("Informe o titulo do livro a ser removido: ");
			    					boolean livroEncontrado = false;
			    					for (Livro livro : Biblioteca1.getLivrosDisponiveis()) {
			    						if (livro.getTitulo().equals(tituloLivroRemover)) {
			    							Biblioteca1.getLivrosDisponiveis().remove(livro);
						                    livroEncontrado = true;
						                    ((Funcionario) func1).removerLivro(livro);
						                    app.displayText("Livro removido!");
						                    break;
			    						}
										
									}
			    					if (!livroEncontrado) {
			    						app.displayText("Livro não encontrado na biblioteca!");
			    					}
			    					
			    				} else if (escolha == 3) {
			    					/*Exibindo informações*/
			    					app.displayText("Exibindo informações de todos os cadastrados:");
			    					app.displayText("➜ Informações dos Alunos");
			    					for (Aluno alunoss : cadastrados.getAlunosCadastrados()) {
			    						JOptionPane.showMessageDialog(null, alunoss.getInformacoes(), "Informações", JOptionPane.WARNING_MESSAGE);
									
			    					}
			    					app.displayText("➜ Informações dos Professores");
			    					for (Professor professoress : cadastrados.getProfessoresCadastrados()) {
			    						JOptionPane.showMessageDialog(null, professoress.getInformacoes() ,"Informações", JOptionPane.WARNING_MESSAGE);
			    					}
			    					app.displayText("➜ Informações dos Funcionários");
			    					for (Funcionario funcionarioss : cadastrados.getFuncionario()) {
			    						JOptionPane.showMessageDialog(null, funcionarioss.getInformacoes() ,"Informações", JOptionPane.WARNING_MESSAGE);
			    					}
			    					
			    				}
			    				
			    			}
			    		}
			    	} else if (resposta.equals("Administrador")) {
			    		String nome = JOptionPane.showInputDialog("Por questões de segurança, informe seu nome: ");
			    		boolean administradorEncontrado = false;
			    		for (Funcionario administrador : cadastrados.getFuncionario()) {
			    			 if (nome.equalsIgnoreCase(administrador.getNome()) && administrador instanceof Administrador) {
						            administradorEncontrado = true;
						            break;
						        }
						}
			    		if (administradorEncontrado) {
			    			app.displayText("O que deseja fazer?");
			    			app.displayText("1. Adicionar livro");
			    			app.displayText("2. Remover livro");
			    			app.displayText("3. Adicionar funcionário");
			    			app.displayText("4. Remover funcionário");
			    			app.displayText("5. Exibir informações");
			    			String opcaoAdm = JOptionPane.showInputDialog("Digite a opção desejada: ");
			    			if (ValidacaoInteiro(opcaoAdm)) {
			    				int escolha = Integer.parseInt(opcaoAdm);
			    				if (escolha == 1) {
			    					/*Adicionar livro*/
			    					String tituloLivro = JOptionPane.showInputDialog("Título: ");
			    					String autorLivro = JOptionPane.showInputDialog("Autor: ");
			    					String temaLivro = JOptionPane.showInputDialog("Tema: ");
			    					String anoPublicacao = JOptionPane.showInputDialog("Ano de Publicação: ");
			    					int anoPublicacaoLivro = Integer.parseInt(anoPublicacao);
			    					
			    					Livro novoLivro = new Livro(tituloLivro, autorLivro, temaLivro ,anoPublicacaoLivro, "Disponivel");

								    Biblioteca1.getLivrosDisponiveis().add(novoLivro);
								    
								    ((Administrador) adm).adicionarLivro(novoLivro);
								    app.displayText("Livro adicionado!");
								    
								    
								    
			    				} else if (escolha == 2) {
			    					/*Remover livro*/
			    					String tituloLivroRemover = JOptionPane.showInputDialog("Informe o titulo do livro a ser removido: ");
			    					boolean livroEncontrado = false;
			    					for (Livro livro : Biblioteca1.getLivrosDisponiveis()) {
			    						if (livro.getTitulo().equals(tituloLivroRemover)) {
			    							Biblioteca1.getLivrosDisponiveis().remove(livro);
						                    livroEncontrado = true;
						                    ((Administrador) adm).removerLivro(livro);
						                    app.displayText("Livro removido!");
						                    break;
			    						}
										
									}
			    					if (!livroEncontrado) {
			    						app.displayText("Livro não encontrado na biblioteca!");
			    					}
			    				} else if (escolha == 3) {
			    					/*Adicionar funcionário*/
			    					app.displayText("Informe os detalhes do funcionário");
			    					String nomeFuncionario = JOptionPane.showInputDialog("Nome: ");
			    					String idade = JOptionPane.showInputDialog("Idade: ");
			    					int idadeFuncionario = Integer.parseInt(idade);
			    					String cpf = JOptionPane.showInputDialog("CPF: ");
			    					int cpfFuncionario = Integer.parseInt(cpf);
			    					String enderecoFuncionario = JOptionPane.showInputDialog("Endereço: ");
			    					String telefoneFuncionario = JOptionPane.showInputDialog("Telefone: ");
			    					String emailFuncionario = JOptionPane.showInputDialog("E-mail: ");
			    					String cargoFuncionario = JOptionPane.showInputDialog("Cargo: ");
			    					String salario = JOptionPane.showInputDialog("Salário: ");
			    					long salarioFuncionario = Long.parseLong(salario);

			    					Funcionario novoFuncionario = new Funcionario(nomeFuncionario, idadeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario, cargoFuncionario, salarioFuncionario);

			    					cadastrados.getFuncionario().add(novoFuncionario);

			    					((Administrador) adm).adicionarFuncionario(novoFuncionario);
			    					app.displayText("Funcionário adicionado!");
			    					
			    				} else if (escolha == 4) {
			    					/*Remover funcionário*/
			    					String nomeFuncionarioRemover = JOptionPane.showInputDialog("Nome do Funcionario a ser removido: ");
			    					boolean encontrado = false;
			    					for (Funcionario funcionario : cadastrados.getFuncionario()) {
			    						if (funcionario.getNome().equals(nomeFuncionarioRemover)) {
			    							cadastrados.getFuncionario().remove(funcionario);
						                    ((Administrador) adm).removerFuncionario(funcionario);
						                    app.displayText("Funcionário removido!");
						                    encontrado = true;
						                    break; 
			    						}
										
									}
			    					if (!encontrado) {
						                System.out.println("Funcionário não encontrado.");
						            }
			    				} else if (escolha == 5) {
			    					/*Exibindo informações*/
			    					app.displayText("Exibindo informações de todos os cadastrados");
			    					app.displayText("➜ Informações dos Alunos");
			    					for (Aluno alunoss : cadastrados.getAlunosCadastrados()) {
			    						JOptionPane.showMessageDialog(null, alunoss.getInformacoes(), "Informações", JOptionPane.WARNING_MESSAGE);
									
			    					}
			    					app.displayText("➜ Informações dos Professores");
			    					for (Professor professoress : cadastrados.getProfessoresCadastrados()) {
			    						JOptionPane.showMessageDialog(null, professoress.getInformacoes() ,"Informações", JOptionPane.WARNING_MESSAGE);
			    					}
			    					app.displayText("➜ Informações dos Funcionários");
			    					for (Funcionario funcionarioss : cadastrados.getFuncionario()) {
			    						JOptionPane.showMessageDialog(null, funcionarioss.getInformacoes() ,"Informações", JOptionPane.WARNING_MESSAGE);
			    					}
			    				} else {
			    					app.displayText("Opção Inválida!");
			    				}
			    				
			    			}
			    		} else {
			    			app.displayText("Nome de administrador inválido!");
			    		}
			    	}
			    	
			    	else {
			    		app.displayText("Opção Inválida!");
			    	}
			    	
			    	
			    	
			    	

			    } else if (opcao == 6) {
			        // Código para a opção 6
			    	app.displayText("\n====== Obrigado por utilizar a Biblioteca! ======");
					app.displayText("                	 Volte Sempre                    ");

			    } else {
			    	UIManager.put("OptionPane.noButtonText", "Non");
					UIManager.put("OptionPane.okButtonText", "Ok");
					UIManager.put("OptionPane.yesButtonText", "Oui");

					JFrame parent = new JFrame();

					String multiLineMsg[] = { "Opção inválida!" , "Tente novamente."} ;
					JOptionPane.showMessageDialog(parent, multiLineMsg);
					
			    }
			    
			}
			
		}
		
	}
	/*Validação de dados*/
	public static boolean ValidacaoInteiro(String input) {
		try {
			Integer.parseInt(input);
			return true; 
		} catch (NumberFormatException e) {
			return false; 
		}
	
	}

	
	
	
	
	
	
	
	
}
