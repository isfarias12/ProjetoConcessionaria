package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.CargaCarroModel;
import view.CadastroCargaView;

public class ControlCadastroCarga implements ActionListener{

	CadastroCargaView telaCadastro;
	CargaCarroModel cargaCarro;
	
	public ControlCadastroCarga(CadastroCargaView telaCadastro) {
		this.telaCadastro = telaCadastro;
		AddEventos();
		
		telaCadastro.repaint();
		telaCadastro.validate();
		
		
		
	}
	
	private void AddEventos() {
		telaCadastro.getBtnCadastrar().addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == telaCadastro.getBtnCadastrar()) {
			
			try {
				cargaCarro = new CargaCarroModel(telaCadastro.getTxtMarca().getText(), telaCadastro.getTxtModelo().getText(), Double.valueOf(telaCadastro.getTxtmotorizacao().getText()),
						telaCadastro.getTxtAnoModelo().getText(), Double.valueOf(telaCadastro.getTxtValorCompra().getText()), Double.valueOf(telaCadastro.getTxtValorVenda().getText()), 
						telaCadastro.getTxtChassis().getText(), Double.valueOf(telaCadastro.getTxtTamCarroceria().getText()), Double.valueOf(telaCadastro.getTxtCargaMaxima().getText()),
						Double.valueOf(telaCadastro.getTxtPesoTotal().getText()),Double.valueOf(telaCadastro.getTxtAlturaCarga().getText()) );
				
				CargaCarroModel.efetivar(cargaCarro);
				JOptionPane.showMessageDialog(null, "Cadastro efetuado!!");
				JOptionPane.showMessageDialog(null, "Quantidade: " + CargaCarroModel.getCargaCarro().get(0).getModelo());
				
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(telaCadastro, "Erro no cadastro");
			}
		
			
		}
		
	}

}
