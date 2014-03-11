package br.unipe.mpl.banco.ui;

import br.unipe.mpl.banco.contas.Conta;
import br.unipe.mpl.banco.facade.BancoFacade;

/**
 * 
 * @author jefferson
 *
 */
public class Programa {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta("12345-X", 1000.00);
		
		BancoFacade bancoFacade = new BancoFacade();
		
		bancoFacade.cadastrarConta(conta);
		
		Conta contaBack = bancoFacade.procurarConta(conta);
		
		System.out.println(contaBack.getNumero());	
		
	}
}
