package PomboCorreio;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Visao extends JFrame {
	// Propriedades da classe
	private static final long serialVersionUID = 1L;
	
	private Painel objPainel = new Painel();
	
	private JLabel lblFila = new JLabel("Fila de Mensagens");
	private JTextArea txtFila = new JTextArea();
	private JScrollPane jspFila = new JScrollPane(txtFila);

	private JLabel lblTransmitidas = new JLabel("Mensagens Transmitidas");
	private JTextArea txtTransmitidas = new JTextArea();
	private JScrollPane jspTransmitidas = new JScrollPane(txtTransmitidas);
	
	// Método principal de execução da classe
	public static void main(String[] args) {
		new Visao().setVisible(true);
	}
	
	// Método construtor da classe
	public Visao() {
		// Configuração da janela
		setTitle("Pombo Correio Multithreaded em Java !!");
		setSize(1024, 786);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setIconImage(new ImageIcon("Pombo.png").getImage());
		
		// Configuração do painel
		objPainel.setLayout(null);
		setContentPane(objPainel);
		
		// Configuração da caixa da fila
		lblFila.setBounds(20, 20, 400, 20);
		objPainel.add(lblFila);
		jspFila.setBounds(20, 40, 470, 600);
		objPainel.add(jspFila);
		txtFila.setLineWrap(true);
		
		// Configuração da caixa de mensagens transmitidas
		lblTransmitidas.setBounds(520, 20, 400, 20);
		objPainel.add(lblTransmitidas);
		jspTransmitidas.setBounds(520, 40, 470, 600);
		objPainel.add(jspTransmitidas);
		txtTransmitidas.setLineWrap(true);
		
		// Configuração das threads
		new PomboCorreio().start();
		
		new Remetente(1).start();
		new Remetente(2).start();
		new Remetente(3).start();
		new Remetente(4).start();
		new Remetente(5).start();
		new Remetente(6).start();
		new Remetente(7).start();
		new Remetente(8).start();
		new Remetente(9).start();
		
		new ControladorCaixas(txtFila, txtTransmitidas).start();
		
		new ControladorImagem(objPainel).start();
	}
}