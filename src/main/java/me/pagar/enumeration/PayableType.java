package me.pagar.enumeration;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PayableType implements EnumFieldConvertable{

	CREDIT("credit"), REFUND("refund"), CHARGEBACK("chargeback");

	private String value;

	private PayableType(String value) {
		this.value = value;
	}

	@JsonValue
	public String getValue() {
		return value;
	}
	public String getField() {
		return "type";
	}
}
