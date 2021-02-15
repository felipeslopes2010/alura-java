package br.com.bytebank.banco.modelo;


/**
 *  Classe representa a moldura de uma conta
 * @author Felipe Santos Lopes
 *
 */

public abstract class Conta {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir da agencia e numero
	 * @param agencia
	 * @param numero
	 */

	public Conta(int agencia, int numero) {
		//Conta.total++;
		//System.out.println("O total de contas é: " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("Estou criando uma conta " + this.numero);
	}

	public abstract void deposita(double valor);
	
	/**
	 * Valor precisa ser menor ou igual ao saldo
	 * @param valor
	 * @throws SacaException
	 */

	public void saca(double valor) throws SacaException {
		if (this.saldo < valor) {
			throw new SacaException("Saldo: " + this.saldo + ", Valor: " + valor);
		}
		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SacaException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Numero negativo, tente novamente");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Numero negativo, tente novamente");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return titular;
	}

	public static int getTotal() {
		return Conta.total;
	}
	
	@Override
	public String toString() {
		return "Numero: " + this.numero + ", Agencia: " +this.agencia;
	}

}
