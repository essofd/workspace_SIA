package test_case;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import ftor_junit.TestUtils;

/***********************************************************************************************
 * TestOrder -> Classe respons�vel pela ordena��o dos casos de teste. 
 * Por padr�o o JUnit n�o ordena corretamente os casos de teste, ent�o utilizamos esta classe
 * juntamente da anota��o @FixMethodOrder(MethodSorters.NAME_ASCENDING). 
 ***********************************************************************************************/
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestOrder extends TestUtils {

	@Test
	public void Base() throws Exception {
	//	_001CalcularPrecoPrazoEntregaCartaRegistrada Teste001 = new _001CalcularPrecoPrazoEntregaCartaRegistrada();
	//	Teste001.testar001();
	}
	
	
}
