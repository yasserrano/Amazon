package Vendas;

import org.junit.Test;

import Framework._Framework;

public class VendaCelular {
	
	_Framework step = new _Framework();
	
	@Test
	public void executaVendaCelular () {
		
		step.campopesquisa("Celular Xiaomi");
		step.lupa();
		step.marca();
		step.celular();
		step.cor();
		step.comprarAgora();
//		step.nome("Maria da Silva");
//		step.telefone("(11) 98844-9955");
//		step.cep("41213-695");
//		step.validarCep();
//    	step.numeroCasa("125");
//    	step.continuar();
//    	step.cpf("423.632.986-75");
		
		
		
	}

}
