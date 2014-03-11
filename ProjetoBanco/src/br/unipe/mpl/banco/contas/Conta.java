package br.unipe.mpl.banco.contas;

/**
 * 
 * Classe Conta.
 * 
 * @author jefferson
 *
 */
public class Conta {
	
	protected double saldo;
	private String numero;
	
	public Conta(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void creditar(double valor) {
		this.saldo = saldo + valor;
	}
	
	public void debitar(double valor) {
		this.saldo = saldo - valor;
	}
	
	public void atualizaConta(double taxa) {
		this.saldo =  (saldo * taxa) + this.saldo;
	}
}
