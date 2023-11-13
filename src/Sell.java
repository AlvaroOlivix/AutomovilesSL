public class Sell {
        private String sellDate;
        private String id;
        private String payForm;
        private String sellPrice;
        private Customer customer;
        private Auto auto;

        public String getSellDate() {
            return sellDate;
        }

        public void setSellDate(String sellDate) {
            this.sellDate = sellDate;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getPayForm() {
            return payForm;
        }

        public void setPayForm(String payForm) {
            this.payForm = payForm;
        }

        public String getSellPrice() {
            return sellPrice;
        }

        public void setSellPrice(String sellPrice) {
            this.sellPrice = sellPrice;
        }

        public Customer getCustomer() {
            return customer;
        }

        public void setCustomer(Customer customer) {
            this.customer = customer;
        }

        public Auto getAuto() {
            return auto;
        }

        public void setAuto(Auto auto) {
            this.auto = auto;
        }
    }

