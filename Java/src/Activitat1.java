import java.util.Scanner;

public class Activitat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hola, anem a calcular l'area del triangle");
java.util.Scanner lector = new Scanner(System.in);
System.out.println("Quina alçada te el triange?");
float alcada =lector.nextFloat();
System.out.println("Quina base te el triange?");
float base =lector.nextFloat();

System.out.println(area(alcada,base));
	
	
	}
	  public static float area(float a, float b){
		  float triangulo = ((a*b)/2);
		return triangulo ;
		  
	  }

}
