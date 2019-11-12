package io.bitexpress.openapi.cap.model.rate;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;
import java.math.BigDecimal;

public class AmountRange implements Serializable {
    private static final long serialVersionUID = 4258274404905962162L;
    private BigDecimal max;
    private BigDecimal min;

    public AmountRange() {
    }

    public AmountRange(BigDecimal min, BigDecimal max) {
        this.min = min;
        this.max = max;
    }

    public BigDecimal getMax() {
        return this.max;
    }

    public void setMax(BigDecimal max) {
        this.max = max;
    }

    public BigDecimal getMin() {
        return this.min;
    }

    public void setMin(BigDecimal min) {
        this.min = min;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}