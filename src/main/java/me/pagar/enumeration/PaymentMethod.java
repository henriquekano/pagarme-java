package me.pagar.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentMethod implements JsonFieldConvertable {

	CREDIT_CARD("credit_card"), BOLETO("boleto");
	
	private String value;
	
	private PaymentMethod(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String getValue() {
		return value;
	}

	public String getField() {
		return this.name().toLowerCase();
	}
}