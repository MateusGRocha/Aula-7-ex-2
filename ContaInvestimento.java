
public class ContaInvestimento extends ContaBancaria {
	
	/**
	 * Metodo para Adicionar a Conta o Juros
	 */

	@Override
	public double calcularSaldo() {
		return saldo = ((saldo * 5)/100) + saldo;
	}
}
