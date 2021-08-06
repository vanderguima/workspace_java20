// Private é para encapsulamento/blindagem

public class Conta {
	private int numeroConta;
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public int getDigitoVerif() {
		return digitoVerif;
	}
	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getCpfTitular() {
		return cpfTitular;
	}
	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;
	private double valor;
	
	String exibir() {
		
		return "Conta "+numeroConta+"/"+digitoVerif+ "\n"+
				"Titular: "+nomeTitular+"("+cpfTitular+")"+ "\n"+
				"Saldo : R$ "+saldo;
	}
	void depositar (double valor) {
		saldo = saldo + valor;
	}
	boolean sacar(double valor) {
		if (saldo >=valor) {
			saldo = saldo - valor;
			return true;
		}
		return false;
		}
}
