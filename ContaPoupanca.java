package Entidade;

import Entidade.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, String nome) {
		super(numero, nome);
		 
	}

	 public void imprimir() {
	        System.out.println("Número: " + getNumero());
	        System.out.println("Nome: " + getNome());	       
	    }
	
	
	@Override
	public String toString() {
		return "Conta Poupança " + getNome() + " "  +  getNumero();
	}


	
	

}
