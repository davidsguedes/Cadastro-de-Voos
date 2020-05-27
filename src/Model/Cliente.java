/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import State.PassagemSituacao;

/**
 *
 * @author Guedes
 */
public class Cliente{     


	private int idCliente;
	private String nome;
	private String cpf;
	private String email;
	private String telefone;
	private String cidade;
	private String estado;
	private String pais;
	private int idade;
	private PassagemSituacao situacao;
	private Passagem passagem;

	public Cliente() {

	}

	/**
	 * @return the idCliente
	 */
	 public int getIdCliente() {
		 return idCliente;
	 }

	 /**
	  * @param idCliente the idCliente to set
	  */
	 public void setIdCliente(int idCliente) {
		 this.idCliente = idCliente;
	 }

	 /**
	  * @return the nome
	  */
	 public String getNome() {
		 return nome;
	 }

	 /**
	  * @param nome the nome to set
	  */
	 public void setNome(String nome) {
		 this.nome = nome;
	 }

	 /**
	  * @return the cpf
	  */
	 public String getCpf() {
		 return cpf;
	 }

	 /**
	  * @param cpf the cpf to set
	  */
	 public void setCpf(String cpf) {
		 this.cpf = cpf;
	 }

	 /**
	  * @return the email
	  */
	 public String getEmail() {
		 return email;
	 }

	 /**
	  * @param email the email to set
	  */
	 public void setEmail(String email) {
		 this.email = email;
	 }

	 /**
	  * @return the telefone
	  */
	 public String getTelefone() {
		 return telefone;
	 }

	 /**
	  * @param telefone the telefone to set
	  */
	 public void setTelefone(String telefone) {
		 this.telefone = telefone;
	 }

	 /**
	  * @return the cidade
	  */
	 public String getCidade() {
		 return cidade;
	 }

	 /**
	  * @param cidade the cidade to set
	  */
	 public void setCidade(String cidade) {
		 this.cidade = cidade;
	 }

	 /**
	  * @return the estado
	  */
	 public String getEstado() {
		 return estado;
	 }

	 /**
	  * @param estado the estado to set
	  */
	 public void setEstado(String estado) {
		 this.estado = estado;
	 }

	 /**
	  * @return the pais
	  */
	 public String getPais() {
		 return pais;
	 }

	 /**
	  * @param pais the pais to set
	  */
	 public void setPais(String pais) {
		 this.pais = pais;
	 }

	 /**
	  * @return the situacao
	  */
	 public PassagemSituacao getSituacao() {
		 return situacao;
	 }

	 /**
	  * @param situacao the situacao to set
	  */
	 public void setSituacao(PassagemSituacao situacao) {
		 this.situacao = situacao;
	 }

	 /**
	  * @return the passagem
	  */
	 public Passagem getPassagem() {
		 return passagem;
	 }

	 /**
	  * @param passagem the passagem to set
	  */
	 public void setPassagem(Passagem passagem) {
		 this.passagem = passagem;
	 }

	 public int getIdade() {
		 return idade;
	 }

	 public void setIdade(int idade) {
		 this.idade = idade;
	 }






}
