package io.bitexpress.openapi.cap.model.payment.acquire;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AcquireOrder implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -1239511177627222996L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal        amount;

    private BigDecimal        realArrivedAmount;

    @NotNull
    private String            interactionMode;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String            name;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String            payeeUid;

    @NotBlank
    @Size(max = 10, message = "长度不能超过{max}")
    private String            status;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String            assetCode;

    @NotNull
    private Date              createdTime;

    @NotNull
    private Date              lastUpdatedTime;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String            id;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String            outTradeNo;

    private String            kycName;

    public String getKycName() {
        return kycName;
    }

    public void setKycName(String kycName) {
        this.kycName = kycName;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRealArrivedAmount() {
        return realArrivedAmount;
    }

    public void setRealArrivedAmount(BigDecimal realArrivedAmount) {
        this.realArrivedAmount = realArrivedAmount;
    }

    public String getInteractionMode() {
        return interactionMode;
    }

    public void setInteractionMode(String interactionMode) {
        this.interactionMode = interactionMode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayeeUid() {
        return payeeUid;
    }

    public void setPayeeUid(String payeeUid) {
        this.payeeUid = payeeUid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
            .append("payeeUid", this.payeeUid).append("amount", this.amount)
            .append("interactionMode", this.interactionMode).append("assetCode", this.assetCode)
            .append("outTradeNo", this.outTradeNo).append("name", this.name)
            .append("createdTime", this.createdTime)
            .append("realArrivedAmount", this.realArrivedAmount)
            .append("lastUpdatedTime", this.lastUpdatedTime).append("id", this.id)
            .append("status", this.status).append("kycName", this.kycName).toString();
    }

}
