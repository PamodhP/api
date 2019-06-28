package models.requestModels.Payments.Initiation;

import models.requestModels.Payments.Reference;

public class RemittanceInformation {
    private models.requestModels.Payments.Reference Reference;

    public Reference getReference() {
        return this.Reference;
    }

    public RemittanceInformation setReference(Reference Reference) {
        this.Reference = Reference;
        return this;
    }
}
