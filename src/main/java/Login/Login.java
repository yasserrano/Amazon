package Login;

import org.junit.Assert;
import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;

public class Login implements Interface {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaLogin () throws InterruptedException {
		
		step.url(urlAmazon);
		step.email(usuarioAmazon);
		step.btnContinue();
		step.senha(senhaAmazon);
		step.fazerlogin();
		
		Assert.assertEquals("Olá, Maria", step.validarLogin());
		
	}

}
