package tests.factory;

import me.pagar.model.Address;

public class AddressFactory {

	public Address create(){
		Address address = new Address("rua", "123", "complemento", "bairro", "06350270");
		return address;
	}
}
