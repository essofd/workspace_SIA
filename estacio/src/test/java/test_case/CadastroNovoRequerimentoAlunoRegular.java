package test_case;

import org.junit.Before;
import org.junit.Test;

import ftor_junit.CadastroUtils;
import ftor_junit.ConfigureExecution;

public class CadastroNovoRequerimentoAlunoRegular extends CadastroUtils {
	
	
	@Before
	public void AcessarCatalogoSIA() throws Exception {
		
		/*************************************
		 * Configura a execução dos testes
		 *************************************/
		ConfigureExecution.configurarExecucaoCasosTeste("001");
//		
//		acessarURLEstacio();
//		logarNoSIA();
//		alterarJanelaSIATopo();
//		preencherSenhaSIA();
//		clicarEntrarSIA();
//		clicarCatalogo();
	}

	// Caso de Teste
	@Test
	public void testar001() throws Exception {

		/**********************
		 * 
		 * Teste
		 ********************/
		
		  alterarFrameMenuLateral();
          clicarNovoRequerimento();
          alterarJanelaSIATopo();
          alterarJanelaPrincipal();
          clicarLupa();
          AlterarJanelaPesquisaAluno() ;
          SelecionaAlunoRegular();
		

		/************************************************
		 * -->Adiciona imagem ao relatório ExtentReports; -->Finaliza o relatório.
		 ************************************************/
		adicionaImagemLogSucessoRelatorio("Evidência de Teste:");
	}
}
