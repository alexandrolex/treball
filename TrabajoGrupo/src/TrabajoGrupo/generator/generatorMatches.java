package TrabajoGrupo.generator;

public class generatorMatches {
	final static double localidad=1.3;
	final static double visitante=0.75;
	
	public static String[][] matchesGenerator(String[] teams, double[] quTeams){
		String[][] matches = new String[5][2];
		int[] positions = {0,1,2,3,4,5,6,7,8,9};
		int[][] results = new int[5][2];

		for (int t=0;t<matches.length;t++){
			for (int x=0;x<matches[t].length;x++){
				int var = 0;
				do{
					var = (int) Math.floor(Math.random()*10);
					if (!(positions[var]==10)){
						matches[t][x]=teams[var];
						results=resultGenerator(results,var,quTeams);
						positions[var]=10;
					}
					}while(matches[t][x]==null);
		
			}
		}
		return matches;
	}
	//////////////////////////Función para generar resultado
	public static int[][] resultGenerator(int [][] results, int var,  double[] quTeams){
		for (int n=0;n<results.length;n++){
			for (int m=0;m<results[n].length;m++){
				if (m==0){
					results[n][m]=gen(quTeams[var],localidad);
				}else{
					results[n][m]=gen(quTeams[var],visitante);
				}
			}
		}
		return results;
	}
	////////////////////////Función para generar goles
	public static int gen (double quTeams, double localidad){
		double a = Math.random()*0.9;
		double b = Math.round(a*(quTeams*1.9)*localidad);
		return (int) b;
	}

}
