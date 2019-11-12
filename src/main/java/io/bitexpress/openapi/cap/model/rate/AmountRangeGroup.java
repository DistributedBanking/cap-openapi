package io.bitexpress.openapi.cap.model.rate;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

public class AmountRangeGroup implements Serializable {
    private static final long serialVersionUID = 1116134423438544550L;
    private String assetCode;
    private String currencyCode;
    private List<AmountRange> assetAmountRangeGroup;
    private List<AmountRange> currencyAmountRangeGroup;

    public AmountRangeGroup() {
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

    public List<AmountRange> getAssetAmountRangeGroup() {
        return this.assetAmountRangeGroup;
    }

    public void setAssetAmountRangeGroup(List<AmountRange> assetAmountRangeGroup) {
        this.assetAmountRangeGroup = assetAmountRangeGroup;
    }

    public List<AmountRange> getCurrencyAmountRangeGroup() {
        return this.currencyAmountRangeGroup;
    }

    public void setCurrencyAmountRangeGroup(List<AmountRange> currencyAmountRangeGroup) {
        this.currencyAmountRangeGroup = currencyAmountRangeGroup;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

