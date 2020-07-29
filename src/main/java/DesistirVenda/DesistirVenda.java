package DesistirVenda;

import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;

public class DesistirVenda implements Interface {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaDesistirVenda () {
		
		step.url(urlHome);
		step.carinho();
		step.excluir();
		
	}
		

}
