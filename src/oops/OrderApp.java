package oops;

public class OrderApp {
    public static void main(String[] args) {

        Order order = new Order(101, 100, 5, "mug");
        System.out.println("total amount : " + order.calculateTotalAmount());

    }
}

     class Order{

        int orderId;
        int price;
        int quantity;
        String productName;

        public Order(int orderId,int price, int quantity, String productName)
        {
            this.orderId = orderId;
            this.price=price;
            this.quantity =quantity;
            this.productName=productName;
        }

        public int calculateTotalAmount()
        {
            return quantity * price;
        }
   }
