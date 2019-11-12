package io.bitexpress.openapi.cap.model.payment.fundout.otc;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class OtcFundoutOrder implements Serializable {

    private static final long serialVersionUID = 5449259605592226749L;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String id;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal assetAmount;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal currencyAmount;

    @NotBlank
    private String currencyCode;

    private String deliveryMemo;

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

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String outTradeNo;

    @NotBlank
    @Size(max = 100, message = "长度不能超过{max}")
    private String brokerOrderId;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public BigDecimal getAssetAmount() {
        return assetAmount;
    }

    public void setAssetAmount(BigDecimal assetAmount) {
        this.assetAmount = assetAmount;
    }

    public BigDecimal getCurrencyAmount() {
        return currencyAmount;
    }

    public void setCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDeliveryMemo() {
        return deliveryMemo;
    }

    public void setDeliveryMemo(String deliveryMemo) {
        this.deliveryMemo = deliveryMemo;
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

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrokerOrderId() {
        return brokerOrderId;
    }

    public void setBrokerOrderId(String brokerOrderId) {
        this.brokerOrderId = brokerOrderId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
