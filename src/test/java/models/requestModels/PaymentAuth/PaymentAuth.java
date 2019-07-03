
package models.requestModels.PaymentAuth;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PaymentAuth {

    @SerializedName("Data")
    @Expose
    private Data data;

    public Data getData() {
        return data;
    }

    public PaymentAuth setData(Data data) {
        this.data = data;
        return this;
    }

}
