
public class ContaCorrente {
	// vamos apenas declarar as variáveis que compoem o tipo ContaCorrente	
		int numconta;
		int digverificador;
		String nometitular;
		String cpftitular;
		double saldo;
	
		
		void exibirInfo() {
			System.out.println(" Conta Corrente:" +numconta + "-" +digverificador);
			System.out.println(" Cliente:" +nometitular);
			System.out.println(" CPF:" +cpftitular);
			System.out.printf(" Saldo:" + " R$ " +saldo +"\n");
		}
			void depositar (double valor) {
				saldo = saldo + valor; 
			}
		}
		
		