package com.generation.academia.model;

import java.util.Scanner;

public class Usuario {
	
	private String email;
	private String senha;
	private double peso;
	private double altura;
	private String nome;
	private int genero;
	private double imc;
	private int idade;

	Scanner leia = new Scanner(System.in);

	public void verificarIdade() {
		
	}

	public void calculoIMC() {
		imc = peso / (Math.pow(altura, 2));
		System.out.printf("\nO resultado do IMC foi de: %.2f %%", imc);
		if (imc < 18.5) {
			System.out.println("\nVocê está abaixo do peso!");
		} else if (imc >= 18.6 && imc <= 24.99) {
			System.out.println("\nVocê está com peso normal!");
		} else {
			System.out.println("\nVocê está acima do peso!");
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Scanner getLeia() {
		return leia;
	}

	public void setLeia(Scanner leia) {
		this.leia = leia;
	}
	
	

}
