package models.requestModels.Payments;

import models.requestModels.Payments.Risk.Risk;

public class PaymentRequest {
    private Data Data;

    private models.requestModels.Payments.Risk.Risk Risk;

    public Data getData() {
        return this.Data;
    }

    public PaymentRequest setData(Data Data) {
        this.Data = Data;
        return this;
    }

    public Risk getRisk() {
        return this.Risk;
    }

    public PaymentRequest setRisk(Risk Risk) {
        this.Risk = Risk;
        return this;
    }
}

