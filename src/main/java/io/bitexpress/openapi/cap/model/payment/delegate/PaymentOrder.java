package io.bitexpress.openapi.cap.model.payment.delegate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class PaymentOrder implements Serializable {

	private static final long serialVersionUID = 753379078699388598L;

	@NotNull
	@PositiveOrZero
	@Digits(integer = 24, fraction = 8)
	private BigDecimal amount;

	@NotBlank
	@Size(max = 50, message = "长度不能超过{max}")
	private String assetCode;

	@NotBlank
	@Size(max = 200, message = "长度不能超过{max}")
	private String outTradeNo;

	@NotBlank
	@Size(max = 32, message = "长度不能超过{max}")
	private String targetOrderId;

	@NotBlank
	@Size(max = 32, message = "长度不能超过{max}")
	private String payeeUid;

	@NotBlank
	@Size(max = 32, message = "长度不能超过{max}")
	private String payerUid;

	@NotBlank
	@Size(max = 10, message = "长度不能超过{max}")
	private String status;

	@NotNull
	private Date createdTime;

	@NotNull
	private Date lastUpdatedTime;

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getAssetCode() {
		return assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
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

	public String getPayerUid() {
		return payerUid;
	}

	public void setPayerUid(String payerUid) {
		this.payerUid = payerUid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getLastUpdatedTime() {
		return lastUpdatedTime;
	}

	public void setLastUpdatedTime(Date lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
