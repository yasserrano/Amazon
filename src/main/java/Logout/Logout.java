package Logout;

import org.junit.Assert;
import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;

public class Logout implements Interface {
	
	
	_Framework step = new _Framework ();
	
	@Test
	public void executaLogout () {
		
		step.url(urlHome);
		step.listas();
		step.sair();
		
		Assert.assertEquals("Fazer login", step.validarLogout());
		
		
	}
	
	
	
	

}
