public class Application {
    public static void main (String [] args) {

        Delivery.Builder builder = new Delivery.Builder();

        Delivery delivery = builder.receiverName("Raaid Rizvi").city("Colombo").contactNumber("045163246").address1("example road").address2(" unavailable").build();

        System.out.println(delivery);

    }
}
