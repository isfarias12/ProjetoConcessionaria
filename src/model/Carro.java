package model;

public abstract class Carro {
	
	
	private String marca;
	private String modelo;
	private double motorizacao;
	private String anoModelo;
	private double valorCompra;
	private double valorVenda;
	private String chassis;
	int [] acessorios = new int[5];
	
	public Carro(String marca, String modelo, double motorizacao, String anoModelo, double valorCompra,
			double valorVenda, String chassis) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.motorizacao = motorizacao;
		this.anoModelo = anoModelo;
		this.valorCompra = valorCompra;
		this.valorVenda = valorVenda;
		this.chassis = chassis;
		this.acessorios[0]=1500; //Ar-COndicionado
		this.acessorios[1]=435; //Vidro Eletrico
		this.acessorios[2]=292; //Trava Eletrica
		this.acessorios[3]=527; //Alarme
		this.acessorios[4]=1200; //Som
		
		
	}

	public Carro() {
		super();
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getMotorizacao() {
		return motorizacao;
	}

	public void setMotorizacao(double motorizacao) {
		this.motorizacao = motorizacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public String getChassis() {
		return chassis;
	}

	public void setChassis(String chassis) {
		this.chassis = chassis;
	}

	public int getAcessorios(int indice) {
		int valor = 0;
		if(indice == 1) {
			valor =  acessorios[1];
		}
		else if(indice == 2)
			valor = acessorios[2];
		else if(indice == 3)
			valor = acessorios[3];
		else if(indice == 4)
			valor = acessorios[4];
		else 
			valor = acessorios[0];
		return valor;
		
	}

	
	
	

}
