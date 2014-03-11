package br.unipe.mpl.banco.conta.facade;

import br.unipe.mpl.banco.conta.cadastros.CadastroContas;
import br.unipe.mpl.banco.conta.dados.contas.RepositorioContasArray;
import br.unipe.mpl.banco.contas.Conta;

/**
 * 
 * Classe Facade.
 * 
 * @author Jefferson
 * 
 */
public class BancoFacade {
	
	private CadastroContas contas;
	
	private static final int CAPACIDADE = 100;
	
	/**
	 * Construtor da classe BancaFacade
	 */
	public BancoFacade() {
		contas = new CadastroContas(new RepositorioContasArray(CAPACIDADE));
	}
	
//	Operacoes para conta
	/**
	 * 
	 * @param conta
	 */
	public void cadastrarConta(Conta conta) {
		contas.cadastrar(conta);
	}
	
	/**
	 * 
	 * @param placa
	 * @return
	 */
	public Conta procurarConta(Conta conta) {
		return contas.procurar(conta);
	}

	/**
	 * 
	 * @param placa
	 */
	public void removerConta(Conta conta) {
		contas.apagar(conta);
	}
	
	/**
	 * 
	 * @param conta
	 */
	public void atualizarConta(Conta conta) {
		contas.atualizar(conta);
	}
	
	
//	Operacoes para clientes do banco
	
	
//	Operacoes para outras entidades relacionadas ao meu sistema banc‡rio
}
