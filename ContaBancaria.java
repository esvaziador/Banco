package banco;

public class ContaBancaria{
	private String titular;
	private String numeroDaConta;
	private double saldo = 0.0;
	
	//------------GET's e SET's-------------
	
	public String getTitular(){
		return this.titular;
	}
	
	public String getNumeroDaConta(){
		return numeroDaConta;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void setTitular(String nome){
		this.titular = nome;
	}
	
	public void setNumeroDaConta(String numero){
		this.numeroDaConta = numero;
	}
	
	public void setSaldo(double valor){
		this.saldo = valor;
	}
	
	//----------------ATRIBUTOS-----------------
	
	public void sacar(double valor){
		this.saldo = this.saldo - valor;
	}
	
	public void depositar(double valor){
		this.saldo += this.saldo + valor;
	}
	
	public void transferir(double valor, ContaBancaria conta){
		conta.saldo += valor;
	}
	
}
