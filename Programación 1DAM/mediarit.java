import java.util.Scanner;
public class mediarit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double nota1;
		double nota2;
		double media;
		System.out.println("Nota1: ");
		nota1 = sc.nextDouble();
		System.out.println("Nota2: ");
		nota2 = sc.nextDouble();
		media = (nota1 + nota2) / 2.0;
		System.out.println("La nota media es :" +media); 
	}
}
