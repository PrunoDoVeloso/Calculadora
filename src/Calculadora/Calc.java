package Calculadora;

import java.util.Scanner;
public class Calc {
	
	public int som(int num1, int num2) {
		return num1 + num2;
	}
	public int sub(int num1, int num2){
		return num1 - num2;
	}
	public int div(int num1,int num2){
		return num1 / num2;
	}
	public int mult(int num1, int num2){
		return num1 - num2;
	}
	public static void main (String args[]){
		Calc c = new Calc();
		int opcao = 5;
		int num1;
		int num2;
	      Scanner input = new Scanner(System.in);  
	    System.out.println("1.Soma");  
	    System.out.println("2.Subtracao");  
	    System.out.println("3.Multiplicacao");  
	    System.out.println("4.Divisao");  
	    System.out.println("0.Sair");  
	    System.out.println("Operação: ");  
	    opcao = input.nextInt();
	  
}
}