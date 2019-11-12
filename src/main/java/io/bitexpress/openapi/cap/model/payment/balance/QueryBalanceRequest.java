package io.bitexpress.openapi.cap.model.payment.balance;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class QueryBalanceRequest implements Serializable {

    private static final long serialVersionUID = -784616482066095774L;

    @NotBlank
    @Size(max = 50, message = "长度不能超过{max}")
    private String assetCode;

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
