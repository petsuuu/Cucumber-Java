import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AprenderCucumber {

	@Dado("^que criei o aquivo corretamente$")
	public void queCrieiOAquivoCorretamente() throws Throwable {
		System.out.println("qualquer coisa");
	}

	@Quando("^executá-lo$")
	public void executáLo() throws Throwable {

	}

	@Então("^a especificação deve finalizar com sucesso$")
	public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {

	}

	// skipped = nem tentou executar foi pulado
	// undefined = não encontrou
	// passed = passou
	// fail = falhou

}
