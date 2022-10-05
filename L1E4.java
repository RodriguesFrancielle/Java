import java.util.Scanner;

public class L1E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner tc = new Scanner(System.in);


		double altura;
		double genero;
		double resultado = 0;
		
		System.out.println("Digite sua Altura:");
		altura = tc.nextDouble();
		
		System.out.println("Digite seu Genero M/F: ");
		genero = tc.next().charAt(0);
		
		if(genero == 'm' || genero == 'M') {
			
			resultado = 72.7 * altura - 58;
			System.out.println("Seu Peso Ideal é: " + resultado);
			
		} else if (genero == 'f' || genero == 'F') {
			resultado = 62.1 * altura - 44.7;
			System.out.println("Seu Peso Ideal é: " + resultado);
		} else if (genero != 'f' || genero != 'F' || genero != 'm' || genero != 'M') {
			System.out.println("Opção Inválida");
		}
	}

}
