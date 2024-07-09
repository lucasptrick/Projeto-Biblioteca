package ProjetoBiblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import ClasseLivro.Livro;

public class App {

	public static void main(String[] args) {
		/*Criação dos objetos*/	
		/*Livros*/
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

		/*Alunos*/	
		Pessoa aluno01 = new Aluno("Renato", 15, 1111111, "Rua dos trouxas, N.1, Palmares, PE", "(81) 40028922", "AmoCoxinha@gmail.com", "MTR0111", "Médio");
		Pessoa aluno02 = new Aluno("Carlos", 17, 2222222, "Rua dos espertos, N.2, Ribeirão, PE", "(81) 22982004", "OdeioPastel@gmail.com", "MTR0222", "IPI");	
		Pessoa aluno03 = new Aluno("Patricia", 18, 4444444, "Quilombo P, N.77, Palmares, PE", "(81) 1414141414", "PatrikiaEstrela@gmail.com", "MTR0333", "Redes");
		Pessoa aluno04 = new Aluno("Ana", 17, 4444444, "Quilombo P, N.77, Palmares, PE", "(81) 1414141414", "AnaKonda@hotmail.com", "MTR0444", "ADS");
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add((Aluno) aluno01);
		alunos.add((Aluno) aluno02);
		alunos.add((Aluno) aluno03);
		alunos.add((Aluno) aluno04);

		/*Professores*/
		Pessoa professor01 = new Professor("Rafaella", 31, 010101010, "Cafofo dos prof, N.001, Palmares, PE", "(81) 12121212121", "RafaelaSouza@gmail.com", "Professora", 4000, "Matematica");
		Pessoa professor02 = new Professor("Lucio", 28, 101010101, "Cafofo dos prof, N.002, Palmares, PE", "(81) 21212121212", "LucioRodrigues@gmail.com", "Professor", 3000, "História");
		List<Professor> professores = new ArrayList<Professor>();
		professores.add((Professor) professor01);
		professores.add((Professor) professor02);

		/*Usuarios Externos*/
		Pessoa user01 = new UsuarioExterno("Harry", 14, 3333333, "Rua dos Alfeneiros, N.4, Little Whinging, SUR", "(810)1112131415 ", "MeSalvaSirius@gmail.com");
		List<UsuarioExterno> usersExternos = new ArrayList<UsuarioExterno>();
		usersExternos.add((UsuarioExterno) user01);

		/*Administrador*/
		Pessoa adm = new Administrador("Carlita", 47, 00000000, "Cafofo dos prof, N.001, Palmares, PE", "(81) 181818181818", "LeitoraFuriosa@gmail.com", "Bibliotecaria", 2800);

		/*Funcionarios*/
		Pessoa func1 = new Funcionario("João", 21, 454545454, "Alojamento dos funcionarios, N.1, Palmares, PE", "(81) 00099999", "FuncionariosBili@gmail.com", "Funcionario", 1800);
		Pessoa func2 = new Funcionario("Pedro", 19, 373737373, "Alojamento dos funcionarios, N.1, Palmares, PE", "(81) 0008888", "FuncionariosBili@gmail.com", "Funcionario", 1800);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add((Funcionario) func1);
		funcionarios.add((Funcionario) func2);
		funcionarios.add((Funcionario) adm);


		/*Emprestimos*/
		Emprestimo emp1 = new Emprestimo(professor01, livroFiccao2, "12/06/2023", "14/06/2023");
		Emprestimo emp2 = new Emprestimo(professor02, livroFiccao1, "12/06/2023", "Ainda não devolvido");
		Emprestimo emp3 = new Emprestimo(user01, livroFiccao2, "02/05/2023", "Ainda não devolvido");
		List<Emprestimo> Emprestimos = new ArrayList<Emprestimo>();
		Emprestimos.add(emp1);
		Emprestimos.add(emp2);
		Emprestimos.add(emp3);

		/*Cadastro*/
		Cadastro cadastrados = new Cadastro(alunos, professores, usersExternos, funcionarios);

		/*Biblioteca*/
		Biblioteca Biblioteca1 = new Biblioteca("Prazeres", "Centro, N.34, Palmares, PE", livros, cadastrados, (Administrador) adm,  Emprestimos); 

		/*Input*/
		Scanner scanner = new Scanner(System.in);
		int opcao = 0;

		/*Menus*/
		System.out.println("======Bem-Vindo(a) a Biblioteca======");
		while (opcao != 5) {
			Menu0();	          
			String input = scanner.nextLine();      
			if (ValidacaoInteiro(input)) {
				opcao = Integer.parseInt(input); 
				/*Opção 01*/
				if (opcao == 1) {
					System.out.println("=====Confira a Lista dos nossos Livros=====");
					for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
						System.out.println("  ");
						System.out.println("➜ Titulo: "+livrosD.getTitulo()+"\nAutor: "+livrosD.getAutor()+"\nAno de publicação: "+livrosD.getAnoPublicacao()+"\nTema: "+livrosD.getTema()+"\nSituação: "+livrosD.getDisponivel());	                
					}    
					System.out.println("=======================================");
				} 
				/*Opção 02*/     
				else if (opcao == 2) {
					System.out.println("=====Livros Disponíveis para Emprestimo=====");
					for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
						if (livrosD.getDisponivel().equals("Disponivel")) {
							System.out.println("  ");
							System.out.println("➜ Titulo: "+livrosD.getTitulo()+"\nAutor: "+livrosD.getAutor()+"\nAno de publicação: "+livrosD.getAnoPublicacao()+"\nTema: "+livrosD.getTema()+"\nSituação: "+livrosD.getDisponivel());
						}      
					}   
					System.out.println("\nIdentifique-se entre Aluno, Funcionario, Professor ou Visitante:");
					String id = scanner.nextLine();

					if (id.equalsIgnoreCase("aluno")) {
					    System.out.println("Digite o código de matrícula:");
					    String codMat = scanner.nextLine();

					    boolean matriculaEncontrada = false; 

					    for (Aluno aluno1 : cadastrados.getAlunosCadastrados()) {
					        if (codMat.equalsIgnoreCase(aluno1.getMatricula())) {
					            matriculaEncontrada = true;
					            System.out.println("Digite corretamente o nome do livro disponível desejado abaixo:");
					            String inputLivro = scanner.nextLine();
					            boolean livroEncontrado = false;
					            for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
					                if (livrosD.getTitulo().equalsIgnoreCase(inputLivro)) {
					                    livroEncontrado = true;
					                    Emprestimo newEmp = new Emprestimo(aluno1, livrosD, "27/06/23", "Ainda não devolvido");
					                    Emprestimos.add(newEmp);
					                    livrosD.setDisponivel("Esgotado");
					                    aluno1.realizarEmprestimo(livrosD);
					                    break;
					                }
					            }
					            if (!livroEncontrado) {
					                System.out.println("Livro não encontrado ou esgotado!");
					            }
					            break; 
					        }
					    }

					    if (!matriculaEncontrada) {
					        System.out.println("Matrícula errada!");
					    }
					}else if (id.equals("funcionario")) {
					    System.out.println("Digite seu cargo:");
					    String cargoFunc = scanner.nextLine();

					    boolean cargoEncontrado = false; 

					    for (Funcionario funcionario1 : cadastrados.getFuncionario()) {
					        if (cargoFunc.equalsIgnoreCase(funcionario1.getCargo())) {
					            cargoEncontrado = true;
					            System.out.println("Digite corretamente o nome do livro disponível desejado abaixo:");
					            String inputLivro = scanner.nextLine();
					            boolean livroEncontrado = false;
					            for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
					                if (livrosD.getTitulo().equalsIgnoreCase(inputLivro)) {
					                    livroEncontrado = true;
					                    Emprestimo newEmp = new Emprestimo(funcionario1, livrosD, "27/06/23", "Ainda não devolvido");
					                    Emprestimos.add(newEmp);
					                    livrosD.setDisponivel("Esgotado");
					                    funcionario1.realizarEmprestimo(livrosD);
					                    break;
					                }
					            }
					            if (!livroEncontrado) {
					                System.out.println("Livro não encontrado ou esgotado!");
					            }
					            break; 
					        }
					    }

					    if (!cargoEncontrado) {
					        System.out.println("Cargo inválido!");
					    }
					}else if (id.equals("professor")) {
					    System.out.println("Digite sua disciplina:");
					    String disciProf = scanner.nextLine();

					    boolean disciplinaEncontrada = false; 

					    for (Professor professor1 : cadastrados.getProfessoresCadastrados()) {
					        if (disciProf.equalsIgnoreCase(professor1.getDisciplina())) {
					            disciplinaEncontrada = true;
					            System.out.println("Digite corretamente o nome do livro disponível desejado abaixo:");
					            String inputLivro = scanner.nextLine();
					            boolean livroEncontrado = false;
					            for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
					                if (livrosD.getTitulo().equalsIgnoreCase(inputLivro)) {
					                    livroEncontrado = true;
					                    Emprestimo newEmp = new Emprestimo(professor1, livrosD, "27/06/23", "Ainda não devolvido");
					                    Emprestimos.add(newEmp);
					                    livrosD.setDisponivel("Esgotado");
					                    professor1.realizarEmprestimo(livrosD);
					                    break;
					                }
					            }
					            if (!livroEncontrado) {
					                System.out.println("Livro não encontrado ou esgotado!");
					            }
					            break; 
					        }
					    }

					    if (!disciplinaEncontrada) {
					        System.out.println("Disciplina inválida!");
					    }
					}else if (id.equalsIgnoreCase("Visitante")) {
					    System.out.println("Digite seu CPF:");
					    int cpfUsuario = scanner.nextInt();
					    scanner.nextLine();
					    boolean visitanteEncontrado = false;

					    for (UsuarioExterno visitante1 : cadastrados.getUSCadastrados()) {
					        if (cpfUsuario == visitante1.getCpf()) {
					            visitanteEncontrado = true;
					            System.out.println("Digite corretamente o nome do livro disponível desejado abaixo:");
					            String inputLivro = scanner.nextLine();
					            boolean livroEncontrado = false;
					            for (Livro livrosD : Biblioteca1.getLivrosDisponiveis()) {
					                if (livrosD.getTitulo().equalsIgnoreCase(inputLivro)) {
					                    livroEncontrado = true;
					                    Emprestimo newEmp = new Emprestimo(visitante1, livrosD, "27/06/23", "Ainda não devolvido");
					                    Emprestimos.add(newEmp);
					                    livrosD.setDisponivel("Esgotado");
					                    System.out.println("Empréstimo realizado!");
					                    break;
					                }
					            }
					            if (!livroEncontrado) {
					                System.out.println("Livro não encontrado ou esgotado!");
					            }
					            break; 
					        }
					    }

					    if (!visitanteEncontrado) {
					        System.out.println("CPF inválido!");
					    }
					}
					else {
						System.out.println("Usuário Inválido, você não pode solicitar um emprestimo!");
					}
					System.out.println("=======================================");
				} 
				/*Opção 03*/  
				else if (opcao == 3) {
					System.out.println("Estes são os livros que não foram devolvidos até o momento:");
					System.out.println("=======================================");
					boolean livrosEncontrados = false;
					for (Emprestimo emprestimo : Biblioteca1.getEmprestimos()) {
					    if (emprestimo.getDataDevolucao().equals("Ainda não devolvido")) {
					        System.out.println("➜ Título: " + emprestimo.getLivro().getTitulo());
					        System.out.println("   Autor: " + emprestimo.getLivro().getAutor());
					        System.out.println("   Ano de publicação: " + emprestimo.getLivro().getAnoPublicacao());
					        System.out.println("   Tema: " + emprestimo.getLivro().getTema());
					        System.out.println("=======================================");
					        livrosEncontrados = true;
					    }
					}

					if (!livrosEncontrados) {
					    System.out.println("Não há mais livros para serem devolvidos.");
					    System.out.println("=======================================");
					}
					System.out.println("Digite o nome do livro que deseja devolver:");
					String inputLivro = scanner.nextLine();
					boolean livroEncontrado = false;
					for (Emprestimo emprestimos : Biblioteca1.getEmprestimos()) {
						if (emprestimos.getDataDevolucao().equalsIgnoreCase("Ainda não devolvido")) {
							if (inputLivro.equalsIgnoreCase(emprestimos.getLivro().getTitulo())) {
								System.out.println("Obrigado por efetuar a devolução do livro, "+emprestimos.getPessoa().getNome()+"!");
								System.out.println("=======================================");
								emprestimos.getLivro().setDisponivel("Disponivel");
								emprestimos.setDataDevolucao("29/06/2023");
								livroEncontrado = true;
								break;
							}
						}
					}
					if (!livroEncontrado) {
						System.out.println("Livro não encontrado");
					}
				}else if (opcao == 4) {
					System.out.println("Bem vindo as opções de segurança!");
					System.out.println("Voce deseja visualizar as opções de funcionario ou de administrador?");
					String inputOpcao = scanner.nextLine();
					if (inputOpcao.equalsIgnoreCase("funcionario")) {
						System.out.println("Por questões de segurança, informe seu nome: ");
					    String inputNome = scanner.nextLine();
					    
					    boolean funcionarioEncontrado = false;
					    for (Funcionario funcionari0s : cadastrados.getFuncionario()) {
					        if (inputNome.equalsIgnoreCase(funcionari0s.getNome())) {
					            funcionarioEncontrado = true;
					            break;
					        }
					    }
						
					    if (funcionarioEncontrado) {
					        System.out.println("O que deseja fazer?");
					        System.out.println("1. Adicionar livro");
					        System.out.println("2. Remover livro");
					        System.out.println("3. Exibir informações");
					        System.out.println("Escolha a opção: ");

					        String inpuut = scanner.nextLine();
					        if (ValidacaoInteiro(inpuut)) {
								int escolha = Integer.parseInt(inpuut);
								if (escolha == 1) {
						            /*Adicionar livro*/
									 System.out.print("Título: ");
									    String tituloLivro = scanner.nextLine();

									    System.out.print("Autor: ");
									    String autorLivro = scanner.nextLine();


									    System.out.print("Tema: ");
									    String temaLivro = scanner.nextLine();
									    
									    System.out.print("Ano de publicação: ");
									    int anoPublicacaoLivro = scanner.nextInt();
									    scanner.nextLine(); 

									    Livro novoLivro = new Livro(tituloLivro, autorLivro, temaLivro ,anoPublicacaoLivro, "Disponivel");

									    Biblioteca1.getLivrosDisponiveis().add(novoLivro);
									    
									    ((Funcionario) func1).adicionarLivro(novoLivro);
									    
									    
									    
						        }else if (escolha == 2) {
						        	System.out.println("Informe o título do livro a ser removido:");
						            String tituloLivroRemover = scanner.nextLine();

						            boolean livroEncontrado = false;
						            
						            for (Livro livro : Biblioteca1.getLivrosDisponiveis()) {
						                if (livro.getTitulo().equalsIgnoreCase(tituloLivroRemover)) {
						                	Biblioteca1.getLivrosDisponiveis().remove(livro);
						                    livroEncontrado = true;
						                    ((Funcionario) func1).removerLivro(livro);
						                    break;
						                }
						            }

						            if (!livroEncontrado) {
						                System.out.println("Livro não encontrado na biblioteca!");
						            }
						          }else if (escolha == 3) {
						        	  /*Exibindo informações*/
						        	  System.out.println("Exibindo informações de todos os cadastrados: ");
						        	  System.out.println("Alunos:");
						        	  for (Aluno alunoss : cadastrados.getAlunosCadastrados()) {
										alunoss.exibirInfo();
									}
						        	  System.out.println("Professores: ");
						        	  for (Professor professoress : cadastrados.getProfessoresCadastrados()) {
										professoress.exibirInfo();
									}
						        	  System.out.println("Funcionarios: ");
						        	  for (Funcionario funcionarioss : cadastrados.getFuncionario()) {
										funcionarioss.exibirInfo();
									}
						          }
					        	}
					        }
						
					}else if (inputOpcao.equalsIgnoreCase("administrador")) {
					    System.out.println("Por questões de segurança, informe seu nome: ");
					    String inputNome = scanner.nextLine();
					    
					    boolean administradorEncontrado = false;

					    for (Funcionario funcionari0s : cadastrados.getFuncionario()) {
					        if (inputNome.equalsIgnoreCase(funcionari0s.getNome()) && funcionari0s instanceof Administrador) {
					            administradorEncontrado = true;
					            break;
					        }
					    }

					    if (administradorEncontrado) {
					        System.out.println("O que deseja fazer?");
					        System.out.println("1. Adicionar livro");
					        System.out.println("2. Remover livro");
					        System.out.println("3. Adicionar funcionário");
					        System.out.println("4. Remover funcionário");
					        System.out.println("5. Exibir informações");
					        System.out.println("Escolha a opção: ");

					        String inpuut = scanner.nextLine();
					        if (ValidacaoInteiro(inpuut)) {
								int escolha = Integer.parseInt(inpuut);
								if (escolha == 1) {
						            /*Adicionar livro*/
									 System.out.print("Título: ");
									    String tituloLivro = scanner.nextLine();

									    System.out.print("Autor: ");
									    String autorLivro = scanner.nextLine();


									    System.out.print("Tema: ");
									    String temaLivro = scanner.nextLine();
									    
									    System.out.print("Ano de publicação: ");
									    int anoPublicacaoLivro = scanner.nextInt();
									    scanner.nextLine(); 

									    Livro novoLivro = new Livro(tituloLivro, autorLivro, temaLivro ,anoPublicacaoLivro, "Disponivel");

									    Biblioteca1.getLivrosDisponiveis().add(novoLivro);
									    
									    ((Administrador) adm).adicionarLivro(novoLivro);
									    
						        }else if (escolha == 2) {
						            /*Remover livro*/
						            System.out.println("Informe o título do livro a ser removido:");
						            String tituloLivroRemover = scanner.nextLine();

						            boolean livroEncontrado = false;
						            
						            for (Livro livro : Biblioteca1.getLivrosDisponiveis()) {
						                if (livro.getTitulo().equalsIgnoreCase(tituloLivroRemover)) {
						                	Biblioteca1.getLivrosDisponiveis().remove(livro);
						                    livroEncontrado = true;
						                    ((Administrador) adm).removerLivro(livro);
						                    break;
						                }
						            }

						            if (!livroEncontrado) {
						                System.out.println("Livro não encontrado na biblioteca!");
						            }
						        }else if (escolha == 3) {
						            /*Adicionar funcionário*/
						            System.out.println("Informe os detalhes do funcionário:");

						            System.out.print("Nome: ");
						            String nomeFuncionario = scanner.nextLine();

						            System.out.print("Idade: ");
						            int idadeFuncionario = scanner.nextInt();
						            scanner.nextLine();

						            System.out.print("CPF: ");
						            int cpfFuncionario = scanner.nextInt();
						            scanner.nextLine();

						            System.out.print("Endereço: ");
						            String enderecoFuncionario = scanner.nextLine();

						            System.out.print("Telefone: ");
						            String telefoneFuncionario = scanner.nextLine();

						            System.out.print("Email: ");
						            String emailFuncionario = scanner.nextLine();

						            System.out.print("Cargo: ");
						            String cargoFuncionario = scanner.nextLine();

						            System.out.print("Salário: ");
						            double salarioFuncionario = scanner.nextDouble();
						            scanner.nextLine(); 

						           
						            Funcionario novoFuncionario = new Funcionario(nomeFuncionario, idadeFuncionario, cpfFuncionario, enderecoFuncionario, telefoneFuncionario, emailFuncionario, cargoFuncionario, salarioFuncionario);

						            cadastrados.getFuncionario().add(novoFuncionario);

						            ((Administrador) adm).adicionarFuncionario(novoFuncionario);

						        }else if (escolha == 4) {
						            /*Remover funcionário*/
						            System.out.println("Informe o nome do funcionário a ser removido:");
						            String nomeFuncionarioRemover = scanner.nextLine();
						            
						            boolean encontrado = false;
						            for (Funcionario funcionario : cadastrados.getFuncionario()) {
						                if (funcionario.getNome().equalsIgnoreCase(nomeFuncionarioRemover)) {
						                    cadastrados.getFuncionario().remove(funcionario);
						                    ((Administrador) adm).removerFuncionario(funcionario);
						                    encontrado = true;
						                    break; 
						                }
						            }

						            if (!encontrado) {
						                System.out.println("Funcionário não encontrado.");
						            }
						        }
						        else if (escolha == 5) {
						        	  /*Exibindo informações*/
						        	  System.out.println("Exibindo informações de todos os cadastrados: ");
						        	  System.out.println("Alunos:");
						        	  for (Aluno alunoss : cadastrados.getAlunosCadastrados()) {
										alunoss.exibirInfo();
									}
						        	  System.out.println("Professores: ");
						        	  for (Professor professoress : cadastrados.getProfessoresCadastrados()) {
										professoress.exibirInfo();
									}
						        	  System.out.println("Funcionarios: ");
						        	  for (Funcionario funcionarioss : cadastrados.getFuncionario()) {
										funcionarioss.exibirInfo();
									}
						          } else {
						            System.out.println("Opção inválida.");
						        }
								
							}
					    } else {
					        System.out.println("Nome de administrador inválido!");
					    }
					}

					
					else {
						System.out.println("Opção invalida!");
					}
								
				}else if (opcao == 5) {
					System.out.println("Saindo do programa...");

				}else {
					System.out.println("Opção inválida. Tente novamente.");
					System.out.println("=======================================");
				}                  
			}else {
				System.out.println("Caractere invalido. Tente novamente.");
				System.out.println("=======================================");
			}
		}
		scanner.close();
		System.out.println("Programa encerrado.");
	}
	/*Criação dos menus*/
	public static void Menu0() {
		System.out.println("O que deseja fazer?");
		System.out.println("Por favor, digite o número correspondente pra o que deseja fazer:");
		System.out.println("1. Ver lista de livros da biblioteca");
		System.out.println("2. Realizar um emprestimo de um livro");
		System.out.println("3. Realizar uma devolução de um livro");
		System.out.println("4. Outro");
		System.out.println("5. Sair");
		System.out.print("\nSelecione uma opção: ");
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