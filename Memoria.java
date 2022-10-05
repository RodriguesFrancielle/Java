import java.io.InputStream;
import java.util.Scanner;

public class Memoria{
	
	//atributo
	private double memoria;
	private double num1;
	private double num2;
	
	
	Scanner tc = new Scanner(System.in); 
	
	
	
	//construtor
	public Memoria(InputStream in) {
		this.memoria = (double) memoria;
		this.num1 = (double) num1;
		this.num2 = (double) num2;
	}
	
	

	//método de trabalho
	public double somar(double num1, double num2) {
		this.memoria =  num1 + num2;
		return this.memoria;
	}
	
	public double subtrair(double num1, double num2) {
		return num1 - num2;
	}
	
	public double  dividir(double num1, double num2) {
		return num1 / num2;
	}
	public double  multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	
	
	
	public void addMemoria() {
		
	}
	
	public void clrMemoria() {
		
	}
	public void getMemoria() {
		
	}

}
