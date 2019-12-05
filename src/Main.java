import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("|==============Calculadora==============|");
		
		double x;
		double y;
		double z;
		int opcao;
		Scanner in = new Scanner(System.in);

		System.out.println();
		System.out.println("|------------Inserir calculo------------|");
		System.out.println("|1 -           Multiplicar;             |");
		System.out.println("|2 -             Dividir;               |");
		System.out.println("|3 -              Somar;                |");
		System.out.println("|4 -            Subtrair;               |");
		System.out.println("|_______________________________________|");
		
		opcao = in.nextInt();
		
		switch (opcao){
			case 1:
				System.out.print("Introduzir um valor:_");
				x = in.nextInt();
				System.out.print("Introduzir outro valor:_");
				y = in.nextInt();
				z = x * y;
				System.out.println(x + " x " + y + " = " + z);
				break;
			case 2:
				System.out.print("|-------Introduzir valor numérico:------|");
				y = in.nextInt();
				z = x / y;
				System.out.println(x + " : " + y + " = " + z);
				break;
			case 3:
				System.out.print("|-------Introduzir valor numérico:------|");
				y = in.nextInt();
				z = x + y;
				System.out.println(x + " + " + y + " = " + z);
				break;
			case 4:
				System.out.print("|-------Introduzir valor numérico:------|");
				y = in.nextInt();
				z = x - y;
				System.out.println(x + " - " + y + " = " + z);
				break;
			default:
				System.out.println("|-------Introduziu um valor errado. Tente novamente.------|");
				// reiniciar a switch
		}
	}
}
				
