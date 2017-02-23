import java.util.Scanner;

public class activitat5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("calcula el descuento");
		System.out.println("--------------------------");
		java.util.Scanner lector = new Scanner(System.in);
		System.out.println("--------------------------");
		System.out.println("quantitat comprada");
		float comprada =lector.nextInt();
		System.out.println("--------------------------");
		System.out.println(" introdueix el preu real ");
		float real =lector.nextInt();
		System.out.println("--------------------------");
		System.out.println(" introdueix el preu pagat ");
		float pagat =lector.nextInt();
		System.out.println(cantidad(comprada,real,pagat));
	}
	 public static float cantidad(float preu1,float preu2,float preu3){
		 float total1= preu2-preu3;
		 float total = (total1*100)/preu2;
		return total ;
		  
	  }
}
