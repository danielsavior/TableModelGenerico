package br.com.tablemodelgenerico.beans;


import br.com.tablemodelgenerico.utils.Coluna;

public class Cliente {
	String nome;
	@Coluna(posicao =0,nomeColuna="Nome",get=true,retorno = String.class)
	public String getNome() {
		return nome;
	}
	@Coluna(posicao =0,nomeColuna="Nome",get=false,retorno = String.class)
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Coluna(posicao =1,nomeColuna="Endereco",get=true,retorno = String.class)
	public String getEndereco() {
		return endereco;
	}
	@Coluna(posicao =1,nomeColuna="Endereco",get=false,retorno = String.class)
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	@Coluna(posicao =2,nomeColuna="CPF",get=true,retorno = String.class)
	public String getCpf() {
		return cpf;
	}
	@Coluna(posicao =2,nomeColuna="CPF",get=false,retorno = String.class)	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Coluna(posicao =3,nomeColuna="Telefone",get=true,retorno = String.class)
	public String getTelefone() {
		return telefone;
	}
	@Coluna(posicao =3,nomeColuna="Telefone",get=false,retorno = String.class)
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	String endereco;
	String cpf;
	String telefone;
	
	public Cliente() {}
	public Cliente(String n, String e,String c,String t) {
		this();
		this.nome=n;
		this.endereco=e;
		this.cpf=c;
		this.telefone=t;
	}
}
