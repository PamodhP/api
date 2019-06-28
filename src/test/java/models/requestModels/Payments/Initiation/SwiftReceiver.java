package models.requestModels.Payments.Initiation;

public class SwiftReceiver {
    private String SwiftCode;

    public String getSwiftCode() {
        return this.SwiftCode;
    }

    public SwiftReceiver setSwiftCode(String SwiftCode) {
        this.SwiftCode = SwiftCode;
        return this;
    }
}

