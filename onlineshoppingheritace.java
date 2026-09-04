// Create an Online Shopping System using Inheritance.
// Parent Class: Product
// Members:
// Product ID
// Product Name
// Price
// Child Class: Electronics

// Additional Member:
// Warranty Period
// Use inheritance to avoid code duplication and display all product details.

class Product
{
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price)
    {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct()
    {
        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }
}
class electronics extends Product{

    electronics(int productId, String productName, double price) {
        super(productId, productName, price);
     
    }

}

public class onlineshoppingheritace {
    
}
