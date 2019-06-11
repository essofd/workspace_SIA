package test_case;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
		// CadastroNovoRequerimentoAlunoRegular.class
		ConsultaRequerimentoProtocolo.class, 
		ConsultaRequerimentoAlunoRegular.class })
public class SuiteTeste {

	public static String VIASUITE = "SIM";// Casos via suite
	public static int itestes=0;

}
