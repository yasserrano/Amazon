package TrabalheConosco;

import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;

public class TrabalheConosco implements Interface{
	
	_Framework step = new _Framework();
	
	@Test
	public void executatrabalheConosco() throws InterruptedException {
		
		step.url(urlHome);
		step.pageDonw();
		step.pageDonw();
		step.carreiras();
		step.X();
		step.local("São Paulo");
		step.procurar();
		step.desenvolvimentoSoftware();
		step.pageDonw();
		step.proximo();
		step.classificar();
		step.recente();
		step.url(urlHome);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
