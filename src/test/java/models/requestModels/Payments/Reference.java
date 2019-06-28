package models.requestModels.Payments;

public class Reference {
    private BeneficiaryReference BeneficiaryReference;

    private DomesticOrderingCustomerReference DomesticOrderingCustomerReference;

    public BeneficiaryReference getBeneficiaryReference() {
        return this.BeneficiaryReference;
    }

    public Reference setBeneficiaryReference(BeneficiaryReference BeneficiaryReference) {
        this.BeneficiaryReference = BeneficiaryReference;
        return this;
    }

    public DomesticOrderingCustomerReference getDomesticOrderingCustomerReference() {
        return this.DomesticOrderingCustomerReference;
    }

    public Reference setDomesticOrderingCustomerReference(DomesticOrderingCustomerReference DomesticOrderingCustomerReference) {
        this.DomesticOrderingCustomerReference = DomesticOrderingCustomerReference;
        return this;
    }
}
