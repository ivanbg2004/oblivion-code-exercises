import java.util.Scanner;
public class bulean {
	public static void main(String[] arg){
Scanner sc = new Scanner(System.in);
System.out.println("Escribe tu edad: ");
int edad = sc.nextInt();
boolean mayorEdad = edad >= 18;
System.out.println("Mayoría de edad: " + mayorEdad);
	}
}
