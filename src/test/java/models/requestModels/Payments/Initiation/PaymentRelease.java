package models.requestModels.Payments.Initiation;

public class PaymentRelease {
    private boolean ReleasePayment;

    public boolean getReleasePayment() {
        return this.ReleasePayment;
    }

    public PaymentRelease setReleasePayment(boolean ReleasePayment) {
        this.ReleasePayment = ReleasePayment;
        return this;
    }
}
