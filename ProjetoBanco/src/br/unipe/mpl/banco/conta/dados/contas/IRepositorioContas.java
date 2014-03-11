package br.unipe.mpl.banco.conta.dados.contas;

import br.unipe.mpl.banco.contas.Conta;

/**
 * Interface IRepositorioContas
 * @author jefferson
 * 
 */
public interface IRepositorioContas {
	
	void inserir(Conta conta);
	Conta procurar(String numero);
	void remover(String numero);
	void atualizar(Conta conta);
	boolean existe(String numero);
}
