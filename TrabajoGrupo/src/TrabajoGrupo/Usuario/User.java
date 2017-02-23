package TrabajoGrupo.Usuario;
import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
	public static String[] user(String ver) {
		Scanner lector = new Scanner(System.in);
		int amics=0;
		int fila1=0;
		int opcion=-1;
		/*String [] columnes= new String[3];
		columnes[0]="nom";
		columnes[1]="gols equip local";
		columnes[2]="gols equip visitant";	
*/
		System.out.println("Cuantos usuarios quereis hechar una porra?");
		try {

			 amics=lector.nextInt();

 		 }catch(InputMismatchException e)  {

 			 // Controlamos que siempre introduzca un valor numerico

 			 System.out.println("El valor tiene que ser numerico...");

 			 lector.nextLine();

 			 opcion=-1;
 		 	
		 }
		
		String[] porra= new String[amics];
		for(int columnas=0;columnas<porra.length;columnas++){
			System.out.println("Dime tu nombre de usuario"+columnas);
			porra[columnas]= lector.next();
			ver=porra[columnas];
			
		}
	
		return porra  ;
		
		
	}
	
	
}
