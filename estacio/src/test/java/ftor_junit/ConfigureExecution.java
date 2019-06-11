package ftor_junit;



/***************************************************************************************
 * ConfigureExecution: Classe responsável por possuir os objetos, atributos e
 * métodos de configuração da execução dos casos de teste
 ***************************************************************************************/
public class ConfigureExecution { //login:1042505   senha:1234as

	// Atributos
	public static String cCaso = "";
	public static int nLin = 0;
	public static int nLin2 = 0;

	// Objetos das classes de teste
	static ReportLog reportlog = new ReportLog();
	
	public static String url =null;
	
	public static void menuAcesso() throws Exception {
		
	       
        url="http://dsiame.estacio.rj.br/";
       // url="http://dsiame.estacio.rj.br:17371/";
		
//		   // Scanner entrada = new Scanner(System.in);
//	        int opcaoteste = 2;
//
//
//	    do{
//
//	        System.out.println("*******************************************************************************************");
//	        System.out.println("********************     SEJA BEM VINDO AO PAINEL DO SISTEMA SIA    ***********************");
//	        System.out.println("********************     ***************************************    ***********************");
//	        System.out.println("********************     ESCOLHA A OPÇÃO PARA O SEU TESTE           ***********************");
//	        System.out.println("*******************************************************************************************");
//	        System.out.println("********************     OPÇÕES DE URL PARA O TESTE                 ***********************");
//	        System.out.println("********************     1 - DESENVOLVIMENTO (dsiame)               ***********************");
//	        System.out.println("********************     2 - SUSTENTACAO (dsiame2)                  ***********************");
//	        System.out.println("********************     3 - HOMOLOGACAO (hsia2008)                 ***********************");
//	        System.out.println("*******************************************************************************************");
//	       
//
//	        
//	        Scanner entradateste = new Scanner(System.in);
//
//	        System.out.println("\n\n Digite a opção de URL´s:");
//	        opcaoteste = entradateste.nextInt();
//
//	        
//	       if(opcaoteste == 1){
//	            System.out.printf("Você escolheu a opcao de URL: " + "\n" + "\n" + opcaoteste + " - " + "DESENVOLVIMENTO" + "\n");
//	        }else if(opcaoteste == 2){
//	            System.out.printf("Você escolheu a opcao de URL: " + "\n" + "\n" + opcaoteste + " - " + "SUSTENTACAO" + "\n");
//	        }else if(opcaoteste == 3){  
//	            System.out.printf("Você escolheu a opcao de URL: " + "\n" + "\n" + opcaoteste + " - " + "HOMOLOGACAO" + "\n");
//	        }
//	        
//	        
//	        switch(opcaoteste){
//	        case 1: 
//	        	//Desenvolvimento
//	            url="http://dsiame.estacio.rj.br/";
//	            break;
//
//	        case 2: 
//	        	//Sustentação
//	            url="http://dsiame2.estacio.rj.br/";
//	            break;
//
//	        case 3: 
//	        	//Homologação
//	            url="http://hsia2008.estacio.rj.br/"; //Nao fazer testes
//	            break;
//
//	            default:    
//	                System.out.printf("Opção Inválida digite uma outra opção: \n\n");
//	          }
//	       }while( (opcaoteste !=1) && (opcaoteste !=2) && (opcaoteste !=3) );
	    }
	

	
	/*********************************************************
	 * ->Seta o ID do Caso de Teste; 
	 * ->Ler o CSV; 
	 * ->Chama o método processarCasosTeste,referente ao Caso de Teste;
	 *********************************************************/
	public static void configurarExecucaoCasosTeste(String idCaso) throws Exception {
		
		    cCaso = idCaso;
		
		   //lê o csv
			DataDriven.lerCSV();
			

			try {
				processarCasosTeste(idCaso);
				reportlog.apontarRelatorioHtml(DataDriven.nomeCasoTeste);
				
			} catch (final Exception e) {

				throw new Exception();
			}

	
	}

	/****************************************************************************************
	 * ->Verifica a linha que será lida do .csv pelo Id do caso; 
	 * ->Executa método 'lerRegistro' (GET do Array) com os campos do .csv; 
	 * ->Inicia a gravação do relatório em vídeo;
	 * ->Realiza a chamada ao método de teste.
	 ****************************************************************************************/
	public static void processarCasosTeste(String idCaso) throws Exception {
		
			// Verificação do id do caso
			nLin2 = DataDriven.aLinha.size() - 1;

			for (nLin = 1; nLin <= nLin2; nLin++)

			{
				if (cCaso.equalsIgnoreCase(DataDriven.aidCaso.get(nLin))) {
					DataDriven.nLin = nLin;
					DataDriven.nLin2 = nLin2;

					DataDriven.lerRegistro();

					// CHAMA MÉTODO DE TESTE
					ReportLog.iniciarGravacaoVideoExecucaoCasoTeste(); //TEMOS Q ALTERAR!!!

					break;
				}
			}

	}
	
}
