public class Delivery {
    private final String receiverName;
    private final String city;
    private  final String ContactNumber;
    private  final String address1;
    private final String address2;

    public Delivery(Builder builder) {
        this.receiverName = builder.receiverName;
        this.city=builder.city;
        this.ContactNumber = builder.contactNumber;
        this.address1 = builder.address1;
        this.address2 = builder.address2;
    }

    static class Builder {
        private String receiverName;
        private String city;
        private String contactNumber;
        private String address1;
        private String address2;

        public Builder() {

        }

        public Delivery build(){
            return new Delivery(this);
        }


        public Builder receiverName(String receiverName) {
            this.receiverName = receiverName;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder contactNumber (String contactNumber) {
            this.contactNumber=contactNumber;
            return this;
        }

        public Builder address1(String address1){
            this.address1 = address1;
            return this;
        }

        public Builder address2(String address2){
            this.address2 = address2;
            return this;
        }

    }

    @Override
    public String toString() {
        return "Delivery{" +
                "receiverName='" + receiverName + '\'' +
                ", city='" + city + '\'' +
                ", ContactNumber='" + ContactNumber + '\'' +
                ", address1='" + address1 + '\'' +
                ", address2='" + address2 + '\'' +
                '}';
    }
}
