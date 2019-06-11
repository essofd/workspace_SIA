package ftor_junit;

/******************************************************************
 * Main -> Classe utilizada apenas no processo de exportação do JAR. 
 ******************************************************************/
public class Main {

	public static String cTeste = ""; 

	public static void main(String[] args) {

		if (args.length > 0 ) {
			
			cTeste = args [0];
		}
	}
}