package models.requestModels.Payments;

public class PaymentAmount {
    private String Amount;

    private String Currency;

    public String getAmount() {
        return this.Amount;
    }

    public PaymentAmount setAmount(String Amount) {
        this.Amount = Amount;
        return this;
    }

    public String getCurrency() {
        return this.Currency;
    }

    public PaymentAmount setCurrency(String Currency) {
        this.Currency = Currency;
        return this;
    }
}

