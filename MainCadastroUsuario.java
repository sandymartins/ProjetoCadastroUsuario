package com.generation.academia;

import java.util.ArrayList;
import java.util.Scanner;
import com.generation.academia.model.Usuario;

public class MainCadastroUsuario {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("=====BEM-VINDE AO PROGRAMA DE CADASTRO DE USUÁRIO=======");
		System.out.println("********************************************************");
		System.out.println("********************************************************");

		boolean rodando = true;
		while (rodando) {
			System.out.println("[1] Cadastrar novo usuário");
			System.out.println("[2] Calcular IMC (Índice de massa corporal)");
			System.out.println("[3] Calcular TMB (Taxa metabólica basal)");
			System.out.println("[4] Definir objetivo de treino");
			System.out.println("[5] Listar usuários cadastrados");
			System.out.println("[6] Procurar usuário por e-mail");
			System.out.println("[7] Atualizar dados do usuário");
			System.out.println("[8] Remover usuário");
			System.out.println("[9] Finalizar programa");
			System.out.println("Digite uma opção: ");
			String opcao = leia.nextLine();

			switch (opcao) {
			case "1": {
				System.out.println("=========CADASTRO DE USUARIO==========");
				System.out.print("Digite seu e-mail: ");
				String email = leia.nextLine();
				System.out.print("Digite sua senha: ");
				String senha = leia.nextLine();
				System.out.print("Digite seu nome: ");
				String nome = leia.nextLine();
				System.out.print("Digite sua idade: ");
				int idade = leia.nextInt();
				System.out.print("Digite seu peso: ");
				double peso = leia.nextDouble();
				System.out.print("Digite sua altura: ");
				double altura = leia.nextDouble();
				System.out.print("Digite seu genêro: ");
				int genero = leia.nextInt();

				Usuario u = new Usuario();
				u.setEmail(email);
				u.setSenha(senha);
				u.setNome(nome);
				u.setIdade(idade);
				u.setPeso(peso);
				u.setAltura(altura);
				u.setGenero(genero);
				usuarios.add(u);
				break;
			}
			case "2": {
				System.out.println("=========CÁLCULO IMC=========");
				System.out.println("Digite seu peso: ");
				double peso = leia.nextDouble();
				System.out.println("Digite sua altura: ");
				double altura = leia.nextDouble();
				Usuario uTemp = new Usuario();
				uTemp.setPeso(peso);
				uTemp.setAltura(altura);
				uTemp.calculoIMC();
				break;
			}
			case "3": {
				System.out.println("=========CÁLCULO IMC=========");
				break;
			}
			case "4": {
				System.out.println("=========????=========");
				break;
			}
			case "5": {
				System.out.println("=========USUÁRIOS CADASTRADOS=========");
				for (int i = 0; i < usuarios.size(); i++) {

					Usuario uTemp = usuarios.get(i);
					System.out.println("E-mail:" + usuarios.get(i).getEmail());
					System.out.println("Senha: " + usuarios.get(i).getSenha());
					System.out.println("\r");
				}
				break;
			}
			case "6": {
				System.out.println("=========PROCURAR USUÁRIO POR E-MAIL==========");
				System.out.println("Digite o e-mail cadastrado: ");
				String email = leia.nextLine();

				boolean encontrado = false;
				for (int i = 0; i < usuarios.size(); i++) {

					Usuario uTemp = usuarios.get(i);

					if (email.equals(uTemp.getEmail())) {
						System.out.println("Usuário encontrado");
						System.out.println("\tEmail: " + uTemp.getEmail());
						System.out.println("\tSenha: " + uTemp.getSenha());
						encontrado = true;
					}
				}
				if (!encontrado) { // ou (encontrado == false)
					System.out.println("Não foi encontrado nenhum usuário com esse e-mail.");
					System.out.println("\r");
				}
				break;
			}
			case "7": {
				System.out.println("=========ATUALIZAÇÃO DE USUÁRIOS=========");
				for (int i = 0; i < usuarios.size(); i++) {

					Usuario uTemp = usuarios.get(i);

					System.out.println("[" + i + "]" + uTemp.getEmail());
				}

				System.out.println("Digite o valor de referência: ");
				int referencia = leia.nextInt();
				leia.nextLine();
				System.out.println("Digite o novo e-mail: ");
				String novoEmail = leia.nextLine();
				System.out.println("Digite a nova senha: ");
				String novaSenha = leia.nextLine();
				System.out.println("Digite o novo peso: ");
				double novoPeso = leia.nextDouble();

				Usuario u = usuarios.get(referencia);
				u.setEmail(novoEmail);
				u.setSenha(novaSenha);
				u.setPeso(novoPeso);
				break;
			}
			case "8": {
				System.out.println("=========REMOVER USUÁRIO=========");
				for (int i = 0; i < usuarios.size(); i++) {

					Usuario uTemp = usuarios.get(i);

					System.out.println("[" + i + "]" + uTemp.getEmail());
				}
				System.out.println("Digite o valor de referência: ");
				int referencia = leia.nextInt();
				leia.nextLine();

				usuarios.remove(referencia);

				break;
			}
			case "9": {
				System.out.println("=========PROGRAMA FINALIZADO==========");
				rodando = false;
				break;
			}
			}
		}
	}
}
