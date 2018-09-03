package model;

import java.util.ArrayList;

public class CargaCarroModel extends Carro{
	
		private double tamanhoCarroceria;
		private double cargaMaxima;
		private double pesoTotal;
		private double alturaCargaMaxima;
		private static ArrayList<CargaCarroModel> cargaCarro = new ArrayList<CargaCarroModel>();
		
		public CargaCarroModel(String marca, String modelo, double motorizacao, String anoModelo, double valorCompra,
				double valorVenda, String chassis, double tamanhoCarroceria, double cargaMaxima, double pesoTotal,
				double alturaCargaMaxima) {
			super(marca, modelo, motorizacao, anoModelo, valorCompra,
					 valorVenda, chassis);
			
			//super(marca, modelo, motorizacao, anoModelo, valorCompra, valorVenda, chassis);
			this.tamanhoCarroceria = tamanhoCarroceria;
			this.cargaMaxima = cargaMaxima;
			this.pesoTotal = pesoTotal;
			this.alturaCargaMaxima = alturaCargaMaxima;
			
		}
		
		public static void efetivar(CargaCarroModel cargaCarro) {
			
			//Adicionando Carro no arrylist
			getCargaCarro().add(cargaCarro);
		}
		

		public double getTamanhoCarroceria() {
			return tamanhoCarroceria;
		}


		public void setTamanhoCarroceria(double tamanhoCarroceria) {
			this.tamanhoCarroceria = tamanhoCarroceria;
		}


		public double getCargaMaxima() {
			return cargaMaxima;
		}


		public void setCargaMaxima(double cargaMaxima) {
			this.cargaMaxima = cargaMaxima;
		}


		public double getPesoTotal() {
			return pesoTotal;
		}


		public void setPesoTotal(double pesoTotal) {
			this.pesoTotal = pesoTotal;
		}


		public double getAlturaCargaMaxima() {
			return alturaCargaMaxima;
		}


		public void setAlturaCargaMaxima(double alturaCargaMaxima) {
			this.alturaCargaMaxima = alturaCargaMaxima;
		}


		public static ArrayList<CargaCarroModel> getCargaCarro() {
			return cargaCarro;
		}
		
		
		
}
