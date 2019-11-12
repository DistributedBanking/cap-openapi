package io.bitexpress.openapi.cap.model.payment.acquire;

import javax.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CashierAcquireOrder extends AcquireOrder {

	/**
	 *
	 */
	private static final long serialVersionUID = 9191334172443037164L;

	@NotNull
	private Date expiredTime;

	private String currency;

	private BigDecimal fiatAmount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getFiatAmount() {
		return fiatAmount;
	}

	public void setFiatAmount(BigDecimal fiatAmount) {
		this.fiatAmount = fiatAmount;
	}

	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE).appendSuper(super.toString())
				.append("fiatAmount", this.fiatAmount).append("currency", this.currency)
				.append("expiredTime", this.expiredTime).toString();
	}

}
