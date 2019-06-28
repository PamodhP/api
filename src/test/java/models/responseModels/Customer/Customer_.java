
package models.responseModels.Customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Customer_ {

    @SerializedName("customerId")
    @Expose
    private String customerId;
    @SerializedName("legalName")
    @Expose
    private String legalName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("bankEntity")
    @Expose
    private String bankEntity;
    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("customerDueDiligenceComplete")
    @Expose
    private Boolean customerDueDiligenceComplete;
    @SerializedName("aeoiCompliant")
    @Expose
    private Boolean aeoiCompliant;
    @SerializedName("addresses")
    @Expose
    private List<Address> addresses = null;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBankEntity() {
        return bankEntity;
    }

    public void setBankEntity(String bankEntity) {
        this.bankEntity = bankEntity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Boolean getCustomerDueDiligenceComplete() {
        return customerDueDiligenceComplete;
    }

    public void setCustomerDueDiligenceComplete(Boolean customerDueDiligenceComplete) {
        this.customerDueDiligenceComplete = customerDueDiligenceComplete;
    }

    public Boolean getAeoiCompliant() {
        return aeoiCompliant;
    }

    public void setAeoiCompliant(Boolean aeoiCompliant) {
        this.aeoiCompliant = aeoiCompliant;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

}
