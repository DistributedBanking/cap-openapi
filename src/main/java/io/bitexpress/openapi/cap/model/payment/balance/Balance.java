package io.bitexpress.openapi.cap.model.payment.balance;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;
import java.math.BigDecimal;

public class Balance implements Serializable {

    private static final long serialVersionUID = 5759379292917415659L;

    @NotNull
    @Digits(integer = 24, fraction = 8)
    @PositiveOrZero
    private BigDecimal totalAmount;

    @NotNull
    @Digits(integer = 24, fraction = 8)
    @PositiveOrZero
    private BigDecimal availableAmount;

    @NotNull
    @Digits(integer = 24, fraction = 8)
    @PositiveOrZero
    private BigDecimal frozenAmount;

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getAvailableAmount() {
        return availableAmount;
    }

    public void setAvailableAmount(BigDecimal availableAmount) {
        this.availableAmount = availableAmount;
    }

    public BigDecimal getFrozenAmount() {
        return frozenAmount;
    }

    public void setFrozenAmount(BigDecimal frozenAmount) {
        this.frozenAmount = frozenAmount;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
