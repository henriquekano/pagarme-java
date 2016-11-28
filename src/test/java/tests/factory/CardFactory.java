package tests.factory;

import org.joda.time.DateTime;

import me.pagar.model.request.CardRequest;

public class CardFactory {

	public CardRequest create() {
		return CardRequest.builder()
				.number("4242424242424242")
				.cvv("122")
				.expirationDate(DateTime.now().plusMonths(12))
				.holderName("Teste").build();
	}
}
