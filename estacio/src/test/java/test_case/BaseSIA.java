package test_case;

import org.openqa.selenium.WebDriver;

import ftor_junit.BaseSIAUtils;
import ftor_junit.ConfigureExecution;
import ftor_junit.ReportLog;

public class BaseSIA extends BaseSIAUtils {
	
	static WebDriver driver;
    static ReportLog reportlog = new ReportLog();

	public BaseSIA(WebDriver driver) {

      this.driver = driver;
	}

	// Caso de Teste
	public void LogarNaAplicacao() throws Exception {
		
//		/*************************************
//		 * Configura a execução dos testes
//		 *************************************/
		
//000 - Base do SIA
		
		ConfigureExecution.configurarExecucaoCasosTeste("000");

		acessarURLEstacio();
		logarNoSIA();
		alterarJanelaSIATopo();
		alterarFrameTopo();
		preencherSenhaSIA();
		clicarEntrarSIA();
		clicarCatalogo();
		alterarFrameMenuLateral();
		
		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");

	}
}
