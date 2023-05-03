package PomboCorreio;

public class PomboCorreio extends Thread{
	public void run() {
		while(true) {
			if (AreaDeMemoria.qtdMsgFila() < 20) {
				try { sleep(1000);} catch (Exception e) {} 
			} else {
				for(int i = 0; i < 20; i++) {
					AreaDeMemoria.removerDaFila();
				}
				
				AreaDeMemoria.setImagem(true);
				
				try { sleep(10000);} catch (Exception e) {}
								
				for(int i = 0;i < 20; i++) {
					AreaDeMemoria.RemoverDoIntermediario();
				}
				
				AreaDeMemoria.setImagem(false);
			}
		}
	}
}
