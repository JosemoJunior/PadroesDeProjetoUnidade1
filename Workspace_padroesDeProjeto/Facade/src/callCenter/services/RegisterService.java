package callCenter.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import callCenter.model.Card;
import callCenter.model.Register;

public class RegisterService {
	private Map<Long, List<Register>> memory;
	
	public RegisterService() {
		memory = new HashMap<Long, List<Register>>();
		memory.put(11223344L, new ArrayList<>(Arrays.asList(
				new Register("\n Mercadinho Arquarius", 45d, new Date()),
				new Register("\n Posto BR", 50d, new Date()),
				new Register("\n Padaria Sabor do Trigo", 50d, new Date())
			)));
	}

	public List<Register> getRegistersByCard(Card card) {
		return memory.get(card.getCardNumber());
	}

	public void removeByIndex(Card card, int i) {
		List<Register> list = memory.get(card.getCardNumber());
		Register reg = list.remove(i);
		System.out.println(reg.toString() + " Deleted!");
		memory.put(card.getCardNumber(), list);
	}

	public void deleteCardRegistries(Card card) {
		memory.remove(card.getCardNumber());
	}
	
	public void addCardRegisters(Card card, List<Register> registers) {
		System.out.println("Associating pending Registers to new Card!");
		memory.put(card.getCardNumber(), registers);
	}
	
}
