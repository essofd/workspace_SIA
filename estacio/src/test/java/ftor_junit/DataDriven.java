package ftor_junit;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/***********************************************************************************************
 * DataDriven -> Classe responsável pela manipulação da massa de dados (CSV).
 ***********************************************************************************************/
public class DataDriven {

	public static String cCaso = null;
	public static String nomeCaso = null;
	public static String cLinha = null;
	public static int nLin = 0;
	public static int nLin2 = 0;

	//public static String url = "http://dsiame2.estacio.rj.br"; //login:1042505   senha:1234as
	public static String nomeSistema = "Portal SIA - Estacio"; 
	public static String nomeSuite = "Calculo de descontos";
	public static String massaDados = "Utilitarios/dados/MASSA_SIA.csv";
 
	public static String idCaso = null;
	public static String matricula= null;
	public static String requerimento= null;
	public static String nomeCasoTeste = null;

	public static ArrayList<String> aLinha = new ArrayList<String>();
	public static ArrayList<String> aidCaso = new ArrayList<String>();
	public static ArrayList<String> aUrl = new ArrayList<String>();
	public static ArrayList<String> amatricula = new ArrayList<String>();
	public static ArrayList<String> arequerimento = new ArrayList<String>();
	public static ArrayList<String> anomeCasoTeste = new ArrayList<String>();
	
	
	public static void lerCSV() throws Exception {
		

		// Leitura do CSV
		File arquivoCSV = new File(massaDados);
	
		FileInputStream arquivoStream = new FileInputStream(arquivoCSV);
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(arquivoStream, "ISO-8859-1"));
			while (in.ready()) {
				cLinha = in.readLine();

				if (cLinha != null) {
					String[] campos = cLinha.split(";");

					aLinha.add(cLinha);
					amatricula.add(campos[0]);
					arequerimento.add(campos[1]);
					anomeCasoTeste.add(campos[4]);
					aidCaso.add(campos[5]);
				}
			}

			in.close();
		}

		catch (final Exception e) {

			System.out.println("Não foi possível ler a planilha .csv");
			throw new Exception();
		}
	}
	
	public static void lerRegistro() {
		// LER REGISTRO (get do array)
		idCaso = aidCaso.get(nLin);
		matricula = amatricula.get(nLin);
		requerimento = arequerimento.get(nLin);
		nomeCasoTeste=anomeCasoTeste.get(nLin);
		
	}
}
