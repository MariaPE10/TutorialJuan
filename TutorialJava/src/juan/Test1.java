package juan;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		boolean bollo = false;
		String nombre = "abcd";		
		
		// operadores logicos y condicionales
		
		boolean variableVerdad = true;
		boolean variableMentira = false;
		
		// condicional if
		
		/* 
		 * 
		 * true y true -> true
		 * true y false -> false
		 * false y false -> false
		 * false y true -> false
		 * 
		 * true o true -> true
		 * true o false -> true
		 * false o false -> false
		 * false o true -> true 
		 * 
		 */
		
		
		
		if (nombre.length() > 3) {
			System.out.println("la longitud de nombre es mayor que 3");
		} else if(nombre.length() < 3) {
			System.out.println("la longitud de nombre es menor que 3");
		} else if (nombre.length() == 3){
			System.out.println("la longitud de nombre es 3");
		}
		
		if (nombre.length() > 3) {
			System.out.println("saturno");
		} else if(nombre.length() < 3) {
			System.out.println("urano");
		} else if (nombre.length() == 3){
			System.out.println("apple");
		}
		
		if (nombre.length() > 3) {
			System.out.println("x");
		} else if(nombre.length() < 3) {
			System.out.println("y");
		} else if (nombre.length() == 3){
			System.out.println("z");
		}	
		
		System.out.println("Enter your username: ");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		System.out.println("Your username is " + username);
		
	}	
	
//	public String comprobarTamanio(int longitudCadena) {
//		if (nombre.length() > 3) {
//			System.out.println("la longitud de nombre es mayor que 3");
//		} else if(nombre.length() < 3) {
//			System.out.println("la longitud de nombre es menor que 3");
//		} else if (nombre.length() == 3){
//			System.out.println("la longitud de nombre es 3");
//		}
//		
//		return "";
//	}
	
}