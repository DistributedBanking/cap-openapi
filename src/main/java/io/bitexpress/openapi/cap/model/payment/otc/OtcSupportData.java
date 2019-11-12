package io.bitexpress.openapi.cap.model.payment.otc;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class OtcSupportData implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -8200224655032894116L;

    @NotBlank
    private String            merchantOrderNo;

    @NotNull
    private Date              targetOrderCreatedTime;

    @NotBlank
    private String            targetOrderId;

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public Date getTargetOrderCreatedTime() {
        return targetOrderCreatedTime;
    }

    public void setTargetOrderCreatedTime(Date targetOrderCreatedTime) {
        this.targetOrderCreatedTime = targetOrderCreatedTime;
    }

    public String getTargetOrderId() {
        return targetOrderId;
    }

    public void setTargetOrderId(String targetOrderId) {
        this.targetOrderId = targetOrderId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
