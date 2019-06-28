package models.requestModels.Payments;

import models.requestModels.Payments.Initiation.Initiation;

public class Data {
    private models.requestModels.Payments.Initiation.Initiation Initiation;

    public Initiation getInitiation() {
        return this.Initiation;
    }

    public Data setInitiation(Initiation Initiation) {
        this.Initiation = Initiation;
        return this;
    }
}
