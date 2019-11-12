package io.bitexpress.openapi.cap.model.payment.delegate;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class CreatePaymentForOrderRequest extends BaseTradeRequest {

	private static final long serialVersionUID = -2958163110666658446L;

	@NotNull
	@PositiveOrZero
	@Digits(integer = 24, fraction = 8)
	private BigDecimal amount;

	@NotBlank
	@Size(max = 32, message = "长度不能超过{max}")
	private String targetOrderId;

	@NotBlank
	@Size(max = 32, message = "长度不能超过{max}")
	private String payeeUid;

	@Size(max = 200, message = "长度不能超过{max}")
	private String notifyUrl;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getTargetOrderId() {
		return targetOrderId;
	}

	public void setTargetOrderId(String targetOrderId) {
		this.targetOrderId = targetOrderId;
	}

	public String getPayeeUid() {
		return payeeUid;
	}

	public void setPayeeUid(String payeeUid) {
		this.payeeUid = payeeUid;
	}

	public String getNotifyUrl() {
		return notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
