package models.requestModels.Payments;

public class OrderingCustomerAccount {
    private String SchemeName;

    private String Identification;

    public String getSchemeName() {
        return this.SchemeName;
    }

    public OrderingCustomerAccount setSchemeName(String SchemeName) {
        this.SchemeName = SchemeName;
        return this;
    }

    public String getIdentification() {
        return this.Identification;
    }

    public OrderingCustomerAccount setIdentification(String Identification) {
        this.Identification = Identification;
        return this;
    }
}

