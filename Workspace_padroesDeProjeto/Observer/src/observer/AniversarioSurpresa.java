package observer;

public class AniversarioSurpresa {

	public static void main(String[] args) {
		
		//Ao exercutar o main, iniciará o laço (While) enquanto o usuário digitar qualquer número diferente de 1, ele alertarar que foi um alarme falso,
		// mas ao teclar 1, o porteiro informará aos observers que o aniversariante chegou.
		
		
		Namorada namorada = new Namorada();
		Porteiro porteiro = new Porteiro();
		Amigo amigoDoPredio = new Amigo();
		
		// A namorada pedindo para o porteiro avisar 
		//		quando o aniversariante chegar.
		porteiro.addChegadaAniversarianteObserver(namorada);
		
		// Um amigo que mora no mesmo prédio pedindo
		// 		para porteiro avisar quando o 
		//		aniversariante chegar
		porteiro.addChegadaAniversarianteObserver(amigoDoPredio);
		
		// Iniciando o Observer
		porteiro.start();
	}

}
