package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class BaseSIAUtils extends Utils {

	public String urlAlterada = null;

	//cadastro
	public void acessarURLEstacio() throws Exception {

		acessarURL(ConfigureExecution.url);
	}
	
	//cadastro
	public void logarNoSIA() throws Exception {

		// Preenche o login
		// escreverTexto(By.name("txtLogin"), DataDriven.login, "Login");
		escreverTexto(By.name("txtLogin"), "1042505", "Login");

		// Clica em Enviar
		clicarElemento(By.xpath("(//input[@name='image'])[1]"), "Botao Enviar");
	}

	//cadastro
	public void alterarJanelaSIATopo() throws Exception {
		// pausa der 4s
		pausar(4000);

		//se for dsiame2:
		alterarJanelaPorTituloPagina("SIA - Sistema de Informações Acadêmicas");                             	
	}
	
	//cadastro
	public void alterarFrameTopo() throws Exception {	
		//se for dsiame2:
		alterarFocoFrame("begin");
	}

	//cadastro
	public void preencherSenhaSIA() throws Exception {

		// escreverTexto(By.xpath("//*[@id='txtPassWord']"), DataDriven.senha, "Senha");
		escreverTexto(By.xpath("//*[@id='txtPassWord']"), "1234as", "Senha");
	}

	//cadastro
	public void clicarEntrarSIA() throws Exception {
		clicarElemento(By.xpath("//*[@id='bg-senha']/div/form/input[2]"), "Botao Entrar");
		
		// pausa der 5s
		pausar(5000);
		
		elementoEstaPresente(By.linkText("Permissões"));

		//contemTextoPresentePorElemento(By.linkText("Permissões"), "Permissões", "Texto Permissões");
	}
	
	//cadastro
	public void clicarCatalogo() throws Exception {
		clicarElemento(By.xpath("//img[@alt='Formação Acadêmica']"), "Link Formação Academica");
	}

	//cadastro
	public void alterarFrameMenuLateral() throws Exception {
		alterarFocoFrame("conteudo");
	}

}
