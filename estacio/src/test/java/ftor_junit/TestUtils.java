package ftor_junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import test_case.BaseSIA;

/**********************************************************************************************************************
 * TestUtils -> Classe responsável por conter o atributo driver, da interface
 * WebDriver (API do Selenium WebDriver) e objeto util (classe Utils.java);
 * 
 * -> Chamadas aos métodos de inicialização/término da instância do navegador,
 * finalização da gravação do relatório em vídeo e método gravarTelaRQM que tem
 * a função de adicionar imagem (evidência de teste) ao campo ‘Capturas de Tela’
 * do log do IBM RQM;
 * 
 * -> Contém as anotações @Before (o que será executado antes do Caso de Teste)
 * e @After (o que será executado após o Caso de Teste) do JUnit.
 **********************************************************************************************************************/
public class TestUtils {

	public static WebDriver driver;
	static BaseSIA baseSIA;
	static Utils util = new Utils();
	static final int N = 2;// numero de casos de testes

	@BeforeClass
	public static void setUp() throws Exception {

		/*************************************
		 * Configura a URL dos testes 1 - DESENVOLVIMENTO 2 - SUSTENTACAO 3 -
		 * HOMOLOGACAO
		 *************************************/

		// System.out.println("URL:"+ ConfigureExecution.url);

		// Se for nulo entao é a primeira vez que acesso
		if (ConfigureExecution.url == null) {

			ConfigureExecution.menuAcesso();

			/*************************************
			 * Configura o Browser
			 *************************************/

			// Browser.executarComChromePortable();// ok
			// Browser.executarComIE11(); // Consegui rodar alterando as configuracoes do IE
			// em
			// Ferramentas >> Opcoes da Internet >> Segurança colocando ativando o modo
			// protegido para todas as zonas.
			Browser.executarComChrome69();
			
			//ReportLog.iniciarGravacaoVideoExecucaoCasoTeste();

			baseSIA = new BaseSIA(driver);

			baseSIA.LogarNaAplicacao();

		}

	}

	@AfterClass
	public static void tearDown() throws Exception {

		/*********************************************************
		 * -->Finaliza a gravação do relatório em vídeo; -->Adiciona imagem ao
		 * campo'Capturas de Tela' do log do RQM; -->Finaliza a instância do navegador
		 *********************************************************/

		//for (int i = 1; i <= N; i++) {
			ReportLog.finalizarGravacaoVideoExecucaoCasoTeste();
		//}
		// util.gravarTelaRQM();
		// Browser.fecharInstancia();
	}
}
