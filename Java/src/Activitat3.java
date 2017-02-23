import java.util.Scanner;

public class Activitat3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner lector = new Scanner(System.in);
		System.out.println("Dame un numero entero");
		int primero =lector.nextInt();
		System.out.println("Dame el segundo numero entero");
		int segundo =lector.nextInt();
		System.out.println(distancia(primero,segundo));
	}
	 public static float distancia(int primero, int segundo){
		  if (primero>segundo){
			  return segundo;
		  }
		  else{
			  return primero;
		  }
		  }
}
