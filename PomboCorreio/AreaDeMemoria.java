package PomboCorreio;

import java.util.ArrayList;

public class AreaDeMemoria {
	// Propriedades da classe
	private static ArrayList<String> fila = new ArrayList<String>();
	private static ArrayList<String> transmitidas = new ArrayList<String>();
	private static ArrayList<String> intermediario = new ArrayList<String>();
	private static boolean imagem = false;
	
	// Métodos get da classe
	public static synchronized ArrayList<String> getFila() {
		return fila;
	}
	
	public static synchronized boolean isImagem() {
		return imagem;
	}

	public static synchronized void setImagem(boolean imagem) {
		AreaDeMemoria.imagem = imagem;
	}

	public static synchronized ArrayList<String> getTransmitidas() {
		return transmitidas;
	}
	// Métodos da classe
	public static synchronized void inserirNaFila(String mensagem) {
		fila.add(mensagem);
	}
	
	public static synchronized void removerDaFila() {
		if(fila.size() > 0) {
		intermediario.add(fila.remove(0));
		}
	}
	
	public static synchronized void RemoverDoIntermediario() {
		if (intermediario.size() > 0) {
			transmitidas.add(intermediario.remove(0));
		}
	}
	
	public static synchronized int qtdMsgFila() {
		return fila.size();
	}
}


