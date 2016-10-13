package br.com.tablemodelgenerico.view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import br.com.tablemodelgenerico.beans.Cliente;
import br.com.tablemodelgenerico.beans.Veiculo;
import br.com.tablemodelgenerico.utils.TableModelGenerico;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Tela extends JFrame{	
	private static final long serialVersionUID = 1L;
	private JLabel tituloTabela;
	private JScrollPane scp;
	private JTable tabela;
	private TableModelGenerico tb;
	private List<Veiculo> listaDeVeiculos= new ArrayList<>();
	private GridBagLayout layout;
	private GridBagConstraints constraints;
	
	public Tela() {
		setTitle("Table Model Genérico");
		layout= new GridBagLayout();
				
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setMinimumSize(new Dimension(500, 500));
				
		listaDeVeiculos.add(new Veiculo(Veiculo.Tipo.CARRO, "GWR56291TYR", "Ford Fusion", "JKL-9867"));
		listaDeVeiculos.add(new Veiculo(Veiculo.Tipo.CARRO, "TYR63524UIO", "Toyota Corola", "HTR-1254"));
		listaDeVeiculos.add(new Veiculo(Veiculo.Tipo.MOTO,  "YHR21314TRD", "Honda Biz", "NGB-4532"));
		
		List<Cliente>listaDeClientes= new ArrayList<>();
		listaDeClientes.add(new Cliente("Alipio do Amaral", "Rua da Bromélias nº 42", "324542687-98", "5555-5555"));
		listaDeClientes.add(new Cliente("Juvenal Gumercinio", "Avenida Ipiranga nº 432", "543216782-12", "4444-4444"));
		listaDeClientes.add(new Cliente("Epitáfio Pessoal", "Rua Francisco Matarazzo nº 87", "213452987-10", "3333-3333"));
		
		criarTabela(0,0, "Tabela de Veículos", listaDeVeiculos, Veiculo.class);
		criarTabela(0,1, "Tabela de Clientes", listaDeClientes, Cliente.class);
		
	}
	
	
	public static void main(String[] args) {
		new Tela().setVisible(true);
	}
	
	private void criarTabela(int linha,int coluna,String label,List<?> listaDeCoisas,Class<?>tipoDaCoisa){
		
				
		tituloTabela = new JLabel(label);
		constraints= new GridBagConstraints();		
		constraints.weightx=1;
		constraints.weighty=-1;
		setLayout(layout);
		constraints.gridx=coluna;
		constraints.gridy=linha;
		constraints.insets= new Insets(10, 10, 10, 10);
		constraints.anchor=GridBagConstraints.FIRST_LINE_START;		
		add(tituloTabela, constraints);
		
		tb = new TableModelGenerico(listaDeCoisas,tipoDaCoisa);
		tabela= new JTable();
		tabela.setModel(tb);
		scp= new JScrollPane(tabela);
		
		constraints= new GridBagConstraints();		
		constraints.weightx=0.5;
		constraints.weighty=0.5;			
		constraints.gridx=coluna;
		constraints.gridy=linha+1;					
		constraints.insets= new Insets(0, 5, 5, 5);
		constraints.anchor=GridBagConstraints.FIRST_LINE_START;
		constraints.fill=GridBagConstraints.HORIZONTAL;
		add(scp, constraints);
		
	}
}
