package models.requestModels.Payments;

public class BeneficiaryDetails {
    private String Identification;

    private Address Address;

    public String getIdentification() {
        return this.Identification;
    }

    public BeneficiaryDetails setIdentification(String Identification) {
        this.Identification = Identification;
        return this;
    }

    public Address getAddress() {
        return this.Address;
    }

    public BeneficiaryDetails setAddress(Address Address) {
        this.Address = Address;
        return this;
    }
}


