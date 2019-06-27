package models.requestModels.Payments;

public class OrderingCustomerAccountAvailableBalance {
    private String Amount;

    private String Currency;

    public String getAmount() {
        return this.Amount;
    }

    public OrderingCustomerAccountAvailableBalance setAmount(String Amount) {
        this.Amount = Amount;
        return this;
    }

    public String getCurrency() {
        return this.Currency;
    }

    public OrderingCustomerAccountAvailableBalance setCurrency(String Currency) {
        this.Currency = Currency;
        return this;
    }
}
