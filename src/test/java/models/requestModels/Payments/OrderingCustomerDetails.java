package models.requestModels.Payments;

public class OrderingCustomerDetails {
    private String Identification;

    private String Classification;

    private String Name;

    private Address Address;

    public String getIdentification() {
        return this.Identification;
    }

    public OrderingCustomerDetails setIdentification(String Identification) {
        this.Identification = Identification;
        return this;
    }

    public String getClassification() {
        return this.Classification;
    }

    public OrderingCustomerDetails setClassification(String Classification) {
        this.Classification = Classification;
        return this;
    }

    public String getName() {
        return this.Name;
    }

    public OrderingCustomerDetails setName(String Name) {
        this.Name = Name;
        return this;
    }

    public Address getAddress() {
        return this.Address;
    }

    public OrderingCustomerDetails setAddress(Address Address) {
        this.Address = Address;
        return this;
    }
}

