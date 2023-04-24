package view;

import controller.RetornoController;

public class Main {

	public static void main(String[] args) {
		
		RetornoController control = new RetornoController();
		
		int num = (int) (Math.random() * 999991 ) + 10;
		String valor = Integer.toString(num);
		String [] vt = valor.split("");
		int tamvt = vt.length;
		
		int var = (int) (Math.random() * 10 ) + 0;
		String vartxt = Integer.toString(var); 
		int qtd = 0;
		
		int resultado = control.CalculaDig(vt, tamvt, vartxt, qtd);
		System.out.println("O número gerado foi: " + num + "\nO número " + var + " se repete: " + resultado);
	}
}
