
public class ContaCorrente extends ContaBancaria {

	/**
	 * Metodo para Descontar da conta a taxa de manuten��o
	 */
	@Override
	public double calcularSaldo() {
		saldo -= (saldo * 10)/100 ;
		return saldo;
	}
}
