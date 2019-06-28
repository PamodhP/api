package models.requestModels.Payments;

public class DomesticOrderingCustomerReference {
    private String ForeignExchangeDealRate;

    public String getForeignExchangeDealRate() {
        return this.ForeignExchangeDealRate;
    }

    public DomesticOrderingCustomerReference setForeignExchangeDealRate(String ForeignExchangeDealRate) {
        this.ForeignExchangeDealRate = ForeignExchangeDealRate;
        return this;
    }
}
