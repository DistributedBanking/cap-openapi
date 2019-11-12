package io.bitexpress.openapi.cap.model.payment.acquire;

import io.bitexpress.openapi.cap.model.payment.BaseTradeRequest;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * <p>收单请求</p>
 *
 * @author wangbin
 * @version $Id: AcquireOrderRequest.java, v 0.1 2019年3月14日 下午2:51:42 wangbin01 Exp $
 */
public class CashierAcquireRequest extends BaseTradeRequest {

    /**
     *
     */
    private static final long serialVersionUID = -3669352579276119742L;

    @NotNull
    @PositiveOrZero
    @Digits(integer = 24, fraction = 8)
    private BigDecimal amount;

    @NotBlank
    @Size(max = 200, message = "长度不能超过{max}")
    private String name;

    /**
     * 收单结果回调通知
     */
    @Size(max = 200, message = "长度不能超过{max}")
    private String notifyUrl;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
