package models.requestModels.Payments.Initiation;

public class InstructedAmount {
    private String Amount;

    private String Currency;

    public String getAmount() {
        return this.Amount;
    }

    public InstructedAmount setAmount(String Amount) {
        this.Amount = Amount;
        return this;
    }

    public String getCurrency() {
        return this.Currency;
    }

    public InstructedAmount setCurrency(String Currency) {
        this.Currency = Currency;
        return this;
    }
}

