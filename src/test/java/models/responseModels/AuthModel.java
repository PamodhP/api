package models.responseModels;

public class AuthModel
{
    private String access_token;

    private int iat;

    private int expires_in;

    private String id_token;

    public void setAccess_token(String access_token){
        this.access_token = access_token;
    }
    public String getAccess_token(){
        return this.access_token;
    }
    public void setIat(int iat){
        this.iat = iat;
    }
    public int getIat(){
        return this.iat;
    }
    public void setExpires_in(int expires_in){
        this.expires_in = expires_in;
    }
    public int getExpires_in(){
        return this.expires_in;
    }
    public void setId_token(String id_token){
        this.id_token = id_token;
    }
    public String getId_token(){
        return this.id_token;
    }
}
