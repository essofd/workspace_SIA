package test_case;

import org.junit.Before;
import org.junit.Test;

import ftor_junit.CadastroUtils;
import ftor_junit.ConfigureExecution;
//import ftor_junit.DSL;

public class CadastroNovoRequerimentoAlunoRegular extends  CadastroUtils {
	//private DSL dsl;

	
	@Before
	public void AcessarCatalogoSIA() throws Exception {
		
		/*************************************
		 * Configura a execu��o dos testes
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
		
		//  dsl.clicarCatalogo();
		  clicarCatalogo();
		  clicarMenuRequerimento();
          clicarSubMenuNovoRequerimento();
          alterarJanelaSIATopo();
          alterarFrameTopo();
          alterarJanelaPrincipal();
//          clicarLupa();
//          AlterarJanelaPesquisaAluno() ; 
//          SelecionaAlunoRegular();
//          preencherMatriculaAluno();
//          clicarPesquisar();
//          clicarElementoEncontrado();
          preencherMatriculaAluno();
          clicarNomeRequerente();
          clicarContinuar();
          SelecionarCategoria();
          mouseScrollCimaParaBaixo();
          mouseScrollCimaParaBaixo();
          SelecionarTransferenciaInterna();
          clicarContinuar2();
          preencheObservacao();
          SelecionarTurno();
          
          clicarContinuar3();
          clicarConfirmar();
          
          clicarOK();

		/************************************************
		 * -->Adiciona imagem ao relat�rio ExtentReports; -->Finaliza o relat�rio.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evid�ncia de Teste:");
	}
}
