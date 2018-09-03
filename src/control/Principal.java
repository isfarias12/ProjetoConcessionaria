package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;

import model.CargaCarroModel;
import model.PasseioCarroModel;
import model.Carro;
import view.CadastroCargaView;
import view.CadastroPasseioView;
import view.TelaPrincipalView;
import view.VendaCargaView;
import view.VendaPasseioView;

public class Principal implements ActionListener {
	
	TelaPrincipalView telaPrincipal;
	CadastroCargaView cadastroCarga;
	
	CadastroPasseioView cadastroPasseio;
	VendaPasseioView vendaPasseio;
	CargaCarroModel cargaCarro;
	
	VendaCargaView telaVendaCarga;
	
	
	
	public Principal(){
		
		telaPrincipal = new TelaPrincipalView();
		AddEventos();
		
		cargaCarro = new CargaCarroModel("Fiat", "Strada", 2.0, "2018", 55000, 63000, "1876sad123", 6 , 300, 700, 3.5); //O PROBLEMA TA AQUI
		CargaCarroModel.getCargaCarro().add(cargaCarro);
		
		cargaCarro = new CargaCarroModel("Vokswagen", "Saveiro", 2.0, "2018", 52000, 60000, "1asd22we1", 6 , 300, 600, 3.7); //O PROBLEMA TA AQUI
		CargaCarroModel.getCargaCarro().add(cargaCarro);
		
		telaPrincipal.repaint();
		telaPrincipal.validate();
		
	}
	
	private void AddEventos() {
		telaPrincipal.getItemCadastroCarga().addActionListener(this);
		telaPrincipal.getItemCadastroPasseio().addActionListener(this);
		telaPrincipal.getItemVendaCarga().addActionListener(this);
		telaPrincipal.getItemVendaPasseio().addActionListener(this);
		telaPrincipal.getMenuExit().addActionListener(this);
		telaPrincipal.getMenuContabilidade().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cadstrar Carro de carga
		if(e.getSource() ==  telaPrincipal.getItemCadastroCarga()) {
			cadastroCarga = new CadastroCargaView();
			new ControlCadastroCarga(cadastroCarga);
			
		}
		//Cadastrar Carro de passeio
		if(e.getSource() == telaPrincipal.getItemCadastroPasseio()) {
			
		}
		
		//Venda
		if(e.getSource() == telaPrincipal.getItemVendaCarga()) {
			telaVendaCarga = new VendaCargaView();
			new ControlVendaCarga(telaVendaCarga);
			
			
		}
		
		if(e.getSource()== telaPrincipal.getItemVendaPasseio()) {
			
			
		}
		
		if(e.getSource() == telaPrincipal.getMenuContabilidade()) {
			
		}
		
		if(e.getSource() == telaPrincipal.getMenuExit()) {
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}

	
	
}
