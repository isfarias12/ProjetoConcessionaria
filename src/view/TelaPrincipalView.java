package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import model.Carro;
import model.CargaCarroModel;
import model.PasseioCarroModel;

public class TelaPrincipalView extends JFrame {

	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu menuCadastro;
	private JMenuItem itemCadastroCarga;
	private JMenuItem itemCadastroPasseio;
	private JMenu menuVenda;
	private JMenuItem itemVendaCarga;
	private JMenuItem itemVendaPasseio;
	private JMenu menuContabilidade;
	private JMenuItem menuExit;
	
	
	public TelaPrincipalView() {
		initialize();
	}

	
	
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Concessionária TI");
		
		
		menuBar = new JMenuBar();
		menuBar.setBackground(SystemColor.menu);
		frame.setJMenuBar(menuBar);
		
		menuCadastro = new JMenu("Cadastro");
		menuBar.add(menuCadastro);
		
		itemCadastroCarga = new JMenuItem("Carros de Carga");
		menuCadastro.add(itemCadastroCarga);
		
		itemCadastroPasseio = new JMenuItem("Carros de Passeio");
		menuCadastro.add(itemCadastroPasseio);	
		
		
		
		menuVenda = new JMenu("Venda");
		menuBar.add(menuVenda);
		
		itemVendaCarga = new JMenuItem("Carros de Carga");
		menuVenda.add(itemVendaCarga);
		
		itemVendaPasseio = new JMenuItem("Carros de Passeio");
		
		menuVenda.add(itemVendaPasseio);
		
		
		menuContabilidade = new JMenu("Contabilidade");
		menuBar.add(menuContabilidade);
		
		menuExit = new JMenuItem("Exit");
		menuExit.setHorizontalAlignment(SwingConstants.LEFT);
		menuBar.add(menuExit);
		frame.setVisible(true);
	
	}


	//Metodos
	
	public JMenu getMenuCadastro() {
		return menuCadastro;
	}



	public JMenuItem getItemCadastroCarga() {
		return itemCadastroCarga;
	}



	public JMenuItem getItemCadastroPasseio() {
		return itemCadastroPasseio;
	}



	public JMenu getMenuVenda() {
		return menuVenda;
	}



	public JMenuItem getItemVendaCarga() {
		return itemVendaCarga;
	}



	public JMenuItem getItemVendaPasseio() {
		return itemVendaPasseio;
	}



	public JMenu getMenuContabilidade() {
		return menuContabilidade;
	}



	public JMenuItem getMenuExit() {
		return menuExit;
	}
	
		
	
}
