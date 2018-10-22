
public abstract class ContaBancaria extends Aplicacao {

	protected double saldo;
	/**
	 * Metodo para Transferencia de dinheiro e suas validacoes
	 * @param contaOrigem
	 * @param contaDestino
	 * @param valor
	 * @return
	 */
	public double transferir(ContaBancaria contaOrigem, ContaBancaria contaDestino, double valor) {
		contaDestino.depositar(valor);
		//Validacao para que o valor sacado não exceda o valor do saldo
		if(valor > saldo) {
			System.out.println("Vc tentou transferir " + valor + ", seu saldo é de " + saldo);
			return saldo;
		}
		else {
			saldo -= valor;
			System.out.println("Vc Transferiu " + valor + " de sua conta!");
			return saldo;
		}

	}
	
	/**
	 * Metodo para Sacar e suas validacoes
	 * @param valor
	 * @return saldo
	 */
	public double sacar(double valor) {
		//Validacao para que o valor sacado não exceda o valor do saldo
		if(valor > saldo) {
			System.out.println("Vc tentou sacar " + valor + ", seu saldo é de " + saldo);
			return saldo;
		}
		else {
			saldo -= valor;
			System.out.println("Vc Sacou " + valor + " de sua conta!");
			return saldo;
		}
	}	
	
	/**
	 * Metodo para fazer um Deposito e suas validacoes
	 * @param valor
	 * @return
	 */
	public double depositar(double valor) {
		//Validacao para Saber se foi depositado um numero negativo ou Zero
		if (valor <= 0) {
			System.out.println("Valor Negativo ou Zero!");
			return saldo;
		}
		else {
			 saldo += valor;
			System.out.println("Vc depositou " + valor + " em sua conta!");
			return saldo;
		}

	}
	public double calcularSaldo(){
		return saldo;
	}
	
	/**
	 * Metodos Get
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}
	
}
