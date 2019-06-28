package models.requestModels.Payments.Initiation;

import models.requestModels.Payments.Address;

public class BeneficiaryDetails {
    private String Identification;

    private models.requestModels.Payments.Address Address;

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


