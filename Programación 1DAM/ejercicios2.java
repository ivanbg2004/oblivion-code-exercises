import java.util.Scanner;
public class ejercicios2 {
	public static void main(String[] args) {
int num1;
int num2;
int suma;
int resta;
int multiplicacion;
int division;
int nombre;
Scanner sc = new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
nombre=sc.nextInt();
System.out.println("Escriba un número :" +num1);
System.out.println("Escriba un número :" +num2);
suma = num1 + num2;
resta= num1 - num2;
multiplicacion= num1 * num2;
division= num1 / num2;
System.out.println("El resultado de num1 es" +num1);
System.out.println("El resultado de num2 es" +num2);
System.out.println("El resultado de la suma es:" +suma);
System.out.println("El resultado de la resta es:" +resta);
System.out.println("El resultado de la multiplicacion es:" +multiplicacion);
System.out.println("El resultado de la division es:" +division);

}
	}