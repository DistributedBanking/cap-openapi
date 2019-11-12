package io.bitexpress.openapi.cap.model.payment.withdraw;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;

import javax.validation.constraints.*;
import java.math.BigDecimal;

public class WithdrawRequest extends BaseTradeRequest {

    private static final long serialVersionUID = 3705084526909480782L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal amount;

    @NotBlank
    @Size(max = 60, message = "长度不能超过{max}")
    private String receiveAddress;

    @Size(max = 200, message = "长度不能超过{max}")
    private String notifyUrl;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }
}
