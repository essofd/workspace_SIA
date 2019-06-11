package ftor_junit;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import test_case.BaseSIA;

/**********************************************************************************************************************
 * TestUtils -> Classe respons�vel por conter o atributo driver, da interface
 * WebDriver (API do Selenium WebDriver) e objeto util (classe Utils.java);
 * 
 * -> Chamadas aos m�todos de inicializa��o/t�rmino da inst�ncia do navegador,
 * finaliza��o da grava��o do relat�rio em v�deo e m�todo gravarTelaRQM que tem
 * a fun��o de adicionar imagem (evid�ncia de teste) ao campo �Capturas de Tela�
 * do log do IBM RQM;
 * 
 * -> Cont�m as anota��es @Before (o que ser� executado antes do Caso de Teste)
 * e @After (o que ser� executado ap�s o Caso de Teste) do JUnit.
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

		// Se for nulo entao � a primeira vez que acesso
		if (ConfigureExecution.url == null) {

			ConfigureExecution.menuAcesso();

			/*************************************
			 * Configura o Browser
			 *************************************/

			// Browser.executarComChromePortable();// ok
			// Browser.executarComIE11(); // Consegui rodar alterando as configuracoes do IE
			// em
			// Ferramentas >> Opcoes da Internet >> Seguran�a colocando ativando o modo
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
		 * -->Finaliza a grava��o do relat�rio em v�deo; -->Adiciona imagem ao
		 * campo'Capturas de Tela' do log do RQM; -->Finaliza a inst�ncia do navegador
		 *********************************************************/

		//for (int i = 1; i <= N; i++) {
			ReportLog.finalizarGravacaoVideoExecucaoCasoTeste();
		//}
		// util.gravarTelaRQM();
		// Browser.fecharInstancia();
	}
}
