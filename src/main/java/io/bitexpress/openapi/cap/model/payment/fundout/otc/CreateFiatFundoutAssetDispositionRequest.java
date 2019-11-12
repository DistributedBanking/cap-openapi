package io.bitexpress.openapi.cap.model.payment.fundout.otc;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.io.Serializable;
import java.math.BigDecimal;

public class CreateFiatFundoutAssetDispositionRequest implements Serializable {

    private static final long serialVersionUID = 5977675417609320514L;

    @NotBlank
    private String targetOrderId;

    @NotBlank
    private String assetDisposition;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    @NotNull
    @Digits(integer = 24, fraction = 8)
    @PositiveOrZero
    private BigDecimal assetAmount;

    @NotBlank
    private String deliveryMemo;

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

    public String getDeliveryMemo() {
        return deliveryMemo;
    }

    public void setDeliveryMemo(String deliveryMemo) {
        this.deliveryMemo = deliveryMemo;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
