package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.CargaCarroModel;
import model.Contabilidade;
import view.VendaCargaView;

public class ControlVendaCarga implements ActionListener {
	
	VendaCargaView telaVenda;
	//CargaCarroModel cargaCarro;
	int indice;
	
	public ControlVendaCarga(VendaCargaView telaVenda) {
		this.telaVenda = telaVenda;
		telaVenda.repaint();
		telaVenda.validate();
		AddEventos();
		for(int i=0; i<CargaCarroModel.getCargaCarro().size(); i++) {
			telaVenda.getComboBox().addItem(CargaCarroModel.getCargaCarro().get(i).getModelo());
		}
		telaVenda.setVisible(true);
		
	}
	
	
	public void AddEventos() {
		telaVenda.getBtnVisualizar().addActionListener(this);
		telaVenda.getBtnComprar().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == telaVenda.getBtnVisualizar()) {
			for(int i = 0; i<CargaCarroModel.getCargaCarro().size(); i++) {
				
				if(telaVenda.getComboBox().getSelectedItem().toString() == CargaCarroModel.getCargaCarro().get(i).getModelo()) {
					indice = i;
					telaVenda.getLblResultAltura().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getAlturaCargaMaxima()));
					telaVenda.getLblResultAno().setText(CargaCarroModel.getCargaCarro().get(i).getAnoModelo());
					telaVenda.getLblResultCargaMaxima().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getCargaMaxima()));
					telaVenda.getLblResultCarroceria().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getTamanhoCarroceria()));
					telaVenda.getLblResultChassi().setText(CargaCarroModel.getCargaCarro().get(i).getChassis());
					telaVenda.getLblResultMarca().setText(CargaCarroModel.getCargaCarro().get(i).getMarca());
					telaVenda.getLblResultMot().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getMotorizacao()));
					telaVenda.getLblResultPeso().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getPesoTotal()));
					telaVenda.getLblResultPreco().setText(String.valueOf(CargaCarroModel.getCargaCarro().get(i).getValorVenda()));
					break;
					
				}	
			}
		}
		if(e.getSource() == telaVenda.getBtnComprar()) {
			
			if(telaVenda.getChckbxArCondicionado().isSelected()) {
				Contabilidade.setContAcessorios(1);
				Contabilidade.setLiquidoOpcionaisVendidos(CargaCarroModel.getCargaCarro().get(indice).getAcessorios(0));
			}
			
		}
		
	}
	
}
