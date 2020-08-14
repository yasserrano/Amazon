package ConsultarMenu;

import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;

public class ConsultarMenu implements Interface {
	
	_Framework step = new _Framework ();
	
	@Test
	public void ExecutaConsultarMenu () {
		
		step.url(urlHome);
		step.menu();
		step.cozinha();
		step.panelas();
		step.prime();
		
		
		
		
	}
	
	
	
	
	

}
