/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

public class DescontosVenda {

	Passagem passagem = new Passagem();
	Cliente cliente = new Cliente();
	Venda venda = new Venda();

	public double calculaDesconto(double valorPassagem, Venda venda, Passagem passagem, Cliente cliente) {
		this.venda = venda;
		this.passagem = passagem;
		this.cliente = cliente;
		
		if (venda.getPromocaoSelecionada().contains("ClienteAssiduo")) { //1
			if (cliente.getIdade() < 30) { //2
				valorPassagem = passagem.getValorPassagem()- (passagem.getValorPassagem() * 0.40);
				return valorPassagem; //3
			}
			else if (cliente.getIdade() < 50) { //4
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.50);
				return valorPassagem; //5 
			}
			else if (cliente.getIdade() < 70) { //6
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.60);
				return valorPassagem; //7
			}
			else if (cliente.getIdade() < 80) { //8
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.70);
				return valorPassagem; //9
			}
			else if (cliente.getIdade() < 90) { //10
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.80);
				return valorPassagem; //11
			}
			return valorPassagem; //12
		}
		else if (venda.getPromocaoSelecionada().contains("Gestante")) { //13
			if (cliente.getIdade() < 25) { //14
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.35);
				return valorPassagem; //15
			}
			else if (cliente.getIdade() < 30) { //16
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.40);
				return valorPassagem; //17
			}
			else if (cliente.getIdade() < 35) { //18
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.45);
				return valorPassagem; //19
			}
			else if (cliente.getIdade() < 40) { //20
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.50);
				return valorPassagem; //21
			}
			else if (cliente.getIdade() < 45) { //22
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.55);
				return valorPassagem; //23
			}
			return valorPassagem; //24

		}
		else if (venda.getPromocaoSelecionada().contains("Idoso")) { //25
			if (cliente.getIdade() < 60) { //26
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.20);
				return valorPassagem; //27
			}
			else if (cliente.getIdade() < 65) { //28
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.30);
				return valorPassagem; //29
			}
			else if (cliente.getIdade() < 70) { //30
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.40);
				return valorPassagem; //31
			}
			else if (cliente.getIdade() < 75) { //32
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.50);
				return valorPassagem; //33
			}
			else if (cliente.getIdade() < 80) { //34
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.60);
				return valorPassagem; //35
			}
			return valorPassagem; //36

		}
		else if (venda.getPromocaoSelecionada().contains("Milha")) { //37
			if (cliente.getIdade() < 60) { //38
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.10);
				return valorPassagem; //39
			}
			else if (cliente.getIdade() < 65) { //40
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.20);
				return valorPassagem; //41
			}
			else if (cliente.getIdade() < 70) { //42
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.30);
				return valorPassagem; //43
			}
			else if (cliente.getIdade() < 75) { //44
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.40);
				return valorPassagem; //45
			}
			else if (cliente.getIdade() < 80) { //46
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.50);
				return valorPassagem; //47
			}
			return valorPassagem; //48
		}
		if (venda.getPromocaoSelecionada().contains("Crianca")) { //49
			if (cliente.getIdade() < 5) { //50
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.05);
				return valorPassagem; //51
			}
			else if (cliente.getIdade() < 10) { //52
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.10);
				return valorPassagem; //53
			}
			else if (cliente.getIdade() < 15) { //54
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.15);
				return valorPassagem; //55
			}
			else if (cliente.getIdade() < 18) { //56
				valorPassagem = passagem.getValorPassagem() -  (passagem.getValorPassagem() * 0.20);
				return valorPassagem; //57
			}
			return valorPassagem; //58
		}
		return valorPassagem; //59

	} //60
}
