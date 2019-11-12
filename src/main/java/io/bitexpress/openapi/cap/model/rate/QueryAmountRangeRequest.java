package io.bitexpress.openapi.cap.model.rate;


import io.bitexpress.openapi.cap.constant.Direction;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

public class QueryAmountRangeRequest implements Serializable {
    private static final long serialVersionUID = 5874349987749677014L;
    private String assetCode;
    private String currencyCode;
    private BigDecimal assetAmount;
    private BigDecimal currencyAmount;
    private String customerIdentity;
    private Direction direction;

    public QueryAmountRangeRequest() {
    }

    public String getAssetCode() {
        return this.assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getAssetAmount() {
        return this.assetAmount;
    }

    public void setAssetAmount(BigDecimal assetAmount) {
        this.assetAmount = assetAmount;
    }

    public BigDecimal getCurrencyAmount() {
        return this.currencyAmount;
    }

    public void setCurrencyAmount(BigDecimal currencyAmount) {
        this.currencyAmount = currencyAmount;
    }

    public String getCustomerIdentity() {
        return this.customerIdentity;
    }

    public void setCustomerIdentity(String customerIdentity) {
        this.customerIdentity = customerIdentity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}