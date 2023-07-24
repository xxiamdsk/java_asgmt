import java.io.Console;

class Q3{
    public static void main(String args[]){
    Console c = System.console();
    String OID = c.readLine("Enter Order ID:");        
    String Product = c.readLine("Enter Product Name:");        
    String Qty = c.readLine("Enter Quantity:");        

    System.out.println("Order ID:"+OID);
    System.out.println("Product Name :"+Product);
    System.out.println("Quantity:"+Qty);
    }
}