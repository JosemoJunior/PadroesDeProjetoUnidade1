package observer;

public class Namorada implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarianteEvent evento) {
		System.out.println("Namorada diz:");
		System.out.println("->Apagar as luzes...");
		System.out.println("->Fazer silêncio");
		System.out.println("->Surpresa...");
	}
}
