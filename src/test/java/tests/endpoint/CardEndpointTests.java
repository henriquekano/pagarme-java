package tests.endpoint;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

import me.pagar.PagarMeService;
import me.pagar.converter.ParserException;
import me.pagar.model.request.CardRequest;
import me.pagar.model.response.CardResponse;
import me.pagar.rest.HttpException;
import tests.factory.CardFactory;

public class CardEndpointTests {

	private final CardFactory cardFactory;
	
	public CardEndpointTests() {
		cardFactory = new CardFactory();
		PagarMeService.init("ak_test_zXjKL8u5uxn25HNxHviPbhthNV0nL7", "");
	}
	
	@Test
	public void testFindTransactionCollection() throws HttpException, IOException, ParserException{
		CardRequest cardFilter = new CardRequest();
		ArrayList<CardResponse> foundCards = PagarMeService.cards.find(cardFilter);
		Assert.assertTrue(foundCards.size() > 1);
	}
}
