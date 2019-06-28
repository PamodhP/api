package models.requestModels.Payments.Risk;

public class Risk {
    private models.requestModels.Payments.Risk.OperationsActivityLogging OperationsActivityLogging;

    public OperationsActivityLogging getOperationsActivityLogging() {
        return this.OperationsActivityLogging;
    }

    public Risk setOperationsActivityLogging(OperationsActivityLogging OperationsActivityLogging) {
        this.OperationsActivityLogging = OperationsActivityLogging;
        return this;
    }
}

