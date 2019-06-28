package models.requestModels.Payments.Initiation;

public class OrderingCustomerFee {
    private String Amount;

    private String Currency;

    public String getAmount() {
        return this.Amount;
    }

    public OrderingCustomerFee setAmount(String Amount) {
        this.Amount = Amount;
        return this;
    }

    public String getCurrency() {
        return this.Currency;
    }

    public OrderingCustomerFee setCurrency(String Currency) {
        this.Currency = Currency;
        return this;
    }
}
