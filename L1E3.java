import java.util.Scanner;

public class L1E3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);
		
		char operacao = ' ';
		
		double altura;
		double peso;
		double resultado = 0;
		
		System.out.println("Digite sua Altura:");
		altura = tc.nextDouble();
		
		System.out.println("Digite seu Peso:");
		peso = tc.nextDouble();
		
		resultado = peso / (altura * altura);
		System.out.println("Resultado: " + resultado);
		
		if (resultado <16 & resultado <16.9){
			System.out.println("Muito abaixo do peso");
			}

		else if (resultado >=17 & resultado <18.4){
	    	 System.out.println("Abaixo do peso");
	      }
		else if (resultado >=18.5 & resultado <24.9){
	    	 System.out.println("Peso Normal");
	     }
		else if (resultado >=25 & resultado <29.9){
	    	 System.out.println("Acima do peso");
	     }
		else if (resultado >=30 & resultado <34.9){
	    	 System.out.println("Obesidade grau I");
	     }
		else if (resultado >=35 & resultado <40){
	    	 System.out.println("Obesidade grau II");
	     }
		else if (resultado >40 & resultado >40){
	    	 System.out.println("Obesidade grau III");
	     }
	}
}
