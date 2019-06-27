package models.requestModels.Payments;

public class PaymentInformation {
    private String PaymentType;

    private String PaymentFXContractReference;

    private String PaymentValueDate;

    private PaymentAmount PaymentAmount;

    private String ChargeType;

    public String getPaymentType() {
        return this.PaymentType;
    }

    public PaymentInformation setPaymentType(String PaymentType) {
        this.PaymentType = PaymentType;
        return this;
    }

    public String getPaymentFXContractReference() {
        return this.PaymentFXContractReference;
    }

    public PaymentInformation setPaymentFXContractReference(String PaymentFXContractReference) {
        this.PaymentFXContractReference = PaymentFXContractReference;
        return this;
    }

    public String getPaymentValueDate() {
        return this.PaymentValueDate;
    }

    public PaymentInformation setPaymentValueDate(String PaymentValueDate) {
        this.PaymentValueDate = PaymentValueDate;
        return this;
    }

    public PaymentAmount getPaymentAmount() {
        return this.PaymentAmount;
    }

    public PaymentInformation setPaymentAmount(PaymentAmount PaymentAmount) {
        this.PaymentAmount = PaymentAmount;
        return this;
    }

    public String getChargeType() {
        return this.ChargeType;
    }

    public PaymentInformation setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
        return this;
    }
}

