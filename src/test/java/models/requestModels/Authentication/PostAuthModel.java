package models.requestModels.Authentication;

import java.util.List;

public class PostAuthModel {

    private String client_id;

    private String client_secret;

    private String grant_type;

    private List<String> scopes;

    private String id="ppanag01";

    private boolean delegated;

    private String identityContextType;

    private String originatorId;

    private IdentityContext identityContext;


    public String getClient_id() {
        return this.client_id;
    }

    public PostAuthModel setClient_id(String client_id) {
        this.client_id = client_id;
        return this;
    }

    public String getClient_secret() {
        return this.client_secret;
    }

    public PostAuthModel setClient_secret(String client_secret) {
        this.client_secret = client_secret;
        return this;
    }

    public String getGrant_type() {
        return this.grant_type;
    }

    public PostAuthModel setGrant_type(String grant_type) {
        this.grant_type = grant_type;
        return this;
    }

    public List<String> getScopes() {
        return this.scopes;
    }

    public PostAuthModel setScopes(List<String> scopes) {
        this.scopes = scopes;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public PostAuthModel setId(String id) {
        this.id = id;
        return this;
    }

    public boolean getDelegated() {
        return this.delegated;
    }

    public PostAuthModel setDelegated(boolean delegated) {
        this.delegated = delegated;
        return this;
    }

    public String getIdentityContextType() {
        return this.identityContextType;
    }

    public PostAuthModel setIdentityContextType(String identityContextType) {
        this.identityContextType = identityContextType;
        return this;
    }

    public IdentityContext getIdentityContext() {
        return this.identityContext;
    }

    public PostAuthModel setIdentityContext(IdentityContext identityContext) {
        this.identityContext = identityContext;
        return this;
    }

}
