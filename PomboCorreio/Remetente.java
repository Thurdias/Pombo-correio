package PomboCorreio;

public class Remetente extends Thread{
	// Propriedades da classe
	private int numeroRemetente = 0;
	private int numeroMensagem = 0;
	
	// M�todo construtor cheio da classe
	public Remetente(int numeroRemetente) {
		this.numeroRemetente = numeroRemetente;
	}
	
	// M�todo de execu��o paralela da classe
	public void run() {
		while(true) {
			numeroMensagem++;
			AreaDeMemoria.inserirNaFila("Remetente (" + numeroRemetente + ") envia mensagem de n�mero: " 
													  + numeroMensagem);
			try {sleep((int)(10000 * Math.random()));} catch (Exception e) {}
		}
	}
}
