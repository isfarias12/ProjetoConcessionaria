package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;

public class VendaCargaView extends JFrame {

	private JPanel contentPane;
	private JComboBox comboBox;
	private JLabel lblResultCarroceria;
	private JButton btnVisualizar;
	private JLabel lblResultMarca;
	private JLabel lblResultMot;
	private JLabel lblResultAno;
	private JLabel lblResultCargaMaxima;
	private JLabel lblResultPreco;
	private JLabel lblResultPeso;
	private JLabel lblResultChassi;
	private JLabel lblResultAltura;
	private JButton btnComprar;
	private JCheckBox chckbxArCondicionado;
	private JCheckBox chckbxVidroEletrico;
	private JCheckBox chckbxTravaEletrica;
	private JCheckBox chckbxAlarme;
	private JCheckBox chckbxSom;

	
	public VendaCargaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 496);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		comboBox = new JComboBox();
		comboBox.setBounds(129, 32, 134, 20);
		contentPane.add(comboBox);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(54, 35, 46, 14);
		contentPane.add(lblNome);
		
		btnVisualizar = new JButton("Visualizar");
		btnVisualizar.setBounds(284, 31, 103, 23);
		contentPane.add(btnVisualizar);
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setFont(new Font("Arial", Font.BOLD, 11));
		lblMarca.setBounds(54, 84, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o");
		lblMotorizao.setFont(new Font("Arial", Font.BOLD, 11));
		lblMotorizao.setBounds(54, 109, 72, 14);
		contentPane.add(lblMotorizao);
		
		JLabel lblAnomodelo = new JLabel("Ano/Modelo");
		lblAnomodelo.setFont(new Font("Arial", Font.BOLD, 11));
		lblAnomodelo.setBounds(54, 140, 72, 14);
		contentPane.add(lblAnomodelo);
		
		JLabel lblPreoVenda = new JLabel("Pre\u00E7o Venda");
		lblPreoVenda.setFont(new Font("Arial", Font.BOLD, 11));
		lblPreoVenda.setBounds(54, 164, 72, 14);
		contentPane.add(lblPreoVenda);
		
		JLabel lblChassi = new JLabel("Chassi");
		lblChassi.setFont(new Font("Arial", Font.BOLD, 11));
		lblChassi.setBounds(54, 195, 46, 14);
		contentPane.add(lblChassi);
		
		JLabel lblTamCarroceria = new JLabel("Tam. Carroceria");
		lblTamCarroceria.setFont(new Font("Arial", Font.BOLD, 11));
		lblTamCarroceria.setBounds(54, 220, 92, 14);
		contentPane.add(lblTamCarroceria);
		
		JLabel lblCargaMax = new JLabel("Carga Maxima");
		lblCargaMax.setFont(new Font("Arial", Font.BOLD, 11));
		lblCargaMax.setBounds(54, 245, 92, 14);
		contentPane.add(lblCargaMax);
		
		JLabel lblPesoTotal = new JLabel("Peso Total");
		lblPesoTotal.setFont(new Font("Arial", Font.BOLD, 11));
		lblPesoTotal.setBounds(54, 270, 72, 14);
		contentPane.add(lblPesoTotal);
		
		JLabel lblAlturaCarga = new JLabel("Altura Carga");
		lblAlturaCarga.setFont(new Font("Arial", Font.BOLD, 11));
		lblAlturaCarga.setBounds(54, 295, 72, 14);
		contentPane.add(lblAlturaCarga);
		
		lblResultMarca = new JLabel("");
		lblResultMarca.setBounds(167, 84, 158, 14);
		contentPane.add(lblResultMarca);
		
		lblResultMot = new JLabel("");
		lblResultMot.setBounds(167, 109, 158, 14);
		contentPane.add(lblResultMot);
		
		lblResultAno = new JLabel("");
		lblResultAno.setBounds(167, 140, 158, 14);
		contentPane.add(lblResultAno);
		
		lblResultPreco = new JLabel("");
		lblResultPreco.setBounds(167, 164, 158, 14);
		contentPane.add(lblResultPreco);
		
		lblResultChassi = new JLabel("");
		lblResultChassi.setBounds(167, 195, 158, 14);
		contentPane.add(lblResultChassi);
		
		lblResultCarroceria = new JLabel("");
		lblResultCarroceria.setBounds(167, 220, 158, 14);
		contentPane.add(lblResultCarroceria);
		
		lblResultCargaMaxima = new JLabel("");
		lblResultCargaMaxima.setBounds(167, 245, 158, 14);
		contentPane.add(lblResultCargaMaxima);
		
		lblResultPeso = new JLabel("");
		lblResultPeso.setBounds(167, 270, 140, 14);
		contentPane.add(lblResultPeso);
		
		lblResultAltura = new JLabel("");
		lblResultAltura.setBounds(167, 295, 140, 14);
		contentPane.add(lblResultAltura);
		
		btnComprar = new JButton("Comprar");
		btnComprar.setBounds(204, 423, 103, 23);
		contentPane.add(btnComprar);
		
		chckbxArCondicionado = new JCheckBox("Ar Condicionado");
		chckbxArCondicionado.setBounds(21, 347, 110, 23);
		contentPane.add(chckbxArCondicionado);
		
		chckbxVidroEletrico = new JCheckBox("Vidro Eletrico");
		chckbxVidroEletrico.setBounds(129, 347, 97, 23);
		contentPane.add(chckbxVidroEletrico);
		
		chckbxTravaEletrica = new JCheckBox("Trava Eletrica");
		chckbxTravaEletrica.setBounds(228, 347, 97, 23);
		contentPane.add(chckbxTravaEletrica);
		
		chckbxAlarme = new JCheckBox("Alarme");
		chckbxAlarme.setBounds(327, 347, 72, 23);
		contentPane.add(chckbxAlarme);
		
		chckbxSom = new JCheckBox("Som");
		chckbxSom.setBounds(401, 347, 72, 23);
		contentPane.add(chckbxSom);
	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public JLabel getLblResultCarroceria() {
		return lblResultCarroceria;
	}


	public JButton getBtnVisualizar() {
		return btnVisualizar;
	}


	public JLabel getLblResultMarca() {
		return lblResultMarca;
	}


	public JLabel getLblResultMot() {
		return lblResultMot;
	}


	public JLabel getLblResultAno() {
		return lblResultAno;
	}


	public JLabel getLblResultCargaMaxima() {
		return lblResultCargaMaxima;
	}


	public JLabel getLblResultPreco() {
		return lblResultPreco;
	}


	public JLabel getLblResultPeso() {
		return lblResultPeso;
	}


	public JLabel getLblResultChassi() {
		return lblResultChassi;
	}


	public JLabel getLblResultAltura() {
		return lblResultAltura;
	}


	public JButton getBtnComprar() {
		return btnComprar;
	}


	public JCheckBox getChckbxArCondicionado() {
		return chckbxArCondicionado;
	}


	public JCheckBox getChckbxVidroEletrico() {
		return chckbxVidroEletrico;
	}


	public JCheckBox getChckbxTravaEletrica() {
		return chckbxTravaEletrica;
	}


	public JCheckBox getChckbxAlarme() {
		return chckbxAlarme;
	}


	public JCheckBox getChckbxSom() {
		return chckbxSom;
	}

}
