package me.pagar.model.request;

import org.joda.time.DateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.pagar.model.Card;

@Data
@NoArgsConstructor
public class CardRequest extends Card implements RequestObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6177998031744400057L;
	private String number;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="MMyy")
	private DateTime expirationDate;
	private String customerId;
	private String hash;
	private String cvv;

	@Builder
	public CardRequest(String id, String holderName,
			String number, DateTime expirationDate, String customerId, String hash, String cvv) {
		super(id);
		this.number = number;
		this.expirationDate = expirationDate;
		this.customerId = customerId;
		this.hash = hash;
		this.cvv = cvv;
	}

}
