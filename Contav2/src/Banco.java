import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		int opcao;
		double valor;
		
		Conta c1;
		c1 = new Conta();
		c1.setNumeroConta(12345);
		c1.setDigitoVerif(6);
		c1.setNomeTitular("Professor Isidro");
		c1.setCpfTitular("123.222.333-000");
		c1.setSaldo(200.00);
		// Menu
		
		do {
			System.out.println("Bem vindo ao Banco X");
			System.out.println("Digite 1 - Info / 2 - Depósito / 3 -Saque / 0 - Encerrar");
			opcao = teclado.nextInt();
						switch (opcao) {
			case 1:
				System.out.println(c1.exibir());
				break;
			
			case 2: 
				System.out.println("[DEPOSITO] Digite o Valor:");
				valor = teclado.nextDouble();
				c1.depositar(valor);
				break;
				
			case 3:
				
				System.out.println("[SAQUE ] Digite o Valor:");
				valor = teclado.nextDouble(); 
				if (c1.sacar(valor)) {
					System.out.println(" Saque Autorizado:");
				} else { 
					System.out.println("  Saldo Insuficiente:");
				} 
				break;
				
			case 0:
				System.out.println(" ----> Obrigado pela Preferência");
				break;
				
				default:
					System.out.println(" ERRO - Opção Inválida");
					break;
						}
		} while (opcao != 0);
		
		teclado.close();
				
				}
	
		
	}
	
