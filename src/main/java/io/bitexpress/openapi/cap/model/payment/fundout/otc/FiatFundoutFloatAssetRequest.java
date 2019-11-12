package io.bitexpress.openapi.cap.model.payment.fundout.otc;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.Map;

public class FiatFundoutFloatAssetRequest extends BaseTradeRequest {

    private static final long serialVersionUID = 39428628047327687L;

    @NotBlank
    private String currencyCode;

    @NotNull
    @Digits(integer = 24, fraction = 8)
    @PositiveOrZero
    private BigDecimal currencyAmount;

    @Size(max = 200, message = "长度不能超过{max}")
    private String notifyUrl;

    /***
     * accountType	收款人账户类型	    String(10)	2：支付宝，3，银行卡	    非空
     * accountNo	收款人账号	    String(200)	 	                    非空
     * accountName	收款人姓名	    String(50)	 	                    非空
     * bank	        银行名称	        String(50)	    银行全称，不带分支行	可空
     * branch	    分支行名称	    String(50)	 	可空	某某路支行
     */
    @NotNull
    private Map<String, String> receiverParam;

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public Map<String, String> getReceiverParam() {
        return receiverParam;
    }

    public void setReceiverParam(Map<String, String> receiverParam) {
        this.receiverParam = receiverParam;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
