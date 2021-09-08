package start;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import util.Tempo;

public class Alarme {
	static int num = 1;

	public static void main(String[] args) throws Exception {

		// Para a execução (senão o programa termina antes de você ouvir o som)
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				// JOptionPane.showMessageDialog(null, "Alarme Ativado!");
				num = JOptionPane.showConfirmDialog(null, "Desativar o alarme?");
			}
		});

		while (num != 0) {
			System.out.println("num: "+num);
			// URL do som que no caso esta no pendrive, mais ainda é uma fase de teste.
			String userDir = System.getProperty("user.dir");
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File(userDir + "\\src\\main\\resources\\som.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);

			clip.start();
			Tempo.aguardarEmSegundos(false, 5, null);
			System.out.println("loop...");
			clip.flush();

		}
		// clip.loop(Clip.LOOP_CONTINUOUSLY); // Para repetir o som.
	}
}