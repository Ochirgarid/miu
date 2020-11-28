package prob2B;

class Main {
    public static void main(String[] args) {
        Order myOrder = new Order(2);
        myOrder.orderNewLine("item 1");
        myOrder.orderNewLine("item 2");
        myOrder.orderNewLine("item 3");
        
        myOrder.printAllOrderLines();
        myOrder.printTotalOrderLines();
        
        for(OrderLine o: myOrder.getOrderLines()) {
        	o.printOrderInfo();
        }
        
    }
}
