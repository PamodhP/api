
package models.responseModels.Customer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Customer {

    @SerializedName("customer")
    @Expose
    private Customer_ customer;
    @SerializedName("_links")
    @Expose
    private Links links;

    public Customer_ getCustomer() {
        return customer;
    }

    public void setCustomer(Customer_ customer) {
        this.customer = customer;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
