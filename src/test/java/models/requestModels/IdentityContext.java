package models.requestModels;

public class IdentityContext {
    private String originatorId;

    public String getOriginatorId() {
        return this.originatorId;
    }

    public IdentityContext setOriginatorId(String originatorId) {
        this.originatorId = originatorId;
        return this;
    }

}
