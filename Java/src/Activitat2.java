import java.util.Scanner;

public class Activitat2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime una distancia en kilometros");
		java.util.Scanner lector = new Scanner(System.in);
		int kilo =lector.nextInt();
		System.out.println("--------------------------");
		System.out.println(distancia(kilo)+" distancia en metros");
	}
	 public static float distancia(int a){
		  int metros = a*1000;
		return metros ;
		  
	  }
}
