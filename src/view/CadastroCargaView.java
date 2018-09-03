package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class CadastroCargaView extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarca;
	private JTextField txtmotorizacao;
	private JTextField txtAnoModelo;
	private JTextField txtValorCompra;
	private JTextField txtValorVenda;
	private JTextField txtChassis;
	private JTextField txtTamCarroceria;
	private JTextField txtCargaMaxima;
	private JTextField txtPesoTotal;
	private JTextField txtAlturaCarga;
	private JButton btnCadastrar;
	private JLabel lblModelo;
	private JTextField txtModelo;
	
	
	
	public CadastroCargaView() {
		setTitle("Cadastro Carros de Carga");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 517, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//this.add(get)
		addLabels();
		this.setVisible(true);
	}
	
	
	public void addLabels() {
		
		JLabel lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o");
		lblMotorizao.setBounds(67, 68, 116, 14);
		contentPane.add(lblMotorizao);
		getContentPane().add(getTxtmotorizacao());
		
		JLabel lblAnoDoModelo = new JLabel("Ano do modelo");
		lblAnoDoModelo.setBounds(46, 93, 104, 14);
		contentPane.add(lblAnoDoModelo);
		getContentPane().add(getTxtAnoModelo());
		
		JLabel lblValorDeCompra = new JLabel("Valor de compra");
		lblValorDeCompra.setBounds(46, 124, 114, 14);
		contentPane.add(lblValorDeCompra);
		getContentPane().add(getTxtValorCompra());
		
		JLabel lblValorDeVenda = new JLabel("Valor de Venda");
		lblValorDeVenda.setBounds(46, 155, 114, 14);
		contentPane.add(lblValorDeVenda);
		getContentPane().add(getTxtValorVenda());
		
		JLabel lblChassis = new JLabel("Chassis");
		lblChassis.setBounds(86, 186, 64, 14);
		contentPane.add(lblChassis);
		getContentPane().add(getTxtChassis());
		
		JLabel lblTamDaCarroceria = new JLabel("Tam. da carroceria");
		lblTamDaCarroceria.setBounds(35, 217, 125, 14);
		contentPane.add(lblTamDaCarroceria);
		getContentPane().add(getTxtTamCarroceria());
		
		JLabel lblCargaMaxima = new JLabel("Carga maxima");
		lblCargaMaxima.setBounds(56, 248, 104, 14);
		contentPane.add(lblCargaMaxima);
		getContentPane().add(getTxtCargaMaxima());
		
		JLabel lblPesoTotal = new JLabel("Peso total");
		lblPesoTotal.setBounds(67, 279, 86, 14);
		contentPane.add(lblPesoTotal);
		getContentPane().add(getTxtPesoTotal());
		
		JLabel lblAlturaDaCarga = new JLabel("Altura da Carga");
		lblAlturaDaCarga.setBounds(46, 310, 115, 14);
		contentPane.add(lblAlturaDaCarga);
		getContentPane().add(getTxtAlturaCarga());
		
		getContentPane().add(getBtnCadastrar());
		
		
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(90, 11, 46, 14);
		contentPane.add(lblMarca);
		getContentPane().add(getTxtMarca());
		
		contentPane.add(getLblModelo());
		getContentPane().add(getTxtModelo());
		/*
		*/
		
		
		
	}

	

	



	public JTextField getTxtMarca() {
		if (txtMarca == null) {
			txtMarca = new JTextField();
			txtMarca.setBounds(142, 8, 155, 20);
			contentPane.add(txtMarca);
			txtMarca.setColumns(10);
		}
		return txtMarca;
	}

	

	public JTextField getTxtmotorizacao() {
		if (txtmotorizacao == null) {
			txtmotorizacao = new JTextField();
			txtmotorizacao.setBounds(142, 65, 155, 20);
			contentPane.add(txtmotorizacao);
			txtmotorizacao.setColumns(10);
			
		}
		return txtmotorizacao;
	}

	

	public JTextField getTxtAnoModelo() {
		if (txtAnoModelo == null) {
			txtAnoModelo = new JTextField();
			txtAnoModelo.setBounds(142, 90, 155, 20);
			contentPane.add(txtAnoModelo);
			txtAnoModelo.setColumns(10);
			
		}
		return txtAnoModelo;
	}

	

	public JTextField getTxtValorCompra() {
		if (txtValorCompra == null) {
			txtValorCompra = new JTextField();
			txtValorCompra.setBounds(142, 121, 155, 20);
			contentPane.add(txtValorCompra);
			txtValorCompra.setColumns(10);
		}
		return txtValorCompra;
	}


	public JTextField getTxtValorVenda() {
		if (txtValorVenda== null) {
			txtValorVenda = new JTextField();
			txtValorVenda.setColumns(10);
			txtValorVenda.setBounds(142, 152, 155, 20);
			contentPane.add(txtValorVenda);
		}
		return txtValorVenda;
	}


	public JTextField getTxtChassis() {
		if (txtChassis == null) {
			txtChassis = new JTextField();
			txtChassis.setColumns(10);
			txtChassis.setBounds(142, 183, 155, 20);
			contentPane.add(txtChassis);
		}
		return txtChassis;
	}


	public JTextField getTxtTamCarroceria() {
		if (txtTamCarroceria == null) {
			txtTamCarroceria = new JTextField();
			txtTamCarroceria.setColumns(10);
			txtTamCarroceria.setBounds(142, 214, 155, 20);
			contentPane.add(txtTamCarroceria);
		}
		return txtTamCarroceria;
	}


	public JTextField getTxtCargaMaxima() {
		if (txtCargaMaxima == null) {
			txtCargaMaxima = new JTextField();
			txtCargaMaxima.setColumns(10);
			txtCargaMaxima.setBounds(142, 245, 155, 20);
			contentPane.add(txtCargaMaxima);
			
		}
		return txtCargaMaxima;
	}


	public JTextField getTxtPesoTotal() {
		if (txtPesoTotal == null) {
			txtPesoTotal = new JTextField();
			txtPesoTotal.setColumns(10);
			txtPesoTotal.setBounds(142, 276, 155, 20);
			contentPane.add(txtPesoTotal);
			
		}
		return txtPesoTotal;
	}

	public JTextField getTxtAlturaCarga() {
		if (txtAlturaCarga == null) {
			txtAlturaCarga = new JTextField();
			txtAlturaCarga.setBounds(142, 307, 155, 20);
			contentPane.add(txtAlturaCarga);
			txtAlturaCarga.setColumns(10);
			
		}
		return txtAlturaCarga;
	}


	public JButton getBtnCadastrar() {
		if(btnCadastrar == null) {
			btnCadastrar = new JButton("Cadastrar");
			btnCadastrar.setBounds(165, 349, 119, 23);
			contentPane.add(btnCadastrar);
		}
		return btnCadastrar;
	}

	
	private JLabel getLblModelo() {
		if (lblModelo == null) {
			lblModelo = new JLabel("Modelo");
			lblModelo.setBounds(90, 36, 46, 14);
		}
		return lblModelo;
	}
	
	public JTextField getTxtModelo() {
		if(txtModelo == null) {
			txtModelo = new JTextField();
			txtModelo.setBounds(142, 33, 155, 20);
			contentPane.add(txtModelo);
			txtModelo.setColumns(10);
		}
		return txtModelo;
	}
}
