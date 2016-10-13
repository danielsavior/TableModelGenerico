package br.com.tablemodelgenerico.beans;

import br.com.tablemodelgenerico.utils.Coluna;

public class Veiculo {
	public enum Tipo{
		CARRO,
		MOTO
	}
	private Tipo tipo;
	@Coluna(posicao =0,nomeColuna="Tipo",get=true,retorno = Tipo.class)
	public Tipo getTipo() {
		return tipo;
	}
	@Coluna(posicao =0,nomeColuna="Tipo",get=false,retorno = Tipo.class)
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Coluna(posicao =1,nomeColuna="Chassi",get=true,retorno = String.class)
	public String getChassi() {
		return chassi;
	}
	@Coluna(posicao =1,nomeColuna="Chassi",get=false,retorno = String.class)
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	@Coluna(posicao =2,nomeColuna="Modelo",get=true,retorno = String.class)
	public String getModelo() {
		return modelo;
	}
	@Coluna(posicao =2,nomeColuna="Modelo",get=false,retorno = String.class)
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Coluna(posicao =3,nomeColuna="Placa",get=true,retorno = String.class)
	public String getPlaca() {
		return placa;
	}
	@Coluna(posicao =3,nomeColuna="Placa",get=false,retorno = String.class)
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	private String chassi;
	private String modelo;
	private String placa;
	
	public Veiculo() {
		
	}
	
	public Veiculo(Tipo t,String chassi,String modelo,String placa) {
		this();
		this.tipo=t;
		this.chassi=chassi;
		this.modelo=modelo;
		this.placa=placa;
	}
}
