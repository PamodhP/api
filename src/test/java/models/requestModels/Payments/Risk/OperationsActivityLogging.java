package models.requestModels.Payments.Risk;

public class OperationsActivityLogging {
    private String PageUrl;

    private String LoginIpAddress;

    private String ServerIpAddress;

    private String KiwibankSessionId;

    private String InternationalSessionId;

    private models.requestModels.Payments.Risk.OrderingCustomerAccountAvailableBalance OrderingCustomerAccountAvailableBalance;

    public String getPageUrl() {
        return this.PageUrl;
    }

    public OperationsActivityLogging setPageUrl(String PageUrl) {
        this.PageUrl = PageUrl;
        return this;
    }

    public String getLoginIpAddress() {
        return this.LoginIpAddress;
    }

    public OperationsActivityLogging setLoginIpAddress(String LoginIpAddress) {
        this.LoginIpAddress = LoginIpAddress;
        return this;
    }

    public String getServerIpAddress() {
        return this.ServerIpAddress;
    }

    public OperationsActivityLogging setServerIpAddress(String ServerIpAddress) {
        this.ServerIpAddress = ServerIpAddress;
        return this;
    }

    public String getKiwibankSessionId() {
        return this.KiwibankSessionId;
    }

    public OperationsActivityLogging setKiwibankSessionId(String KiwibankSessionId) {
        this.KiwibankSessionId = KiwibankSessionId;
        return this;
    }

    public String getInternationalSessionId() {
        return this.InternationalSessionId;
    }

    public OperationsActivityLogging setInternationalSessionId(String InternationalSessionId) {
        this.InternationalSessionId = InternationalSessionId;
        return this;
    }

    public OrderingCustomerAccountAvailableBalance getOrderingCustomerAccountAvailableBalance() {
        return this.OrderingCustomerAccountAvailableBalance;
    }

    public OperationsActivityLogging setOrderingCustomerAccountAvailableBalance(OrderingCustomerAccountAvailableBalance OrderingCustomerAccountAvailableBalance) {
        this.OrderingCustomerAccountAvailableBalance = OrderingCustomerAccountAvailableBalance;
        return this;
    }
}

