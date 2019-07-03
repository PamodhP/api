
package models.requestModels.PaymentAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Authority {

    @SerializedName("CustomerId")
    @Expose
    private String customerId;

    public String getCustomerId() {
        return customerId;
    }

    public Authority setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

}
