package br.unipe.mpl.banco.conta.cadastros;

import br.unipe.mpl.banco.conta.dados.contas.IRepositorioContas;
import br.unipe.mpl.banco.contas.Conta;

/**
 * 
 * Classe CadastroContas.
 * 
 * @author Jefferson
 * 
 */
public class CadastroContas {
	
	private IRepositorioContas contas;

	public CadastroContas(IRepositorioContas conta) {
		this.contas = conta;
	}
	
	/**
	 * 
	 * @param conta
	 * @throws ContaJaCadastradoException
	 */
	public void cadastrar(Conta conta) {
		
		if(!contas.existe(conta.getNumero())) { 
			contas.inserir(conta);
		} else {
			System.out.println("Conta j‡ cadastrado.");
		}
	}
	
	/**
	 * 
	 * @param conta
	 * @throws ContaNaoEncontradoException
	 */
	public void atualizar(Conta conta) {

		if(!contas.existe(conta.getNumero())) { 
			contas.atualizar(conta);
		} else {
			System.out.println("Conta n‹o encontrado.");
		}
	}

	/**
	 * 
	 * @param Conta
	 * @return
	 * @throws ContaNaoEncontradoException
	 */
	public Conta procurar(Conta conta) {

		if(!contas.existe(conta.getNumero())) { 
			System.out.println("Conta n‹o encontrado.");
			return null;
		} else {
			return contas.procurar(conta.getNumero());
		}
	}
	
	/**
	 * 
	 * @param conta
	 * @throws ContaNaoEncontradoException
	 */
	public void apagar(Conta conta) {

		if(!contas.existe(conta.getNumero())) { 
			contas.remover(conta.getNumero());
		} else {
			System.out.println("Conta n‹o encontrado(a).");
		}
	}
}
