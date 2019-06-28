
package models.responseModels.PaymentSubmission;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PaymentResponse {

    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("_links")
    @Expose
    private List<Link> links = null;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}
