package test_case;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import ftor_junit.TestUtils;

/***********************************************************************************************
 * TestOrder -> Classe responsável pela ordenação dos casos de teste. 
 * Por padrão o JUnit não ordena corretamente os casos de teste, então utilizamos esta classe
 * juntamente da anotação @FixMethodOrder(MethodSorters.NAME_ASCENDING). 
 ***********************************************************************************************/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder extends TestUtils {

	@Test
	public void Base() throws Exception {
	//	_001CalcularPrecoPrazoEntregaCartaRegistrada Teste001 = new _001CalcularPrecoPrazoEntregaCartaRegistrada();
	//	Teste001.testar001();
	}
	
	
}
