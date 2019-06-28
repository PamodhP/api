
package models.responseModels.PaymentSubmission;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("paymentId")
    @Expose
    private String paymentId;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("settlementStep")
    @Expose
    private SettlementStep settlementStep;
    @SerializedName("creationDateTime")
    @Expose
    private String creationDateTime;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SettlementStep getSettlementStep() {
        return settlementStep;
    }

    public void setSettlementStep(SettlementStep settlementStep) {
        this.settlementStep = settlementStep;
    }

    public String getCreationDateTime() {
        return creationDateTime;
    }

    public void setCreationDateTime(String creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

}
