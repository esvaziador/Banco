package banco;

public class ContaBancaria{
	private String titular;
	private String numeroDaConta;
	private String display = "0.0";
	private double saldo = 0.0;
	
	//------------GET's e SET's-------------
	
	public String getTitular(){
		return this.titular;
	}
	
	public String getNumeroDaConta(){
		return numeroDaConta;
	}
	
	public String getDisplay(){
		return display;
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
	
	public void setDisplay(String novoDisplay){
		display = novoDisplay;
	}
	
	public void setSaldo(double valor){
		this.saldo = valor;
	}
	
	//----------------ATRIBUTOS-----------------
	
	public void sacar(){
		this.saldo = this.saldo - Double.valueOf(this.getDisplay());
		this.display = "0.0";
	}
	
	public void depositar(){
		this.saldo += Double.valueOf(this.getDisplay());;
		this.display = "0.0";
	}
	
	public void transferir(double valor, ContaBancaria conta){
		conta.saldo += valor;
		this.display = "0.0";
	}
	
	public void um(){
		double temp = Double.valueOf(this.getDisplay());
		temp++;
		this.display = String.valueOf(temp);
	}
	
	public void cinco(){
		double temp = Double.valueOf(this.getDisplay());
		temp += 5;
		this.display = String.valueOf(temp);
	}
	
	public void dez(){
		double temp = Double.valueOf(this.getDisplay());
		temp += 10;
		this.display = String.valueOf(temp);
	}
	
	public void vinte(){
		double temp = Double.valueOf(this.getDisplay());
		temp += 20;
		this.display = String.valueOf(temp);
	}
	
	public void cinquenta(){
		double temp = Double.valueOf(this.getDisplay());
		temp += 50;
		this.display = String.valueOf(temp);
	}
	
	public void cem(){
		double temp = Double.valueOf(this.getDisplay());
		temp += 100;
		this.display = String.valueOf(temp);
	}
}
