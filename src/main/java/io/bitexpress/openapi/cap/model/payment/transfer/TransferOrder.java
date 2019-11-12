package io.bitexpress.openapi.cap.model.payment.transfer;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TransferOrder implements Serializable {

    private static final long serialVersionUID = 3979175072271995254L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal amount;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String payerUid;

    @NotBlank
    @Size(max = 14, message = "长度不能超过{max}")
    private String receiverMobile;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    @NotBlank
    @Size(max = 10, message = "长度不能超过{max}")
    private String status;

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

    public String getPayerUid() {
        return payerUid;
    }

    public void setPayerUid(String payerUid) {
        this.payerUid = payerUid;
    }

    public String getReceiverMobile() {
        return receiverMobile;
    }

    public void setReceiverMobile(String receiverMobile) {
        this.receiverMobile = receiverMobile;
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
