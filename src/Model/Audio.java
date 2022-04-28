package Model;

import java.applet.Applet;
import java.applet.AudioClip;

public class Audio {

	
	private AudioClip somInicio;
	private AudioClip somFase1;
	
	public Audio(){
		somInicio = Applet.newAudioClip(getClass().getResource("loop.wav"));
		
	}
	
	public void somInicio(){
		somInicio.play();
	}
	
	public void somFase1(){
		somFase1.play();
	}
	
}
