package ftor_junit;

import org.openqa.selenium.By;
import org.junit.Assert;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class CadastroUtils extends Utils {

	public String urlAlterada = null;

	// cadastro
	public void clicarCatalogo() throws Exception {
		alterarJanelaPorTituloPagina("SIA - Sistema de Informações Acadêmicas");
		alterarFocoFrame("begin");
		alterarFocoFrame("faixa");
		// elementoEstaPresente(By.linkText("help"));
		clicarElemento(By.xpath("//img[@alt='Formação Acadêmica']"), "Link Formação Academica");
		// pausa der 2s
		pausar(2000);
		alterarFocoFrame("begin");
		alterarFocoFrame("conteudo");
	}

	// cadastro
	public void clicarMenuRequerimento() throws Exception {

		// Clica no Menu Requerimento
		clicarElemento(By.linkText("+Requerimentos"), "Menu Requerimento");

	}

	public void clicarSubMenuNovoRequerimento() throws Exception {

		// Clica em Novo Requerimento
		clicarElemento(By.linkText("Novo"), "Sub Menu Novo Requerimento");

	}

	// cadastro
	public void alterarJanelaSIATopo() throws Exception {

		// se for dsiame2:
		alterarJanelaPorTituloPagina("SIA - Sistema de Informações Acadêmicas");

	}

	// cadastro
	public void alterarFrameTopo() throws Exception {

		// se for dsiame2:
		alterarFocoFrame("begin");

	}

	// cadastro
	public void alterarJanelaPrincipal() throws Exception {
		alterarFocoFrame("principal");
	}

	// cadastro
	public void clicarLupa() throws Exception {

		clicarElemento(By.xpath("//img[@alt='Pesquisa Aluno']"), "Sub Menu Novo Requerimento");

	}

	// cadastro
	public void AlterarJanelaPesquisaAluno() throws Exception {

		alterarJanelaPorTituloPagina("Pesquisa de Aluno");

	}

	// cadastro
	public void SelecionaAlunoRegular() throws Exception {

		clicarElemento(By.name("tipo_aluno"), "Tipo aluno regular");

	}

	// cadastro
	public void preencherMatriculaAluno() throws Exception {

		escreverTexto(By.name("cod_matricula"), "201702077071", "Preenche a matricula 201702077071");

	}

	public void clicarNomeRequerente() throws Exception {

		clicarElemento(By.name("nom_requerente"), "Nome Requerente");

		pausar(2000);
	}



	// cadastro
	public void clicarPesquisar() throws Exception {

		clicarElemento(By.name("acao"), "Botão Pesquisar");

		pausar(2000);
	}

	//

	public void clicarElementoEncontrado() throws Exception {

		clicarElemento(By.name("campo01"), "Radiobutton Campo01 Matr 2017.03.06137-3");

		pausar(2000);
	}

	// Requerimento
	public void clicarContinuar() throws Exception {

		clicarElemento(By.xpath("*//table[5]/tbody/tr/td[1]/input"), "Botão Continuar");

		pausar(2000);
	}

	// Requerimento
	public void SelecionarCategoria() throws Exception {

		clicarElemento(By.name("num_seq_categoria"), "Seleciona na Categoria");

		pausar(2000);

		selecionarElementoPorTexto(By.name("num_seq_categoria"), "MATRÍCULA/TRANSFERÊNCIA", "Categoria Requerimento");
	}


	public void SelecionarTransferenciaInterna() throws Exception {

		clicarElemento(By.xpath("(//input[@name='selecao'])[41]"), "Transferencia Interna de Turno");
		pausar(2000);

	}

	// Requerimento
	public void clicarContinuar2() throws Exception {

		clicarElemento(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='MATRÍCULA/TRANSFERÊNCIA'])[43]/following::input[14]"), "Botão Continuar2");

		pausar(2000);
	}

	public void preencheObservacao() throws Exception {

		escreverTexto(By.name("text_filtro_1"), "Solicito transferencia interna de curso XXX", "Preenche Observação");

		pausar(2000);
	}
	
	public void SelecionarTurno() throws Exception {
		
		clicarElemento(By.id("slc_combo_1"), "Turno");

		pausar(2000);
		
		selecionarElementoPorTexto(By.id("slc_combo_1"), "TARDE", "Turno");
	}
	

	// Requerimento
	public void clicarContinuar3() throws Exception {

		clicarElemento(By.xpath("*//table[3]/tbody/tr/td/input"), "Botão Continuar3");

		pausar(2000);
	}

	
	public void clicarConfirmar() throws Exception {

		clicarElemento(By.xpath("*//table[3]/tbody/tr/td/input"), "Botão Confirmar");

		pausar(2000);
	}

	// Requerimento
		public void clicarOK() throws Exception {

			clicarElemento(By.xpath("*//table[2]/tbody/tr/td/input"), "Botão OK");

			pausar(2000);
		}
	

}
