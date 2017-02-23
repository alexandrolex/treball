package TrabajoGrupo;

import java.util.InputMismatchException;
import java.util.Scanner;
import TrabajoGrupo.Usuario.User;
import TrabajoGrupo.apuesta.apuesta;
import TrabajoGrupo.generator.generatorMatches;

public class Trabajo {
	
	final static String[] teams = {"FC Barcelona","Real Madrid","Sevilla FC","Espanyol","Betis","Osasuna","Zaragoza","Rayo Vallecano","Nastic TGN","SPerez FC"};
	final static double[] quTeams = {1.75,1.75,1.6,1.2,1.1,1.1,0.9,0.7,0.6,0.5};
	final static double localidad=1.3;
	final static double visitante=0.75;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);//Variables creadas.
		int menu = 0;
		int menu2 = 0;
		String ver="";
		String ver2="";
		int opcion=-1;
		
		//String[][] porra= new String[][];
		 
		do {
			System.out.println("1: Introduce usuario");
			System.out.println("2: Ver partidos");
			System.out.println("3: Seleccionar partidos");
			System.out.println("4: Exit");
			try {

				 menu = lector.nextInt();

      		 }catch(InputMismatchException e)  {

      			 // Controlamos que siempre introduzca un valor numerico

      			 System.out.println("El valor tiene que ser numerico...");

      			 lector.nextLine();

      			 opcion=-1;

      		 	
			 }
			switch (menu) {
			case 1:
				
				String usuarios[]=User.user(ver2);
				for (int fila=0;fila<usuarios.length;fila++){
				System.out.print("usuarios "+fila+" -> "+
						 usuarios[fila]+"\n");}
				break;
			case 2:
				String[][] partidos=generatorMatches.matchesGenerator(teams,quTeams);
				for (int fila=0;fila<partidos.length;fila++){
					 System.out.print("Partido "+(fila+1)+" -> "+
					 partidos[fila][0] + " "+ partidos[fila][1]+"\n");}
				break;
			case 3:
				//apuesta.apuesta(ver2);
				System.out.println("1: Ver Resultados");
				System.out.println("2: Ver Ganador");
				System.out.println("3: Atras");
				menu2 = lector.nextInt();
				do {
					switch (menu2) {
					case 1:
						int[][] resultados=generatorMatches.resultGenerator();
						for (int fila=0;fila<resultados.length;fila++){
							 System.out.print("Partido "+fila+" -> "+
							 resultados[fila][0] + " "+ resultados[fila][1]+"\n");}
						break;
					case 2:
						break;
					case 3:
						break;
					}

				} while (menu2 != 3);

				break;
			}

		} while (menu != 4);

	}
	
}
