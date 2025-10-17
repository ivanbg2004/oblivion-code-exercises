import java.util.Scanner;
public class Años {
	public static void main (String[] arg){
		int edad ; 
		Scanner sc = new Scanner(System.in);
		System.out.print ("Escribe tu edad: ");
		edad = sc.nextInt();
		edad = ++ edad;
		System.out.println("El año que viene usted tendrá: " + edad + " años ");
	}
}