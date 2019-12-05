import java.util.Scanner;
public class Inicio {
	public static int x;
	public static int y;
	public static double z;
	
	public static void reinicio() {
		Scanner in = new Scanner(System.in);
		x = in.nextInt();
		int opcao = 0;
		System.out.println();
		System.out.println("|------------Inserir calculo------------|");
		System.out.println("|1 -           Multiplicar;             |");
		System.out.println("|2 -             Dividir;               |");
		System.out.println("|3 -              Somar;                |");
		System.out.println("|4 -            Subtrair;               |");
		System.out.println("|5 -              Sair.                 |");
		System.out.println("|_______________________________________|");
		opcao = in.nextInt();
		
		do {
		switch (opcao){
			case 1:
				System.out.print("|-------Introduzir valor numérico:------|");
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
			case 5:
				System.out.println("Adeus!");
				break;
			default:
				System.out.println("|-------Introduziu um valor errado. Tente novamente.------|");
			
			}
			opcao = 0;
			}while (opcao != 5);
//		System.out.println("teste");
	}
}