package models.responseModels;

import java.util.List;

public class CustomerModel {

    public class Addresses {
        private String addressType;

        private String addressLine1;

        private String addressLine2;

        private String suburb;

        private String city;

        private String country;

        private String postCode;

        public void setAddressType(String addressType) {
            this.addressType = addressType;
        }

        public String getAddressType() {
            return this.addressType;
        }

        public void setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
        }

        public String getAddressLine1() {
            return this.addressLine1;
        }

        public void setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
        }

        public String getAddressLine2() {
            return this.addressLine2;
        }

        public void setSuburb(String suburb) {
            this.suburb = suburb;
        }

        public String getSuburb() {
            return this.suburb;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity() {
            return this.city;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return this.country;
        }

        public void setPostCode(String postCode) {
            this.postCode = postCode;
        }

        public String getPostCode() {
            return this.postCode;
        }
    }

    public class Customer {
        private String customerId;

        private String legalName;

        private String email;

        private String bankEntity;

        private String category;

        private boolean customerDueDiligenceComplete;

        private boolean aeoiCompliant;

        private List<Addresses> addresses;

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public String getCustomerId() {
            return this.customerId;
        }

        public void setLegalName(String legalName) {
            this.legalName = legalName;
        }

        public String getLegalName() {
            return this.legalName;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getEmail() {
            return this.email;
        }

        public void setBankEntity(String bankEntity) {
            this.bankEntity = bankEntity;
        }

        public String getBankEntity() {
            return this.bankEntity;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getCategory() {
            return this.category;
        }

        public void setCustomerDueDiligenceComplete(boolean customerDueDiligenceComplete) {
            this.customerDueDiligenceComplete = customerDueDiligenceComplete;
        }

        public boolean getCustomerDueDiligenceComplete() {
            return this.customerDueDiligenceComplete;
        }

        public void setAeoiCompliant(boolean aeoiCompliant) {
            this.aeoiCompliant = aeoiCompliant;
        }

        public boolean getAeoiCompliant() {
            return this.aeoiCompliant;
        }

        public void setAddresses(List<Addresses> addresses) {
            this.addresses = addresses;
        }

        public List<Addresses> getAddresses() {
            return this.addresses;
        }
    }

    public class _links {
        private String Self;

        private String Accounts;

        public void setSelf(String Self) {
            this.Self = Self;
        }

        public String getSelf() {
            return this.Self;
        }

        public void setAccounts(String Accounts) {
            this.Accounts = Accounts;
        }

        public String getAccounts() {
            return this.Accounts;
        }
    }

//    public class Root {
//        private Customer customer;
//
//        private _links _links;
//
//        public void setCustomer(Customer customer) {
//            this.customer = customer;
//        }
//
//        public Customer getCustomer() {
//            return this.customer;
//        }
//
//        public void set_links(_links _links) {
//            this._links = _links;
//        }
//
//        public _links get_links() {
//            return this._links;
//        }
//    }
}
