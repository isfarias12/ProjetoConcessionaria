package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import model.CargaCarroModel;
import model.PasseioCarroModel;
import javax.swing.JLabel;
import javax.swing.event.AncestorListener;
import javax.swing.text.TabableView;
import javax.swing.event.AncestorEvent;
import control.Principal;
import javax.swing.JComboBox;
import model.CargaCarroModel;
import model.Carro;
import model.PasseioCarroModel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;

public class VendaPasseioView extends JFrame {
	
	private JPanel contentPane = new JPanel();
	private JLabel labelCarro;
	private JComboBox comboNomeCarro;
	private JButton btnVisualizar;
	private JLabel lblMarca;
	private JLabel lblMotorizao;
	private JLabel lblanoModelo;
	private JLabel lblPreoVenda;
	private JLabel lblChassi;
	private JLabel lblCapMalas;
	private JLabel lblPassageiros;
	private JLabel lblResutMarca;
	private JLabel lblResultMot;
	private JLabel lblResultAno;
	private JLabel lblResultPreco;
	private JLabel lblResultChassi;
	private JLabel lblResultMalas;
	private JButton btnEfetuarCompra;
	private JLabel lblResultPassageiros;
	private JCheckBox checkBoxAr;
	private JCheckBox checkBoxVidro;
	private JCheckBox checkBoxTrava;
	private JCheckBox checkBoxAlarme;
	private JCheckBox checkBoxSom;
	
	
	public VendaPasseioView() {
		
		
		setTitle("Venda Carros Passeio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100,100, 503, 451);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		labelCarro = new JLabel("Carro");
		labelCarro.setFont(new Font("Arial", Font.BOLD, 11));
		labelCarro.setBounds(32, 36, 46, 14);
		contentPane.add(labelCarro);
		
		
		contentPane.add(getComboNomeCarro());
		
		btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(212, 32, 89, 23);
		contentPane.add(btnVisualizar);
		
		lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Arial", Font.BOLD, 11));
		lblMarca.setBounds(32, 80, 46, 14);
		contentPane.add(lblMarca);
		
		lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o");
		lblMotorizao.setFont(new Font("Arial", Font.BOLD, 11));
		lblMotorizao.setBounds(32, 105, 76, 14);
		contentPane.add(lblMotorizao);
		
		lblanoModelo = new JLabel("Ano/Modelo");
		lblanoModelo.setFont(new Font("Arial", Font.BOLD, 11));
		lblanoModelo.setBounds(32, 130, 76, 14);
		contentPane.add(lblanoModelo);
		
		lblPreoVenda = new JLabel("Pre\u00E7o Venda");
		lblPreoVenda.setFont(new Font("Arial", Font.BOLD, 11));
		lblPreoVenda.setBounds(32, 155, 89, 14);
		contentPane.add(lblPreoVenda);
		
		lblChassi = new JLabel("Chassi");
		lblChassi.setFont(new Font("Arial", Font.BOLD, 11));
		lblChassi.setBounds(32, 180, 46, 14);
		contentPane.add(lblChassi);
		
		lblCapMalas = new JLabel("Cap. Malas");
		lblCapMalas.setFont(new Font("Arial", Font.BOLD, 11));
		lblCapMalas.setBounds(32, 205, 66, 14);
		contentPane.add(lblCapMalas);
		
		lblPassageiros = new JLabel("Passageiros");
		lblPassageiros.setFont(new Font("Arial", Font.BOLD, 11));
		lblPassageiros.setBounds(32, 230, 76, 14);
		contentPane.add(lblPassageiros);
		

		contentPane.add(getLblResutMarca());
		
		lblResultMot = new JLabel("");
		lblResultMot.setBounds(144, 105, 46, 14);
		contentPane.add(lblResultMot);
		
		lblResultAno = new JLabel("");
		lblResultAno.setBounds(144, 130, 46, 14);
		contentPane.add(lblResultAno);
		
		lblResultPreco = new JLabel("");
		lblResultPreco.setBounds(144, 155, 46, 14);
		contentPane.add(lblResultPreco);
		
		lblResultChassi = new JLabel("");
		lblResultChassi.setBounds(144, 180, 46, 14);
		contentPane.add(lblResultChassi);
		
		lblResultMalas = new JLabel("");
		lblResultMalas.setBounds(144, 205, 46, 14);
		contentPane.add(lblResultMalas);
		
		btnEfetuarCompra = new JButton("Comprar");
		btnEfetuarCompra.setBounds(129, 327, 108, 23);
		contentPane.add(btnEfetuarCompra);
		
		lblResultPassageiros = new JLabel("");
		lblResultPassageiros.setBounds(144, 230, 46, 14);
		contentPane.add(lblResultPassageiros);
		
		checkBoxAr = new JCheckBox("Ar Condicionado");
		checkBoxAr.setBounds(11, 255, 108, 23);
		contentPane.add(checkBoxAr);
		
		checkBoxVidro = new JCheckBox("Vidro Eletrico");
		checkBoxVidro.setBounds(115, 255, 89, 23);
		contentPane.add(checkBoxVidro);
		
		checkBoxTrava = new JCheckBox("Trava Eletrica");
		checkBoxTrava.setBounds(212, 255, 91, 23);
		contentPane.add(checkBoxTrava);
		
		checkBoxAlarme = new JCheckBox("Alarme");
		checkBoxAlarme.setBounds(305, 255, 59, 23);
		contentPane.add(checkBoxAlarme);
		
		checkBoxSom = new JCheckBox("Som");
		checkBoxSom.setBounds(366, 255, 51, 23);
		contentPane.add(checkBoxSom);
		
			
	}


	public JComboBox getComboNomeCarro() {
		if(comboNomeCarro == null) {
			comboNomeCarro = new JComboBox();
			comboNomeCarro.setBounds(82, 33, 108, 20);
		}
		return comboNomeCarro;
	}

	public JLabel getLblResutMarca() {
		if(lblResutMarca == null) {
			lblResutMarca = new JLabel("");
			lblResutMarca.setBounds(144, 80, 46, 14);
		}
		return lblResutMarca;
	}


	public void setLblResutMarca(String lblResutMarca) {
		this.lblResutMarca.setText(lblResutMarca);
	}


	public JLabel getLblResultMot() {
		return lblResultMot;
	}


	public void setLblResultMot(String lblResultMot) {
		this.lblResultMot.setText(lblResultMot);
	}


	public JLabel getLblResultAno() {
		return lblResultAno;
	}


	public void setLblResultAno(String lblResultAno) {
		this.lblResultAno.setText(lblResultAno);
	}


	public JLabel getLblResultPreco() {
		return lblResultPreco;
	}


	public void setLblResultPreco(String lblResultPreco) {
		this.lblResultPreco.setText(lblResultPreco);
	}


	public JLabel getLblResultChassi() {
		return lblResultChassi;
	}


	public void setLblResultChassi(String lblResultChassi) {
		this.lblResultChassi.setText(lblResultChassi);
	}


	public JLabel getLblResultMalas() {
		return lblResultMalas;
	}


	public void setLblResultMalas(String lblResultMalas) {
		this.lblResultMalas.setText(lblResultMalas);
	}


	public JLabel getLblResultPassageiros() {
		return lblResultPassageiros;
	}


	public void setLblResultPassageiros(String lblResultPassageiros) {
		this.lblResultPassageiros.setText(lblResultPassageiros);
	}


	public JCheckBox getCheckBoxAr() {
		return checkBoxAr;
	}


	public JCheckBox getCheckBoxVidro() {
		return checkBoxVidro;
	}


	public JCheckBox getCheckBoxTrava() {
		return checkBoxTrava;
	}


	public JCheckBox getCheckBoxAlarme() {
		return checkBoxAlarme;
	}


	public JCheckBox getCheckBoxSom() {
		return checkBoxSom;
	}	
	
}
