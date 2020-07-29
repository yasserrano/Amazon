package ConsultarPedido;

import org.junit.Test;

import Framework._Framework;
import _CORE.Interface;
import org.junit.Assert;

public class Consulta implements Interface{
	
	public static String textoProduto1;
	public static String textoProduto2;
	public static String textoProduto3;
	
	_Framework step = new _Framework();
	
	@Test
	public void execultaConsulta() {
		
	step.url(urlHome);
	
//------------------------------------------------------------------------------------------------------------------------------//	
	
	step.produto1("fone de ouvido");
	
	if (textoProduto1.toString().contains("Fone de Ouvido")) {
		
		System.out.println("Caso de teste: (Consulta)" + "\n" + "produto1: Fone de ouvido identificado com Sucesso! ");
		
	} else {

		System.out.println("Caso de teste: (Consulta)" + "\n" +"Produto1 não identificado.");
		Assert.fail("Caso de teste: (Consulta)\" + \"\\n\" +\"Produto1 não identificado.");
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------//
	
		System.out.println(linha);
	
//------------------------------------------------------------------------------------------------------------------------------//
	
	step.produto2("Notebook");
	
	if (textoProduto2.toString().contains("Notebook")) {
		
		System.out.println("Caso de teste: (Consulta)" + "\n" + "produto2: Notebook identificado com Sucesso!!" );
		
	} else {

		System.out.println("Caso de teste: (Consulta)" + "\n" + "Produto2 não identificado.");
		Assert.fail("Caso de teste: (Consulta)" + "\n" + "Produto2 não identificado.");
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------//	
	
		System.out.println(linha);
		
//------------------------------------------------------------------------------------------------------------------------------//		
	
	step.produto3("Mouse");
	
	if (textoProduto3.toString().contains("Mouse") || textoProduto3.toString().contains("MOUSE")) {
		
		System.out.println("Caso de teste: (Consulta)" + "\n" + "produto3: Mouse identificado com Sucesso!!!");
				
	} else {
		
		System.out.println("Caso de teste: (Consulta)" + "\n" + "Produto3 não identificado.");
		Assert.fail("Caso de teste: (Consulta)" + "\n" + "Produto3 não identificado.");
		
	}	
	
//------------------------------------------------------------------------------------------------------------------------------//	
	
	step.url(urlHome);
	
	}
	
	
	
	
	
	
	
	
	
	

}
