package test_case;

import org.junit.Before;
import org.junit.Test;

import ftor_junit.ConsultaReqAlunoUtils;
import ftor_junit.ConfigureExecution;

public class ConsultaRequerimentoAlunoRegular extends ConsultaReqAlunoUtils {
	
	
	@Before
	public void AcessarCatalogoSIA() throws Exception {
		
		/*************************************
		 * Configura a execu��o dos testes
		 *************************************/
		ConfigureExecution.configurarExecucaoCasosTeste("003");

	}

	// Caso de Teste
	@Test
	public void testar003() throws Exception {

		/**********************
		 * 
		 * Teste
		 ********************/

		  clicarCatalogo();
		  clicarMenuRequerimento();
          clicarSubMenuConsultaRequerimento();
          alterarJanelaSIATopo();
          alterarFrameTopo();
          alterarJanelaPrincipal();
          preencherMatriculaAluno();
          clicarPesquisar();
          clicarPesquisar();
          clicarDeclaracaoMatricula();
          clicarContinuar();
          verificarNomeAluno();
          mouseScrollCimaParaBaixo();
          clicarRetornar();
          clicarFechar();
          clicarCancelar();
          sairFrame();
          alterarFrameTopo();
          alterarFrameMenuLateral();
          clicarMenuRequerimento();
          
          
         // limparNomeAluno();
         // clicarNomeRequerente();
         // alterarJanelaMenu();
         // clicarSubMenuConsultaRequerimento();

		/************************************************
		 * -->Adiciona imagem ao relat�rio ExtentReports; -->Finaliza o relat�rio.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evid�ncia de Teste:");
	}
}
