package io.bitexpress.openapi.cap.constant;

public enum OtcPaymentChannel {

                             /* WECHAT("微信"),*/ ALIPAY("支付宝"), BANKCARD("银行卡");

    private String description;

    OtcPaymentChannel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
