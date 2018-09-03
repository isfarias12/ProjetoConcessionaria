package model;

public class Contabilidade {
	
	private static double brutoCarroVendidos = 0;
	private static double liquidoCarroVendidos = 0;
	private static int qtdOpcionais = 0 ;
	private static double liquidoOpcionaisVendidos = 0;
	private static int contAcessorios = 0;
	

	public static double getBrutoCarroVendidos() {
		return brutoCarroVendidos;
	}

	public static void setBrutoCarroVendidos(double brutoCarroVendidos) {
		brutoCarroVendidos += brutoCarroVendidos;
	}

	public static double getLiquidoCarroVendidos() {
		return liquidoCarroVendidos;
	}

	public static void setLiquidoCarroVendidos(double liquidoCarroVendidos) {
		liquidoCarroVendidos = liquidoCarroVendidos;
	}

	public static int getQtdOpcionais() {
		return qtdOpcionais;
	}

	public static void setQtdOpcionais(int qtdOpcionais) {
		qtdOpcionais += qtdOpcionais;
	}

	public static double getLiquidoOpcionaisVendidos() {
		return liquidoOpcionaisVendidos;
	}

	public static void setLiquidoOpcionaisVendidos(double liquidoOpcionaisVendidos) {
		liquidoOpcionaisVendidos += liquidoOpcionaisVendidos;
	}

	public static int getContAcessorios() {
		return contAcessorios;
	}

	public static void setContAcessorios(int contAcessorios) {
		contAcessorios += contAcessorios;
	}
		
		
	
}
