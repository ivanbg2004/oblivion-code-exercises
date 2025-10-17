import java.util.Scanner;
public class Nacimiento {
	public static void main(String [] args) {
int aActual;
int aNacimiento;		
int edad;
Scanner sc =  new Scanner(System.in);
System.out.print("Año de nacimiento: ");
aNacimiento = sc.nextInt();
System.out.print("Año actual: ");
aActual = sc.nextInt();
edad = aActual-aNacimiento;
System.out.print("Su edad es: "+ edad + " años");
	}
}