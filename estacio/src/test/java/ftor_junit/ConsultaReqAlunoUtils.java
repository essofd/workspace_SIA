package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe respons�vel pela implementa��o dos m�todos referentes �
 * tela de resultado da consulta por pre�o e prazo de entrega que posteriormente
 * ser�o chamados dentro dos casos de teste.
 *********************************************************************************/
public class ConsultaReqAlunoUtils extends Utils {

	public String urlAlterada = null;

	public void acessarURLEstacio() throws Exception {

		acessarURL(ConfigureExecution.url);
	}


	//Requerimento
	public void alterarJanelaSIATopo() throws Exception {

		// pausa der 3s
		pausar(3000);

		//se for dsiame2:
		alterarJanelaPorTituloPagina("SIA - Sistema de Informa��es Acad�micas");                             

		
	}
	
	//Requerimento
	public void alterarFrameTopo() throws Exception {
		
		//se for dsiame2:
		alterarFocoFrame("begin");

	}

	//Requerimento
	public void alterarFrameMenuLateral() throws Exception {

		alterarFocoFrame("conteudo");

	}
	
	//cadastro
		public void clicarCatalogo() throws Exception {
			alterarJanelaPorTituloPagina("SIA - Sistema de Informa��es Acad�micas");                             	
			alterarFocoFrame("begin");
			alterarFocoFrame("faixa");
			//elementoEstaPresente(By.linkText("help"));
			clicarElemento(By.xpath("//img[@alt='Forma��o Acad�mica']"), "Link Forma��o Academica");
			// pausa der 2s
			pausar(2000);
			alterarFocoFrame("begin");
			alterarFocoFrame("conteudo");
		}

	
	//Requerimento
	public void clicarMenuRequerimento() throws Exception {

		
			// Clica no Menu Requerimento
			 clicarElemento(By.linkText("+Requerimentos"), "Menu Requerimento");
			 
	
		

	}
	
	//Requerimento  
	public void clicarSubMenuConsultaRequerimento() throws Exception {

		// Clica em Novo Requerimento
		clicarElemento(By.linkText("Consulta"), "Sub Menu Consulta Requerimento");

	}

	//Requerimento
	public void alterarJanelaPrincipal() throws Exception {

		alterarFocoFrame("principal");
	}

	//Requerimento
	public void preencherMatriculaAluno() throws Exception {

		escreverTexto(By.name("cod_matricula"), "201703061373", "Preenche a matricula 201703061373");

	}

	//Requerimento
	public void clicarPesquisar() throws Exception {

		clicarElemento(By.name("acao"), "Bot�o Pesquisar");
		
		pausar(2000);
	}
	
	//Requerimento
	public void clicarDeclaracaoMatricula() throws Exception {

		clicarElemento(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DECLARA��O DE EST�GIO'])[1]/preceding::input[1]"), "Radiobutton Declaracao de Matricula");
		
		pausar(2000);
	}

	
	//Requerimento
	public void clicarContinuar() throws Exception {

		clicarElemento(By.xpath("*//table[3]/tbody/tr/td[1]/input"), "Bot�o Continuar");
		
		pausar(2000);
	}
	
	//Requerimento
	public void clicarFechar() throws Exception {

		clicarElemento(By.xpath("*//table[3]/tbody/tr/td[2]/input"), "Bot�o fechar");
		
		pausar(2000);
	}
	
	//Requerimento
	public void clicarCancelar() throws Exception {

		clicarElemento(By.xpath("*//table[6]/tbody/tr/td[2]/input"), "Bot�o Cancelar");
		
		pausar(2000);
	}

	//Requerimento
	public void verificarNomeAluno() throws Exception {

		contemTextoPresentePorElemento2(By.name("cod_matricula_aluno"), "201703061373", "Verifica se apresenta nome de Aluno");
		//String codigoMatricula = driver.findElement(By.name("cod_matricula_aluno")).getAttribute("value");

		pausar(2000);
		
	}
	
	//Requerimento
	public void clicarRetornar() throws Exception {

		clicarElemento(By.name("acao"), "Bot�o Retornar");
	}
	

}
