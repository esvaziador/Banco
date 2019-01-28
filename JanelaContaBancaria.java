package banco;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JanelaContaBancaria extends JFrame{
	ContaBancaria conta;
	JTextField campoDeValor;
	JTextArea textoSaldoAtual;
	JTextArea saldoAtual;
	
	JButton botao1;
	JButton botao5;
	JButton botao10;
	JButton botao20;
	JButton botao50;
	JButton botao100;
	JButton botaoSacar;
	JButton botaoDepositar;
	
	public JanelaContaBancaria(){
		conta = new ContaBancaria();
		campoDeValor = new JTextField();
		textoSaldoAtual = new JTextArea("Saldo atual:");
		saldoAtual = new JTextArea(String.valueOf(conta.getSaldo()));
		
		botao1 = new JButton("1");
		botao5 = new JButton("5");
		botao10 = new JButton("10");
		botao20 = new JButton("20");
		botao50 = new JButton("50");
		botao100 = new JButton("100");
		botaoSacar = new JButton("Sacar");
		botaoDepositar = new JButton("Depositar");
		
		Container pp = super.getContentPane();
		Container painelBotoes = new JPanel();
		Container painelSaldo = new JPanel();
		Container painelValor = new JPanel();
		
		pp.setLayout(new BorderLayout());
		painelBotoes.setLayout(new GridLayout(4,2));
		painelSaldo.setLayout(new GridLayout(1,2));
		painelValor.setLayout(new GridLayout(1,1));
		
		painelBotoes.add(botao1);
		painelBotoes.add(botao5);
		painelBotoes.add(botao10);
		painelBotoes.add(botao20);
		painelBotoes.add(botao50);
		painelBotoes.add(botao100);
		painelBotoes.add(botaoSacar);
		painelBotoes.add(botaoDepositar);
		
		painelSaldo.add(textoSaldoAtual);
		painelSaldo.add(saldoAtual);
		
		painelValor.add(campoDeValor);
		
		pp.add(painelValor, BorderLayout.NORTH);
		pp.add(painelBotoes, BorderLayout.CENTER);
		pp.add(painelSaldo, BorderLayout.SOUTH);
		
		
		
		botao1.addActionListener(new ControladorContaBancaria(botao1));
		botao5.addActionListener(new ControladorContaBancaria(botao5));
		botao10.addActionListener(new ControladorContaBancaria(botao10));
		botao20.addActionListener(new ControladorContaBancaria(botao20));
		botao50.addActionListener(new ControladorContaBancaria(botao50));
		botao100.addActionListener(new ControladorContaBancaria(botao100));
		botaoDepositar.addActionListener(new ControladorContaBancaria(botaoDepositar));
		botaoSacar.addActionListener(new ControladorContaBancaria(botaoSacar));
		
		super.setSize(300, 500);
		atualizarDisplay();
		super.setVisible(true);
	}
	
	public class ControladorContaBancaria implements ActionListener{
		JButton botao;
		
		public ControladorContaBancaria(JButton botaoClicado){
			botao = botaoClicado;
		}
		
		public void actionPerformed(ActionEvent e){
			if (botao == botao1){
				conta.um();
			} else if (botao == botao5){
				conta.cinco();
			} else if (botao == botao10){
				conta.dez();
			} else if (botao == botao20){
				conta.vinte();
			} else if (botao == botao50){
				conta.cinquenta();
			} else if (botao == botao100){
				conta.cem();
			} else if (botao == botaoDepositar){
				conta.depositar();
			} else if (botao == botaoSacar){
				conta.sacar();
			} else {
				
			}
			atualizarDisplay();
		}
	}
	
	public void atualizarDisplay(){
		campoDeValor.setText(conta.getDisplay());
		saldoAtual.setText(String.valueOf(conta.getSaldo()));
	}
}
