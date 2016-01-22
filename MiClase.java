import java.util.Scanner;

public class MiClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		
		System.out.print("Ingrese a: ");
		a = scanner.nextInt();
		System.out.print("Ingrese b: ");
		b = scanner .nextInt();
		
		int suma = a+b;
		System.out.print("a + b = " + suma);
		
	}

}
