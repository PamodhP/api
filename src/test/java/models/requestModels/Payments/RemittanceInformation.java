package models.requestModels.Payments;

public class RemittanceInformation {
    private Reference Reference;

    public Reference getReference() {
        return this.Reference;
    }

    public RemittanceInformation setReference(Reference Reference) {
        this.Reference = Reference;
        return this;
    }
}
