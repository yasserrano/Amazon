package _CORE;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import AlterarCadastro.AlterarCadastro;
import ConsultarPedido.Consulta;
import DesistirVenda.DesistirVenda;
import Login.Login;
import Logout.Logout;
import Vendas.VendaCelular;

	@RunWith(Suite.class)
	@SuiteClasses({	
	 
		Login.class,
		VendaCelular.class, 
		DesistirVenda.class,
		Consulta.class,
		AlterarCadastro.class,
		Logout.class,
	 
})

public class SuiteGeral  { 

	@AfterClass
	public static void Finalizar() throws InterruptedException {
		
		DriverFactory.FinalizaDriverFactory();
			
	}

			
}
	