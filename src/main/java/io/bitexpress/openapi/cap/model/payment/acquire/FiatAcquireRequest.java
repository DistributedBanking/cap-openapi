package io.bitexpress.openapi.cap.model.payment.acquire;

import java.math.BigDecimal;
import java.util.Locale;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import io.bitexpress.openapi.cap.constant.Currency;
import io.bitexpress.openapi.cap.constant.OtcPaymentChannel;

/**
 * <p>
 * 法币收单请求
 * </p>
 */
public class FiatAcquireRequest extends BaseTradeRequest {

	@NotNull
	@PositiveOrZero
	private BigDecimal fiatAmount;

	@NotNull
	private Currency currency = Currency.CNY;

	@NotBlank
	@Size(max = 200, message = "长度不能超过{max}")
	private String name;

	/**
	 * 收单结果回调通知
	 */
	@Size(max = 200, message = "长度不能超过{max}")
	private String notifyUrl;

	private String email;

	private KycParam kycParam;

	private String language = Locale.ENGLISH.getLanguage();

	private OtcPaymentChannel otcPaymentChannel;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public BigDecimal getFiatAmount() {
		return fiatAmount;
	}

	public void setFiatAmount(BigDecimal fiatAmount) {
		this.fiatAmount = fiatAmount;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public OtcPaymentChannel getOtcPaymentChannel() {
		return otcPaymentChannel;
	}

	public void setOtcPaymentChannel(OtcPaymentChannel otcPaymentChannel) {
		this.otcPaymentChannel = otcPaymentChannel;
	}

	public KycParam getKycParam() {
		return kycParam;
	}

	public void setKycParam(KycParam kycParam) {
		this.kycParam = kycParam;
	}
}
