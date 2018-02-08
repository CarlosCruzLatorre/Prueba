import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "";
		String apellido1 = "";
		String apellido2 = "";
		String nick = "";
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Dame un nombre: ");
		nombre = scan.nextLine();
		System.out.print("Dame el primer apellido: ");
		apellido1 = scan.nextLine();
		System.out.print("Dame el segundo apellido: ");
		apellido2 = scan.nextLine();
		
		if(nombre.length()>=3 && apellido1.length()>=3 && apellido2.length()>=3) {
			nick = (apellido1.substring(0, 3) + apellido2.substring(0, 3) + nombre.substring(0, 3));
			System.out.println(nick.toUpperCase());
		}
		
		while (nombre.length()<3 || apellido1.length()<3 || apellido2.length()<3) {
			if(nombre.length()<3) {
				nick = (apellido1.substring(0, 3) + apellido2.substring(0, 3) + nombre.substring(0, nombre.length()));
				System.out.println(nick.toUpperCase());
				break;
			}
			if(apellido1.length()<3) {
				nick = (apellido1.substring(0, apellido1.length()) + apellido2.substring(0, 3) + nombre.substring(0, 3));
				System.out.println(nick.toUpperCase());
				break;
			}
			if(apellido2.length()<3) {
				nick = (apellido1.substring(0, 3) + apellido2.substring(0, apellido1.length()) + nombre.substring(0, 3));
				System.out.println(nick.toUpperCase());
				break;
			}
		}
	}
}
