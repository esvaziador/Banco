package banco;

import java.util.*;

public class Banco{
	private ArrayList<ContaBancaria> contas = new ArrayList<ContaBancaria>();
	
	private ContaBancaria buscarConta(String numero){
		ContaBancaria conta = null;
		for (int i = 0; i < contas.size(); conta = contas.get(i))
			if (conta.getNumeroDaConta().equals(numero))
				return conta;
		return null;
	}
	
	public boolean criarConta(String nome, String numero, double valor){
		if (buscarConta(numero) == null)
			return false;
		
		ContaBancaria conta = new ContaBancaria();
		conta.setTitular(nome);
		conta.setNumeroDaConta(numero);
		conta.setSaldo(valor);
		contas.add(conta);
		return true;
	}
	
	public void adicionarConta(ContaBancaria conta){
		contas.add(conta);
	}
	
	public void removerConta(ContaBancaria conta){
		contas.remove(conta);
	}
}
