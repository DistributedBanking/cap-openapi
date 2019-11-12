package io.bitexpress.openapi.cap.model.payment.acquire;

import javax.validation.constraints.Size;

public class KycParam {
    @Size(max = 128, message = "长度不能超过{max}")
    private String name;

    @Size(max = 128, message = "长度不能超过{max}")
    private String id;

    @Size(max = 128, message = "长度不能超过{max}")
    private String idType;

    @Size(max = 128, message = "长度不能超过{max}")
    private String mobileNumber;

    @Size(max = 128, message = "长度不能超过{max}")
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
