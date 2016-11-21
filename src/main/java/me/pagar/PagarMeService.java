package me.pagar;

import com.google.inject.Guice;
import com.google.inject.Injector;

import me.pagar.dependencyInjection.ListenersModule;
import me.pagar.endpoint.Transactions;

public class PagarMeService {

	private static String API_KEY;
	private static String ENCRYPTION_KEY;
	public final static String ENDPOINT = "https://api.pagar.me";
	public static String VERSION = "1";
	
	public final static Transactions transactions;
	
	static{
		Injector injector = Guice.createInjector(new ListenersModule());
		transactions = injector.getInstance(Transactions.class);
	}
	
	public static void init(String apiKey, String encryptionKey){
		if(API_KEY== null){
			API_KEY = apiKey;
		}
		if(ENCRYPTION_KEY == null){
			ENCRYPTION_KEY = encryptionKey;
		}
	}
	
	public static String getEndpoint(){
		return ENDPOINT + "/" + VERSION;
	}
	
	public static String getApiKey(){
		return API_KEY;
	}
	
}
