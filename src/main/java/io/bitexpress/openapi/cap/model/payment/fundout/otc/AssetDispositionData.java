package io.bitexpress.openapi.cap.model.payment.fundout.otc;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class AssetDispositionData implements Serializable {

    private static final long serialVersionUID = -963177126070387636L;

    @NotBlank
    @Size(max = 32, message = "长度不能超过{max}")
    private String targetOrderId;

    @NotBlank
    private String assetDisposition;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal assetAmount;

    @NotBlank
    @Size(max = 10, message = "长度不能超过{max}")
    private String status;

    private String deliveryMemo;

    @NotNull
    private Date createdTime;

    @NotNull
    private Date lastUpdatedTime;

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    public String getAssetDisposition() {
        return assetDisposition;
    }

    public void setAssetDisposition(String assetDisposition) {
        this.assetDisposition = assetDisposition;
    }

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDeliveryMemo() {
        return deliveryMemo;
    }

    public void setDeliveryMemo(String deliveryMemo) {
        this.deliveryMemo = deliveryMemo;
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

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}

