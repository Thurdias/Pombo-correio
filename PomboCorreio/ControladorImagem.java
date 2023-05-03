package PomboCorreio;

public class ControladorImagem extends Thread {
	// Propriedades da classe
	private Painel objPainel = null;

	// M�todo construtor cheio da classe
	public ControladorImagem(Painel objPainel) {
		super();
		this.objPainel = objPainel;
	}
	
	// M�todo de execu��o paralela da classe
	public void run() {
		while (true) {
			objPainel.setX(0);
			objPainel.repaint();
			if (AreaDeMemoria.isImagem()) {
				for (int x = 0 ; ((x < 950) && (AreaDeMemoria.isImagem())) ; x++) {
					objPainel.setX(x);
					objPainel.repaint();
					
					try {sleep(10);} catch (InterruptedException e) {}
				}
			}
		}
	}
}