package models.requestModels.Payments.Initiation;

public class Initiation {
    private String InstructionIdentification;

    private String EndToEndIdentification;

    private models.requestModels.Payments.Initiation.InstructedAmount InstructedAmount;

    private models.requestModels.Payments.Initiation.OrderingCustomerFee OrderingCustomerFee;

    private models.requestModels.Payments.Initiation.PaymentRelease PaymentRelease;

    private models.requestModels.Payments.Initiation.PaymentInformation PaymentInformation;

    private models.requestModels.Payments.Initiation.BeneficiaryDetails BeneficiaryDetails;

    private OrderingCustomerAccount OrderingCustomerAccount;

    private BeneficiaryBank BeneficiaryBank;

    private SwiftReceiver SwiftReceiver;

    private OrderingCustomerDetails OrderingCustomerDetails;

    private BeneficiaryAccount BeneficiaryAccount;

    private RemittanceInformation RemittanceInformation;

    public String getInstructionIdentification() {
        return this.InstructionIdentification;
    }

    public Initiation setInstructionIdentification(String InstructionIdentification) {
        this.InstructionIdentification = InstructionIdentification;
        return this;
    }

    public String getEndToEndIdentification() {
        return this.EndToEndIdentification;
    }

    public Initiation setEndToEndIdentification(String EndToEndIdentification) {
        this.EndToEndIdentification = EndToEndIdentification;
        return this;
    }

    public InstructedAmount getInstructedAmount() {
        return this.InstructedAmount;
    }

    public Initiation setInstructedAmount(InstructedAmount InstructedAmount) {
        this.InstructedAmount = InstructedAmount;
        return this;
    }

    public OrderingCustomerFee getOrderingCustomerFee() {
        return this.OrderingCustomerFee;
    }

    public Initiation setOrderingCustomerFee(OrderingCustomerFee OrderingCustomerFee) {
        this.OrderingCustomerFee = OrderingCustomerFee;
        return this;
    }

    public PaymentRelease getPaymentRelease() {
        return this.PaymentRelease;
    }

    public Initiation setPaymentRelease(PaymentRelease PaymentRelease) {
        this.PaymentRelease = PaymentRelease;
        return this;
    }

    public PaymentInformation getPaymentInformation() {
        return this.PaymentInformation;
    }

    public Initiation setPaymentInformation(PaymentInformation PaymentInformation) {
        this.PaymentInformation = PaymentInformation;
        return this;
    }

    public BeneficiaryDetails getBeneficiaryDetails() {
        return this.BeneficiaryDetails;
    }

    public Initiation setBeneficiaryDetails(BeneficiaryDetails BeneficiaryDetails) {
        this.BeneficiaryDetails = BeneficiaryDetails;
        return this;
    }

    public OrderingCustomerAccount getOrderingCustomerAccount() {
        return this.OrderingCustomerAccount;
    }

    public Initiation setOrderingCustomerAccount(OrderingCustomerAccount OrderingCustomerAccount) {
        this.OrderingCustomerAccount = OrderingCustomerAccount;
        return this;
    }

    public BeneficiaryBank getBeneficiaryBank() {
        return this.BeneficiaryBank;
    }

    public Initiation setBeneficiaryBank(BeneficiaryBank BeneficiaryBank) {
        this.BeneficiaryBank = BeneficiaryBank;
        return this;
    }

    public SwiftReceiver getSwiftReceiver() {
        return this.SwiftReceiver;
    }

    public Initiation setSwiftReceiver(SwiftReceiver SwiftReceiver) {
        this.SwiftReceiver = SwiftReceiver;
        return this;
    }

    public OrderingCustomerDetails getOrderingCustomerDetails() {
        return this.OrderingCustomerDetails;
    }

    public Initiation setOrderingCustomerDetails(OrderingCustomerDetails OrderingCustomerDetails) {
        this.OrderingCustomerDetails = OrderingCustomerDetails;
        return this;
    }

    public BeneficiaryAccount getBeneficiaryAccount() {
        return this.BeneficiaryAccount;
    }

    public Initiation setBeneficiaryAccount(BeneficiaryAccount BeneficiaryAccount) {
        this.BeneficiaryAccount = BeneficiaryAccount;
        return this;
    }

    public RemittanceInformation getRemittanceInformation() {
        return this.RemittanceInformation;
    }

    public Initiation setRemittanceInformation(RemittanceInformation RemittanceInformation) {
        this.RemittanceInformation = RemittanceInformation;
        return this;
    }

}

