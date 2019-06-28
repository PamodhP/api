package models.responseModels;

public class PostPaymentModel {

    public class SettlementStep {
        private String name;

        private String status;

        private String statusMessage;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getStatusMessage() {
            return this.statusMessage;
        }

        public void setStatusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
        }
    }

    public class Data {
        private String paymentId;

        private String status;

        private SettlementStep settlementStep;

        private String creationDateTime;

        public String getPaymentId() {
            return this.paymentId;
        }

        public void setPaymentId(String paymentId) {
            this.paymentId = paymentId;
        }

        public String getStatus() {
            return this.status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public SettlementStep getSettlementStep() {
            return this.settlementStep;
        }

        public void setSettlementStep(SettlementStep settlementStep) {
            this.settlementStep = settlementStep;
        }

        public String getCreationDateTime() {
            return this.creationDateTime;
        }

        public void setCreationDateTime(String creationDateTime) {
            this.creationDateTime = creationDateTime;
        }
    }

    public class _links {
        private String rel;

        private String href;

        public String getRel() {
            return this.rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        public String getHref() {
            return this.href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }

}
