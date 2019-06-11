package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe respons�vel pela implementa��o dos m�todos referentes �
 * tela de resultado da consulta por pre�o e prazo de entrega que posteriormente
 * ser�o chamados dentro dos casos de teste.
 *********************************************************************************/
public class ConsultaReqProtocoloUtils extends Utils {

	public String urlAlterada = null;

	//Protocolo
	public void alterarJanelaSIATopo() throws Exception {
		// pausa der 3s
		pausar(3000);

		//se for dsiame2:
		alterarJanelaPorTituloPagina("SIA - Sistema de Informa��es Acad�micas");                             	
	}
	
	//Protocolo
	public void alterarFrameTopo() throws Exception {
		//se for dsiame2:
		alterarFocoFrame("begin");
	}

	//Protocolo
	public void alterarFrameMenuLateral() throws Exception {
		alterarFocoFrame("conteudo");
	}

	//Protocolo
	public void clicarMenuRequerimento() throws Exception {
		// Clica no Menu Requerimento
		// driver.findElement(By.linkText("+Requerimentos")).click();
		 
		 clicarElemento(By.linkText("+Requerimentos"), "Menu Requerimento");
		
		//clicarElemento(By.id("Nivel113"), "Menu Requerimento");
	}
	
   //Protocolo
	public void clicarSubMenuConsultaRequerimento() throws Exception {
		// Clica em Novo Requerimento
		clicarElemento(By.linkText("Consulta"), "Sub Menu Consulta Requerimento");
	}

    //Protocolo
	public void alterarJanelaPrincipal() throws Exception {
		alterarFocoFrame("principal");
	}

	//Protocolo
	public void preencherProtocolo() throws Exception {
		escreverTexto(By.name("num_seq_requerimento"), "20350484", "Preenche o Protocolo 20350484");
	}

	//Protocolo
	public void clicarPesquisar() throws Exception {
		clicarElemento(By.name("acao"), "Bot�o Pesquisar");
		pausar(2000);
	}

	//Protocolo
	public void clicarCancelar() throws Exception {
		clicarElemento(By.xpath("*//table[6]/tbody/tr/td[2]/input"), "Bot�o Cancelar");
		pausar(2000);
	}

	//Protocolo
	public void verificarNomeAluno() throws Exception {
		contemTextoPresentePorElemento2(By.name("cod_matricula_aluno"), "201703061373", "Verifica se apresenta nome de Aluno");
		//String codigoMatricula = driver.findElement(By.name("cod_matricula_aluno")).getAttribute("value");

		pausar(2000);
	}
	
    //Protocolo
	public void clicarRetornar() throws Exception {
		clicarElemento(By.name("acao"), "Bot�o Retornar");
	}

}
