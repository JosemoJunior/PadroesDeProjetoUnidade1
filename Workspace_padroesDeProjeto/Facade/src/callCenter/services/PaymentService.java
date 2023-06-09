package callCenter.services;

import java.util.List;

import callCenter.model.Card;
import callCenter.model.Register;

public class PaymentService {
		
	private RegisterService registerService;
	
	public PaymentService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public void getPaymentInfoByCard(Card card) {
		List<Register> registers = registerService.getRegistersByCard(card);
		double sum = registers.stream().reduce(0d, (partialValue, reg) -> partialValue + reg.getValue(), Double::sum);
		System.out.println(String.format("\n Sua fatura de %.2f pode ser paga até a proxima semana: ", sum));
	}
	

}
