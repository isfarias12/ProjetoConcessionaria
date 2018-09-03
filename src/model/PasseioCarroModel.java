package model;

import java.awt.Component;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class PasseioCarroModel extends Carro {
	 
	private double litragemPortaMalas;
	private int numPassageiros;
	private ArrayList<PasseioCarroModel> listaCarroPasseio = new ArrayList<PasseioCarroModel>();
	 
	 public PasseioCarroModel(String marca, String modelo, double motorizacao, String anoModelo, double valorCompra,
				double valorVenda, String chassis,double litragemPortaMalas, int numPassageiros) {
		super(marca, modelo, motorizacao, anoModelo, valorCompra,
			 valorVenda, chassis);
		this.litragemPortaMalas = litragemPortaMalas;
		this.numPassageiros = numPassageiros;
	}
	 
	 
	 public void exibirAtributosPasseio(){
			//JOptionPane.showMessageDialog(null,this.getMarca()+ " " + this.getModelo() +" "+ this.getMotorizacao() +" "+ this.getAnoModelo() +" "+ this.getValorCompra() +" "+ this.getValorVenda()+" "+ this.getChassis() + " " + this.litragemPortaMalas + " " + this.numPassageiros );
			System.out.println(this.getMarca()+ " " + this.getModelo() +" "+ this.getMotorizacao() +" "+ this.getAnoModelo() +" "+ this.getValorCompra() +" "+ this.getValorVenda()+" "+ this.getChassis() + " " + this.litragemPortaMalas + " " + this.numPassageiros);
			
		}


	public double getLitragemPortaMalas() {
		return litragemPortaMalas;
	}


	public void setLitragemPortaMalas(double litragemPortaMalas) {
		this.litragemPortaMalas = litragemPortaMalas;
	}


	public int getNumPassageiros() {
		return numPassageiros;
	}


	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}


	public ArrayList<PasseioCarroModel> getListaCarroPasseio() {
		return listaCarroPasseio;
	}


	public void setListaCarroPasseio(ArrayList<PasseioCarroModel> listaCarroPasseio) {
		this.listaCarroPasseio = listaCarroPasseio;
	}
	 
	 
	 
	 
	 
	
	 
}
