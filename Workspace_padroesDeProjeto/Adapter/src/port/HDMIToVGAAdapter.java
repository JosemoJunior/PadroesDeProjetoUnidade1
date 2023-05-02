package port;

import port.interfaces.HDMI;
import port.interfaces.VGA;

public class HDMIToVGAAdapter implements HDMI {

	public VGA vga;
	
	
	public HDMIToVGAAdapter(VGA vga) {
		this.vga = vga;
	}
	
	@Override
	public void setImage(String image) {
		System.out.println("Adaptando imagem de VGA para HDMI");
		vga.setImage(image);
	}

	@Override
	public void setSound(String sound) {
		System.out.println("Impossível processar o som via VGA.");
	}

}
