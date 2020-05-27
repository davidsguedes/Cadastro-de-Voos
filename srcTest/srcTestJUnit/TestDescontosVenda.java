package srcTestJUnit;

import junit.framework.TestCase;
import Model.Cliente;
import Model.DescontosVenda;
import Model.Passagem;
import Model.Venda;

public class TestDescontosVenda extends TestCase{

	DescontosVenda descontosVenda;
	Venda venda;
	Cliente cliente;
	Passagem passagem;


	protected void setUp() throws Exception {
		super.setUp();
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
	}


	//CLIENTE ASSÍDUO
	public void testCalculaDesconto_ClienteAssiduo_30(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("ClienteAssiduo");
		cliente.setIdade(29);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.6);
	}
	public void testCalculaDesconto_ClienteAssiduo_50(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("ClienteAssiduo");
		cliente.setIdade(49);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.5);
	}
	public void testCalculaDesconto_ClienteAssiduo_70(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("ClienteAssiduo");
		cliente.setIdade(69);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.4);
	}
	public void testCalculaDesconto_ClienteAssiduo_80(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("ClienteAssiduo");
		cliente.setIdade(79);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.30000000000000004);
	}
	public void testCalculaDesconto_ClienteAssiduo_90(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("ClienteAssiduo");
		cliente.setIdade(89);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.19999999999999996);
	}

	//GESTANTE
	public void testCalculaDesconto_Gestante_25(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Gestante");
		cliente.setIdade(24);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.65);
	}
	public void testCalculaDesconto_Gestante_30(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Gestante");
		cliente.setIdade(29);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.6);
	}
	public void testCalculaDesconto_Gestante_35(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Gestante");
		cliente.setIdade(34);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.55);
	}
	public void testCalculaDesconto_Gestante_40(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Gestante");
		cliente.setIdade(39);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.5);
	}
	public void testCalculaDesconto_Gestante_45(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Gestante");
		cliente.setIdade(44);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.44999999999999996);
	}


	//IDOSO
	public void testCalculaDesconto_Idoso_60(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Idoso");
		cliente.setIdade(59);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.8);
	}
	public void testCalculaDesconto_Idoso_65(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Idoso");
		cliente.setIdade(64);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.7);
	}
	public void testCalculaDesconto_Idoso_70(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Idoso");
		cliente.setIdade(69);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.6);
	}
	public void testCalculaDesconto_Idoso_75(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Idoso");
		cliente.setIdade(74);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.5);
	}

	public void testCalculaDesconto_Idoso_80(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Idoso");
		cliente.setIdade(79);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.4);
	}


	//MILHA
	public void testCalculaDesconto_Milha_60(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Milha");
		cliente.setIdade(59);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.9);
	}
	public void testCalculaDesconto_Milha_65(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Milha");
		cliente.setIdade(64);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.8);
	}
	public void testCalculaDesconto_Milha_70(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Milha");
		cliente.setIdade(69);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.7);
	}
	public void testCalculaDesconto_Milha_75(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Milha");
		cliente.setIdade(74);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.6);
	}
	public void testCalculaDesconto_Milha_80(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Milha");
		cliente.setIdade(79);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.5);
	}

	//CRIANÇA
	public void testCalculaDesconto_Crianca_05(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Crianca");
		cliente.setIdade(4);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.95);
	}
	public void testCalculaDesconto_Crianca_10(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Crianca");
		cliente.setIdade(9);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.9);
	}
	public void testCalculaDesconto_Crianca_15(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Crianca");
		cliente.setIdade(14);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.85);
	}
	public void testCalculaDesconto_Crianca_18(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("Crianca");
		cliente.setIdade(17);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente),0.8);
	}
	
	//SEM PROMOÇÃO SELECIONADA
	public void testCalculaDesconto_SemDescontoSelecionado(){
		DescontosVenda descontosVenda = new DescontosVenda();
		Venda venda = new Venda();
		Cliente cliente = new Cliente();
		Passagem passagem = new Passagem();
		venda.setPromocaoSelecionada("");
		cliente.setIdade(17);
		passagem.setValorPassagem(1);
		venda.setValorVenda(passagem.getValorPassagem());
		assertEquals(descontosVenda.calculaDesconto(passagem.getValorPassagem(), venda, passagem, cliente), 1.0);
	}

}
