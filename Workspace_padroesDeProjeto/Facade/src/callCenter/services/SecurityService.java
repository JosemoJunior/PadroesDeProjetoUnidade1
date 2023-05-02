package callCenter.services;


import java.util.List;

import callCenter.model.Card;
import callCenter.model.Register;

public class SecurityService {

	private CardService cardService;
	private RegisterService registerService;
	
	
	public SecurityService(CardService cardService, RegisterService registerService) {
		super();
		this.cardService = cardService;
		this.registerService = registerService;
	}
	
	public List<Register> blockCard(Card card) {
		System.out.println("\n Bloqueando o cartão: " + card);
		List<Register> pendingRegistries = registerService.getRegistersByCard(card);
		cardService.removeCard(card);
		registerService.deleteCardRegistries(card);
		return pendingRegistries;
	}

}
