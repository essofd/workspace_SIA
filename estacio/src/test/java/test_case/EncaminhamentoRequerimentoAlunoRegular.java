package test_case;

import org.junit.Before;
import org.junit.Test;

import ftor_junit.EncaminhamentoUtils;
import ftor_junit.ConfigureExecution;
//import ftor_junit.DSL;

public class EncaminhamentoRequerimentoAlunoRegular extends  EncaminhamentoUtils {
	//private DSL dsl;

	
	@Before
	public void AcessarCatalogoSIA() throws Exception {
		
		/*************************************
		 * Configura a execução dos testes
		 *************************************/
		ConfigureExecution.configurarExecucaoCasosTeste("001");
		// dsl=new DSL(driver);

	}

	// Caso de Teste
	@Test
	public void testar001() throws Exception {

		/**********************
		 * 
		 * Teste
		 ********************/

		  clicarCatalogo();
		  clicarMenuRequerimento();
          clicarSubMenuNovoRequerimento();
          alterarJanelaSIATopo();
          alterarFrameTopo();
          alterarJanelaPrincipal();
          
          preencherDataRequerimento();
          
          SelecionarCategoria();
          SelecionarCodGrupoRequerimento();
          preencherMatriculaAluno();
          clicarNomeAluno();
          
          selecionarRequerimento();
          clicarSelecionar();
          
          verificarMatriculaAluno();
          mouseScrollCimaParaBaixo();
          preencheObservacao();
          mouseScrollCimaParaBaixo();
          mouseScrollCimaParaBaixo();
          
          clicarProsseguir();
          verificarMensagemSucesso();
          
          clicarOK();

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}
}
