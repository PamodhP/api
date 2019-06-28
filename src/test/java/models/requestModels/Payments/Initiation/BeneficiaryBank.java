package models.requestModels.Payments.Initiation;

import models.requestModels.Payments.Address;

public class BeneficiaryBank {
    private String SchemeName;

    private String Identification;

    private String SecondarySchemeName;

    private String SecondaryIdentification;

    private String Name;

    private models.requestModels.Payments.Address Address;

    public String getSchemeName() {
        return this.SchemeName;
    }

    public BeneficiaryBank setSchemeName(String SchemeName) {
        this.SchemeName = SchemeName;
        return this;
    }

    public String getIdentification() {
        return this.Identification;
    }

    public BeneficiaryBank setIdentification(String Identification) {
        this.Identification = Identification;
        return this;
    }

    public String getSecondarySchemeName() {
        return this.SecondarySchemeName;
    }

    public BeneficiaryBank setSecondarySchemeName(String SecondarySchemeName) {
        this.SecondarySchemeName = SecondarySchemeName;
        return this;
    }

    public String getSecondaryIdentification() {
        return this.SecondaryIdentification;
    }

    public BeneficiaryBank setSecondaryIdentification(String SecondaryIdentification) {
        this.SecondaryIdentification = SecondaryIdentification;
        return this;
    }

    public String getName() {
        return this.Name;
    }

    public BeneficiaryBank setName(String Name) {
        this.Name = Name;
        return this;
    }

    public Address getAddress() {
        return this.Address;
    }

    public BeneficiaryBank setAddress(Address Address) {
        this.Address = Address;
        return this;
    }
}

