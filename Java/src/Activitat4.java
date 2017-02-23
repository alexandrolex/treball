import java.util.Scanner;

public class Activitat4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dime una distancia en millas");
		java.util.Scanner lector = new Scanner(System.in);
		float millas =lector.nextInt();
		System.out.println("--------------------------");
		System.out.println(distancia(millas)+" distancia en quilometros");
	}
	 public static float distancia(float millas){
		 float marina = millas/1852;
		return marina ;
		  
	  }
}
