package io.bitexpress.openapi.cap.model.payment.delegate;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class QueryPaymentForOrderPageRequest implements Serializable {

    private static final long serialVersionUID = -2923748605828588857L;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}