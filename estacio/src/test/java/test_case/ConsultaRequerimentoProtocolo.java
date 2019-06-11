package test_case;

import org.junit.Before;
import org.junit.Test;

import ftor_junit.ConsultaReqProtocoloUtils;
import ftor_junit.ConfigureExecution;

public class ConsultaRequerimentoProtocolo extends ConsultaReqProtocoloUtils {
	
	
	@Before
	public void AcessarCatalogoSIA() throws Exception {
		
		/*************************************
		 * Configura a execução dos testes
		 *************************************/
		ConfigureExecution.configurarExecucaoCasosTeste("002");

	}

	// Caso de Teste
	@Test
	public void testar002() throws Exception {

		/**********************
		 * 
		 * Teste
		 ********************/
		
		  clicarMenuRequerimento();
          clicarSubMenuConsultaRequerimento();
          alterarJanelaSIATopo();
          alterarFrameTopo();
          alterarJanelaPrincipal();
          preencherProtocolo();
          clicarPesquisar();
          verificarNomeAluno();
          mouseScrollCimaParaBaixo();
          clicarRetornar();
          clicarCancelar();
          sairFrame();
          alterarFrameTopo();
          alterarFrameMenuLateral();
          clicarMenuRequerimento();
     
		

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}
}
