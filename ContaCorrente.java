
public class ContaCorrente extends ContaBancaria {

	/**
	 * Metodo para Descontar da conta a taxa de manutenção
	 */
	@Override
	public double calcularSaldo() {
		saldo -= (saldo * 10)/100 ;
		return saldo;
	}
}
