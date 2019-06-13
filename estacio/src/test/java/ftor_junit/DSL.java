package ftor_junit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSL extends Utils {
	
	private WebDriver driver;
	
	public DSL(WebDriver driver) {
		this.driver = driver;
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

}
