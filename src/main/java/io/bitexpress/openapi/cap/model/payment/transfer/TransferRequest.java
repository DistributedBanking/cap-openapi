package io.bitexpress.openapi.cap.model.payment.transfer;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class TransferRequest extends BaseTradeRequest {

    private static final long serialVersionUID = -6129602116851713659L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal amount;

    @NotBlank
    @Size(max = 14, message = "长度不能超过{max}")
    private String receiverMobile;

    @Size(max = 200, message = "长度不能超过{max}")
    private String notifyUrl;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
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
