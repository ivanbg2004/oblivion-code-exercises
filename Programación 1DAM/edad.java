import java.util.Scanner;
public class edad {
	public static void main (String[] arg){
	System.out.println("Escribe tu edad");
	Scanner intro = new Scanner(System.in);
	int edad = intro.nextInt();
	System.out.print(" Tienes " + edad + " años " );
	}
}