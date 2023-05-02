package observer;

public class Amigo implements ChegadaAniversarianteObserver{

	@Override
	public void chegou(ChegadaAniversarianteEvent evento) {
		System.out.println("Amigo diz: ");
		System.out.println("-> Parabéns");
		System.out.println("->Trouxe seu presente!!");
	}
}
