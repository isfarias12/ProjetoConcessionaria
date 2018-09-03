package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPasseioView extends JFrame {
	
	
	private JPanel contentPane;
	private JTextField marca;
	private JTextField modelo;
	private JTextField motorizacao;
	private JTextField anoModelo;
	private JTextField valorCompra;
	private JTextField valorVenda;
	private JTextField chassis;
	private JTextField litragemPortaMalas;
	private JTextField numPassageiros;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPasseioView frame = new CadastroPasseioView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroPasseioView() {
		setTitle("Cadastro Carros Passeio");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 490, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		addEventos();
		addLabels();
		
	}
	
	public void addEventos() {
		getMarca();
		getModelo();
		getMotorizacao();
		getAnoModelo();
		getValorCompra();
		getValorVenda();
		getChassis();
		getLitragemPortaMalas();
		getNumPassageiros();
		
	}
	
	public void addLabels() {
		JLabel lblMarca = new JLabel("Marca");
		lblMarca.setBounds(99, 28, 46, 14);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(99, 63, 46, 14);
		contentPane.add(lblModelo);
		
		JLabel lblMotorizao = new JLabel("Motoriza\u00E7\u00E3o");
		lblMotorizao.setBounds(80, 94, 138, 14);
		contentPane.add(lblMotorizao);
		
		JLabel lblAnoModelo = new JLabel("Ano Modelo");
		lblAnoModelo.setBounds(77, 125, 68, 14);
		contentPane.add(lblAnoModelo);
		
		JLabel lblValorDeCompra = new JLabel("Valor de compra");
		lblValorDeCompra.setBounds(59, 156, 96, 14);
		contentPane.add(lblValorDeCompra);
		
		JLabel lblValorDeVenda = new JLabel("Valor de venda");
		lblValorDeVenda.setBounds(59, 187, 96, 14);
		contentPane.add(lblValorDeVenda);
		
		JLabel lblChassis = new JLabel("Chassis");
		lblChassis.setBounds(99, 218, 46, 14);
		contentPane.add(lblChassis);
		
		JLabel lblLitragemPMalas = new JLabel("Litragem P. malas");
		lblLitragemPMalas.setBounds(49, 249, 106, 14);
		contentPane.add(lblLitragemPMalas);
		
		JLabel lblNDePassageiros = new JLabel("N\u00BA de Passageiros");
		lblNDePassageiros.setBounds(49, 282, 106, 14);
		contentPane.add(lblNDePassageiros);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setBounds(178, 319, 106, 23);
		contentPane.add(btnCadastrar);
		
		
	}
			
	//TODOS OS MÉTODOS GETS
	public JTextField getMarca() {
		if(marca==null) {
			marca = new JTextField();
			marca.setBounds(155, 25, 151, 20);
			contentPane.add(marca);
			marca.setColumns(10);
		}
		return marca;
	}

	public JTextField getModelo() {
		if(modelo==null) {
			modelo = new JTextField();
			modelo.setBounds(155, 60, 151, 20);
			contentPane.add(modelo);
			modelo.setColumns(10);
			
		}
		return modelo;
	}

	public JTextField getMotorizacao() {
		if(motorizacao == null) {
			motorizacao = new JTextField();
			motorizacao.setBounds(155, 91, 151, 20);
			contentPane.add(motorizacao);
			motorizacao.setColumns(10);
		}
		return motorizacao;
	}



	public JTextField getAnoModelo() {
		if(anoModelo == null) {
			anoModelo = new JTextField();
			anoModelo.setBounds(155, 122, 151, 20);
			contentPane.add(anoModelo);
			anoModelo.setColumns(10);
			
		}
		return anoModelo;
	}


	public JTextField getValorCompra() {
		if(valorCompra == null) {
			valorCompra = new JTextField();
			valorCompra.setBounds(155, 153, 151, 20);
			contentPane.add(valorCompra);
			valorCompra.setColumns(10);
		}
		return valorCompra;
	}


	public JTextField getValorVenda() {
		if(valorVenda == null) {
			valorVenda = new JTextField();
			valorVenda.setBounds(155, 184, 151, 20);
			contentPane.add(valorVenda);
			valorVenda.setColumns(10);
			
		}
		return valorVenda;
	}


	public JTextField getChassis() {
		if(chassis == null) {
			chassis = new JTextField();
			chassis.setBounds(155, 215, 151, 20);
			contentPane.add(chassis);
			chassis.setColumns(10);
			
		}
		return chassis;
	}


	public JTextField getLitragemPortaMalas() {
		if(litragemPortaMalas == null) {
			litragemPortaMalas = new JTextField();
			litragemPortaMalas.setBounds(155, 246, 151, 20);
			contentPane.add(litragemPortaMalas);
			litragemPortaMalas.setColumns(10);
		}
		return litragemPortaMalas;
	}


	public JTextField getNumPassageiros() {
		if(numPassageiros == null) {
			numPassageiros = new JTextField();
			numPassageiros.setBounds(155, 279, 151, 20);
			contentPane.add(numPassageiros);
			numPassageiros.setColumns(10);
			
		}
		return numPassageiros;
	}

	
	

	

	

}
