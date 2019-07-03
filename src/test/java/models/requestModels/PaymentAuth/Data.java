
package models.requestModels.PaymentAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data {

    @SerializedName("PaymentContractReference")
    @Expose
    private String paymentContractReference;
    @SerializedName("OrderingCustomerAccountIdentification")
    @Expose
    private String orderingCustomerAccountIdentification;
    @SerializedName("OriginatorId")
    @Expose
    private String originatorId;
    @SerializedName("OrderingCustomerName")
    @Expose
    private String orderingCustomerName;
    @SerializedName("Authorities")
    @Expose
    private List<Authority> authorities = null;

    public String getPaymentContractReference() {
        return paymentContractReference;
    }

    public Data setPaymentContractReference(String paymentContractReference) {
        this.paymentContractReference = paymentContractReference;
        return this;
    }

    public String getOrderingCustomerAccountIdentification() {
        return orderingCustomerAccountIdentification;
    }

    public Data setOrderingCustomerAccountIdentification(String orderingCustomerAccountIdentification) {
        this.orderingCustomerAccountIdentification = orderingCustomerAccountIdentification;
        return this;
    }

    public String getOriginatorId() {
        return originatorId;
    }

    public Data setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
        return this;
    }

    public String getOrderingCustomerName() {
        return orderingCustomerName;
    }

    public Data setOrderingCustomerName(String orderingCustomerName) {
        this.orderingCustomerName = orderingCustomerName;
        return this;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public Data setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
        return this;
    }

}
