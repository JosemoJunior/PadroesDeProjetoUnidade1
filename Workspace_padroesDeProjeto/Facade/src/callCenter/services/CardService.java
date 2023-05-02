package callCenter.services;

import java.util.HashMap;
import java.util.Map;

import callCenter.model.Card;

public class CardService {
	
	private Map<Long, Card> memory;

	public CardService() {
		memory = new HashMap<>();
		memory.put(123456L, new Card(123456L, 11223344L));

	}
	
	public Card getCardByUser(Long l) {
		return memory.get(l);
	}
	
	public void removeCard (Card card) {
		memory.remove(card.getUserNumber());
	}
	
	public Card createNewCard(Long user, Long cardNumber) {
		Card newCard = new Card(user, cardNumber);
		memory.put(user, newCard);
		System.out.println("Criando um novo cartão: " + newCard);
		return newCard;
		
	}
	
	

}
