package ftor_junit;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class CadastroUtils extends Utils {

	public String urlAlterada = null;

//	//cadastro
//	public void acessarURLEstacio() throws Exception {
//
//		acessarURL(ConfigureExecution.url);
//	}
//	
//	//cadastro
//	public void logarNoSIA() throws Exception {
//
//		// Preenche o login
//		// escreverTexto(By.name("txtLogin"), DataDriven.login, "Login");
//		escreverTexto(By.name("txtLogin"), "1042505", "Login");
//
//		// Clica em Enviar
//		clicarElemento(By.xpath("(//input[@name='image'])[1]"), "Botao Enviar");
//
//	}

	//cadastro xxx
	public void alterarJanelaSIATopo() throws Exception {

		// pausa der 3s
		pausar(3000);

		//se for dsiame2:
		alterarJanelaPorTituloPagina("SIA - Sistema de Informações Acadêmicas");                             

		
	}
	
//	//cadastro
//	public void alterarFrameTopo() throws Exception {
//		
//		//se for dsiame2:
//		alterarFocoFrame("begin");
//
//	}
//
//	//cadastro
//	public void preencherSenhaSIA() throws Exception {
//
//		// escreverTexto(By.xpath("//*[@id='txtPassWord']"), DataDriven.senha, "Senha");
//		escreverTexto(By.xpath("//*[@id='txtPassWord']"), "1234as", "Senha");
//	}
//
//	//cadastro
//	public void clicarEntrarSIA() throws Exception {
//
//		clicarElemento(By.xpath("//*[@id='bg-senha']/div/form/input[2]"), "Botao Entrar");
//		
//		// pausa der 3s
//		pausar(3000);
//
//		contemTextoPresentePorElemento(By.xpath("*//tr[2]/td[4]/a"), "help", "Texto help");
//
//	}
	
//	//cadastro
//	public void clicarCatalogo() throws Exception {
//
//		clicarElemento(By.xpath("//img[@alt='Formação Acadêmica']"), "Link Formação Academica");
//
//	}

	//cadastro xxx
	public void alterarFrameMenuLateral() throws Exception {

		alterarFocoFrame("conteudo");

	}

	
//	public void alterarFocoJanelaMenu() throws Exception {
//
//		alterarFocoFrame("faixa");
//
//	}
	
	//cadastro xxx
	public void clicarNovoRequerimento() throws Exception {

		// Clica no Menu Requerimento
		 clicarElemento(By.linkText("+Requerimentos"), "Menu Requerimento");
		

		// Clica em Novo Requerimento
		clicarElemento(By.linkText("Novo"), "Sub Menu Novo Requerimento");

	}
	
//	//Requerimento //Protocolo
//	public void clicarMenuRequerimento() throws Exception {
//
//		// Clica no Menu Requerimento
//		clicarElemento(By.id("Nivel113"), "Menu Requerimento");
//
//	}
//	
//	//Requerimento //Protocolo
//	public void clicarSubMenuConsultaRequerimento() throws Exception {
//
//		// Clica em Novo Requerimento
//		clicarElemento(By.linkText("Consulta"), "Sub Menu Consulta Requerimento");
//
//	}

	//cadastro xxx
	public void alterarJanelaPrincipal() throws Exception {

		alterarFocoFrame("principal");
	}
	
	//cadastro xxx
	public void clicarLupa() throws Exception {

		clicarElemento(By.xpath("//img[@alt='Pesquisa Aluno']"), "Sub Menu Novo Requerimento");

	}
	//cadastro xxx
	public void AlterarJanelaPesquisaAluno() throws Exception {

		alterarJanelaPorTituloPagina("Pesquisa de Aluno");

	}

	//cadastro xxx
	public void SelecionaAlunoRegular() throws Exception {

		clicarElemento(By.name("tipo_aluno"), "Tipo aluno regular");

	}
//
//	//PROTOCOLO
//	public void preencherProtocolo() throws Exception {
//
//		escreverTexto(By.name("num_seq_requerimento"), "20350484", "Preenche o Protocolo 20350484");
//
//	}
//	
//	//Requerimento
//	public void preencherMatriculaAluno() throws Exception {
//
//		escreverTexto(By.name("cod_matricula"), "201703061373", "Preenche a matricula 201703061373");
//
//	}
//	
//	public void limparNomeAluno() throws Exception {
//
//		limpaTexto(By.name("cod_matricula"));
//
//	}
//	
//	public void clicarNomeRequerente() throws Exception {
//
//		clicarElemento(By.name("nom_requerente"), "Nome Requerente");
//
//	}
//
//	//Requerimento //Protocolo
//	public void clicarPesquisar() throws Exception {
//
//		clicarElemento(By.name("acao"), "Botão Pesquisar");
//		
//		pausar(2000);
//	}
//	
//	//Requerimento
//	public void clicarDeclaracaoMatricula() throws Exception {
//
//		clicarElemento(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='DECLARAÇÃO DE ESTÁGIO'])[1]/preceding::input[1]"), "Radiobutton Declaracao de Matricula");
//		
//		pausar(2000);
//	}
//
//	
//	//Requerimento
//	public void clicarContinuar() throws Exception {
//
//		clicarElemento(By.xpath("*//table[3]/tbody/tr/td[1]/input"), "Botão Continuar");
//		
//		pausar(2000);
//	}
//	
//	//Requerimento
//	public void clicarFechar() throws Exception {
//
//		clicarElemento(By.xpath("*//table[3]/tbody/tr/td[2]/input"), "Botão fechar");
//		
//		pausar(2000);
//	}
//	
//	//Requerimento //Protocolo
//	public void clicarCancelar() throws Exception {
//
//		clicarElemento(By.xpath("*//table[6]/tbody/tr/td[2]/input"), "Botão Cancelar");
//		
//		pausar(2000);
//	}
//
//	//Requerimento //Protocolo
//	public void verificarNomeAluno() throws Exception {
//
//		contemTextoPresentePorElemento2(By.name("cod_matricula_aluno"), "201703061373", "Verifica se apresenta nome de Aluno");
//		//String codigoMatricula = driver.findElement(By.name("cod_matricula_aluno")).getAttribute("value");
//
//		pausar(2000);
//		
//	}
//	
//	//Requerimento //Protocolo
//	public void clicarRetornar() throws Exception {
//
//		clicarElemento(By.name("acao"), "Botão Retornar");
//	}
//	

}
