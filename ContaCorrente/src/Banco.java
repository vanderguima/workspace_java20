
public class Banco {

public static void main(String args[]) {
	
	ContaCorrente titular1;
	ContaCorrente titular2;
	
	titular1 = new ContaCorrente();
	titular2 = new ContaCorrente();
	
	titular1.numconta = 12345;
	titular1.digverificador = 2;
	titular1.nometitular = "Vandeco";
	titular1.cpftitular = "278.000.987-09";
	titular1.saldo = 56789.98;
	
	titular2.numconta = 45236;
	titular2.digverificador = 3;
	titular2.nometitular = "Valdivia";
	titular2.cpftitular = "288.000.553-09";
	titular2.saldo = 267658.00;
	
	titular1.exibirInfo();
	titular2.exibirInfo();
			
	}
}