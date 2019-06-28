package models.requestModels.Payments;

public class Address {
    private String AddressLine1;

    private String AddressLine2;

    private String Suburb;

    private String City;

    private String State;

    private String PostalCode;

    private String CountryName;

    private String CountryCode;

    public String getAddressLine1() {
        return this.AddressLine1;
    }

    public Address setAddressLine1(String AddressLine1) {
        this.AddressLine1 = AddressLine1;
        return this;
    }

    public String getAddressLine2() {
        return this.AddressLine2;
    }

    public Address setAddressLine2(String AddressLine2) {
        this.AddressLine2 = AddressLine2;
        return this;
    }

    public String getSuburb() {
        return this.Suburb;
    }

    public Address setSuburb(String Suburb) {
        this.Suburb = Suburb;
        return this;
    }

    public String getCity() {
        return this.City;
    }

    public Address setCity(String City) {
        this.City = City;
        return this;
    }

    public String getState() {
        return this.State;
    }

    public Address setState(String State) {
        this.State = State;
        return this;
    }

    public String getPostalCode() {
        return this.PostalCode;
    }

    public Address setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
        return this;
    }

    public String getCountryName() {
        return this.CountryName;
    }

    public Address setCountryName(String CountryName) {
        this.CountryName = CountryName;
        return this;
    }

    public String getCountryCode() {
        return this.CountryCode;
    }

    public Address setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
        return this;
    }
}

