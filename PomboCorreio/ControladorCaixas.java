package PomboCorreio;

import javax.swing.JTextArea;

public class ControladorCaixas extends Thread{
	// Propriedades da classe
	private JTextArea txtFila = null;
	private JTextArea txtTransmitidas = null;
	
	// Método construtor cheio da classe
	public ControladorCaixas(JTextArea txtFila, JTextArea txtTransmitidas) {
		super();
		this.txtFila = txtFila;
		this.txtTransmitidas = txtTransmitidas;
	}
	
	// Método de execução paralela da classe
	public void run() {
		while(true) {
			txtFila.setText("");
			for(String texto : AreaDeMemoria.getFila()) {
				txtFila.append(texto + "\n");
			}
			txtTransmitidas.setText("");
			for(String texto : AreaDeMemoria.getTransmitidas()) {
				txtTransmitidas.append(texto + "\n");
			}
			
			try {sleep(1000);} catch (Exception e) {}
		}
	}
	
	
}
