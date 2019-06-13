package ftor_junit;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;

/*********************************************************************************
 * Superclasse -> Classe responsável pela implementação dos métodos referentes à
 * tela de resultado da consulta por preço e prazo de entrega que posteriormente
 * serão chamados dentro dos casos de teste.
 *********************************************************************************/
public class EncaminhamentoUtils extends Utils {

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
		clicarElemento(By.linkText("Encaminhamento"), "Sub Menu Encaminhamento Requerimento");

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

	public void preencherDataRequerimento() throws Exception {

		pausar(2000);

		Date dataAtual = new Date();
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dataFormatada = dateFormat.format(dataAtual);

		// System.out.println("Date em String formatada: " + dataFormatada);

		escreverTexto(By.name("dt_requerimento"), dataFormatada, "Data de hoje " + dataFormatada);
	}

	// Requerimento
	public void SelecionarCategoria() throws Exception {

		clicarElemento(By.name("num_seq_categoria"), "Seleciona na Categoria");

		pausar(2000);

		selecionarElementoPorTexto(By.name("num_seq_categoria"), "MATRÍCULA/TRANSFERÊNCIA", "Categoria Requerimento");
	}

	public void SelecionarCodGrupoRequerimento() throws Exception {

		clicarElemento(By.name("cod_grupo_requerimento"), "Seleciona Grupo Requerimento");

		pausar(2000);

		selecionarElementoPorValue(By.name("cod_grupo_requerimento"), "554",
				"SOLICITAR TRANSFERÊNCIA INTERNA DE TURNO");
	}

	// cadastro
	public void preencherMatriculaAluno() throws Exception {

		escreverTexto(By.name("cod_matricula"), "201702077071", "Preenche a matricula 201702077071");

	}

	public void clicarNomeAluno() throws Exception {

		clicarElemento(By.name("nom_aluno"), "Nome Aluno");

		pausar(2000);
	}

	public void selecionarRequerimento() throws Exception {
		clicarElemento(By.xpath("(//input[@name='selecao'])[1]"), "Seleciona Requerimento");
		pausar(2000);
	}
	
	// Requerimento
	public void clicarSelecionar() throws Exception {

		clicarElemento(By.xpath("*//table[6]/tbody/tr/td/input"), "Botão Selecionar");

		pausar(4000);
	}
	
	
	public void verificarMatriculaAluno() throws Exception {
		contemTextoPresentePorElemento2(By.name("cod_matricula"), "201702077071", "Verifica se apresenta matricula do Aluno");

		pausar(2000);
	}
	
	
	
	public void preencheObservacao() throws Exception {

		escreverTexto(By.name("wrk_ult_obs"), "Alteração de Requerimento - Etapa Unica", "Observação Etapa");

		pausar(2000);
	}
	
	// Requerimento
		public void clicarProsseguir() throws Exception {

			clicarElemento(By.xpath("*//font/table/tbody/tr/td/input"), "Botão Prosseguir");

			pausar(4000);
		}
		
		public void verificarMensagemSucesso() throws Exception {
		
	     textoPresentePorElemento(By.xpath("//p"), "Operação realizada com sucesso.");
		// assertEquals("Operação realizada com sucesso.", driver.findElement(By.xpath("//p")).getText());
		
		}
		
		public void clicarOK() throws Exception {
			
			clicarElemento(By.xpath("*//input"), "Botão OK");

			pausar(2000);
			

		}
}
