package _CORE;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ConsultarMenu.ConsultarMenu;
import Login.Login;
import Logout.Logout;

	@RunWith(Suite.class)
	@SuiteClasses({	
	 
		Login.class,
//		VendaCelular.class, 
//		DesistirVenda.class,
//		Consulta.class,
//		AlterarCadastro.class,
	    ConsultarMenu.class,
//		TrabalheConosco.class,
//		Logout.class,
	 
})

public class SuiteTestes  { 

	@AfterClass
	public static void Finalizar() throws InterruptedException {
		
//		DriverFactory.FinalizaDriverFactory();
			
	}

			
}
	