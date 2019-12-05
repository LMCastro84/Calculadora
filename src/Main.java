import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		System.out.println("|==============CALCULADORA==============|");
		
		double x;
		double y;
		double z;
		int opcao;
		boolean loop;
		
		Scanner in = new Scanner(System.in);

		System.out.println();
		System.out.println("|--------------Operaçãoes---------------|");
		System.out.println("|1 -           Multiplicar              |");
		System.out.println("|2 -             Dividir                |");
		System.out.println("|3 -              Somar                 |");
		System.out.println("|4 -            Subtrair                |");
		System.out.println("|_______________________________________|");
		
		do {
			System.out.println("Escolha uma operação aritmética:_");
			opcao = in.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.print("Introduzir um valor:_");
					x = in.nextInt();
					System.out.print("Introduzir outro valor:_");
					y = in.nextInt();
					z = x * y;
					System.out.println(x + " x " + y + " = " + z);
					break;
				case 2:
					System.out.print("Introduzir um valor:_");
					x = in.nextInt();
					System.out.print("Introduzir outro valor:_");
					y = in.nextInt();
					z = x / y;
					System.out.println(x + " : " + y + " = " + z);
					break;
				case 3:
					System.out.print("Introduzir um valor:_");
					x = in.nextInt();
					System.out.print("Introduzir outro valor:_");
					y = in.nextInt();
					z = x + y;
					System.out.println(x + " + " + y + " = " + z);
					break;
				case 4:
					System.out.print("Introduzir um valor:_");
					x = in.nextInt();
					System.out.print("Introduzir outro valor:_");
					y = in.nextInt();
					z = x - y;
					System.out.println(x + " - " + y + " = " + z);
					break;
				default:
					System.out.println("Seleccionou uma opção incorrecta. Tente novamente.");
			}
		} while (loop = false);
	}
}
				
