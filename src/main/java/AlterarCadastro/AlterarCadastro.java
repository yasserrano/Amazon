package AlterarCadastro;

import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;
import org.junit.Assert;

public class AlterarCadastro implements Interface{
	
	_Framework step = new _Framework();
	
	@Test
	public void executaAlterarCadastro() {
		
		step.url(urlHome);
		step.menu();
		step.conta();
		step.acesso();
		step.editar();
		step.alterarCampo("Mari Silva");
		step.salvar();
		
		Assert.assertEquals("Mari Silva", step.validaAlteracao());
		Assert.assertEquals("Sucesso" + "\n" + "Você modificou com sucesso a sua conta!", step.validarConfirmacaoAlteracao());
		
		step.concluido();

		step.url(urlHome);
		step.menu();
		step.conta();
		step.acesso();
		step.editar();
		step.alterarCampo("Maria Silva");
		step.salvar();
		
		Assert.assertEquals("Maria Silva", step.validaAlteracao());
		Assert.assertEquals("Sucesso" + "\n" + "Você modificou com sucesso a sua conta!", step.validarConfirmacaoAlteracao());
		
		step.concluido();

		
	}

}
