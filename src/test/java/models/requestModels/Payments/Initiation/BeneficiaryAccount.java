package models.requestModels.Payments.Initiation;

public class BeneficiaryAccount {
    private String SchemeName;

    private String Identification;

    public String getSchemeName() {
        return this.SchemeName;
    }

    public BeneficiaryAccount setSchemeName(String SchemeName) {
        this.SchemeName = SchemeName;
        return this;
    }

    public String getIdentification() {
        return this.Identification;
    }

    public BeneficiaryAccount setIdentification(String Identification) {
        this.Identification = Identification;
        return this;
    }
}

