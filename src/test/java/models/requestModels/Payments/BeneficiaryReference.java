package models.requestModels.Payments;

public class BeneficiaryReference {
    private String PaymentDetailsLine1;

    private String PaymentDetailsLine2;

    private String PaymentDetailsLine3;

    private String PaymentDetailsLine4;

    public String getPaymentDetailsLine1() {
        return this.PaymentDetailsLine1;
    }

    public BeneficiaryReference setPaymentDetailsLine1(String PaymentDetailsLine1) {
        this.PaymentDetailsLine1 = PaymentDetailsLine1;
        return this;
    }

    public String getPaymentDetailsLine2() {
        return this.PaymentDetailsLine2;
    }

    public BeneficiaryReference setPaymentDetailsLine2(String PaymentDetailsLine2) {
        this.PaymentDetailsLine2 = PaymentDetailsLine2;
        return this;
    }

    public String getPaymentDetailsLine3() {
        return this.PaymentDetailsLine3;
    }

    public BeneficiaryReference setPaymentDetailsLine3(String PaymentDetailsLine3) {
        this.PaymentDetailsLine3 = PaymentDetailsLine3;
        return this;
    }

    public String getPaymentDetailsLine4() {
        return this.PaymentDetailsLine4;
    }

    public BeneficiaryReference setPaymentDetailsLine4(String PaymentDetailsLine4) {
        this.PaymentDetailsLine4 = PaymentDetailsLine4;
        return this;
    }
}

