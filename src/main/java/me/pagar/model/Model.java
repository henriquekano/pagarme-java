package me.pagar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public interface Model {

	public String getId();
	public Boolean existsAtPagarme();
	
	/**
	 * Model�s path as seen in the Pagar.me path
	 * @return
	 */
	@JsonIgnore
	public String getModelPath();
}