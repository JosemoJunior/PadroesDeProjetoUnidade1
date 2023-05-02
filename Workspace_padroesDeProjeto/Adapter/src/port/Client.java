package port;
public class Client {

	public static void main(String[] args) {
		
		System.out.println("------ Teste PC e TV com entrada HDMI ----------");
		Computer pc = new Computer();
		TV tv = new TV();
		pc.connectPort(tv);
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");
		
		System.out.println("\n------\n");
		System.out.println("------ Teste PC com entrada HDMI e TV com entrada VGA ----------");
		
		OldMonitor monitor = new OldMonitor();
		HDMIToVGAAdapter tvAdaptada = new HDMIToVGAAdapter(monitor);
		
		pc.connectPort(tvAdaptada);
		
		pc.sendImageAndSound("Cat and rainbow", "Nyan cat song");

	}
}