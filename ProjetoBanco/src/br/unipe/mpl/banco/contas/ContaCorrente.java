package br.unipe.mpl.banco.contas;

public class ContaCorrente extends Conta {
	
	public ContaCorrente(String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void atualizaConta(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa * 2);	
	}
	
	public void debitar(double valor) {
		this.saldo = this.saldo - valor - 0.10;
	}
}
