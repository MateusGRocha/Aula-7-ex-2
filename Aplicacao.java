
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciando novas Contas
		ContaBancaria c1 = new ContaCorrente();
		ContaBancaria c2 = new ContaCorrente();
		ContaCorrente corrente = new ContaCorrente();
		ContaInvestimento invest = new ContaInvestimento();
		

		//Atribuindo valores as contas, Fazendo transferencias, Depositos e Saques
		c1.depositar(1000);
		c1.sacar(2000);
		c1.sacar(200);
		c1.transferir(c1, c2, 200);
		
		invest.depositar(1000);
		corrente.depositar(1000);
		invest.calcularSaldo();
		corrente.calcularSaldo();
		
		//imprimindo os saldos
		System.out.println(c1.getSaldo());
		System.out.println(c2.getSaldo());
		
		System.out.println(invest.getSaldo());
		System.out.println(corrente.getSaldo());
	}

}
