package io.bitexpress.openapi.cap.model.payment.withdraw;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class WithdrawOrder implements Serializable {

    private static final long serialVersionUID = 2494445879427196764L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal amount;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal fee;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String payerUid;

    @NotBlank
    @Size(max = 10, message = "长度不能超过{max}")
    private String status;

    @NotBlank
    @Size(max = 60, message = "长度不能超过{max}")
    private String receiverAddress;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String id;

    @NotNull
    private Date createdTime;

    @NotNull
    private Date lastUpdatedTime;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String outTradeNo;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
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

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
