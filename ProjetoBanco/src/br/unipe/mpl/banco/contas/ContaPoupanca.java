package br.unipe.mpl.banco.contas;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(String numero, double saldo) {
		super(numero, saldo);
	}
	
	public void atualizaConta(double taxa) {
		this.saldo = this.saldo + (this.saldo * taxa * 3);
	}
}
