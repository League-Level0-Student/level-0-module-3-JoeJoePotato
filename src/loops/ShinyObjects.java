//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package loops;
import javax.swing.JOptionPane;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class ShinyObjects {
	public static void main(String[] args) {
		String request= JOptionPane.showInputDialog("How many shiny objects do you want? enter a number.");
int things=Integer.parseInt(request);
		// 2. Ask the user how many shiny objects they want
for (int i = 0; i < things; i++) {
		// 3. Play the sound that many times
playMisterZee();
}
		// 1. Call the method below
	}
	
	

	public static void playMisterZee() {
    	try {
 
   		 Clip clip = AudioSystem.getClip();
   		 clip.open(AudioSystem.getAudioInputStream(ShinyObjects.class.getResource("shiny-objects.wav")));
   		 clip.start();
   		 Thread.sleep(3600);
    	} catch (Exception ex) {
        	ex.printStackTrace();
    	}
	}


}
