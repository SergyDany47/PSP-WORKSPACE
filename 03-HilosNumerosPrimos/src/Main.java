import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca el primer numero");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero");
		int numero2 = sc.nextInt();
		System.out.println("Introduzca el tercer numero");
		int numero3 = sc.nextInt();

		Hilos hilo1 = new Hilos(numero1);
		hilo1.setName("Hilo del n�mero " + numero1);

		Hilos hilo2 = new Hilos(numero2);
		hilo2.setName("Hilo del n�mero " + numero2);

		Hilos hilo3 = new Hilos(numero3);
		hilo3.setName("Hilo del n�mero " + numero3);

		hilo1.start();
		hilo2.start();
		hilo3.start();
		
		

	}

}