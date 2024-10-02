import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {



        Customer c1 =new Customer(1, "Mario",3);
        Customer c2 =new Customer(2, "Gianni",2);
        Customer c3 =new Customer(3, "Luca",4);
        Customer c4 =new Customer(4, "Andrea",4);
        Customer c5 =new Customer(5, "Stefano",3);
        Customer c6 =new Customer(6, "Massimo",5);
        Customer c7 =new Customer(7, "Anna",1);
        Customer c8 =new Customer(8, "Alessia",1);
        Customer c9 =new Customer(9, "Martina",2);
        Customer c10 =new Customer(10, "Giulia",5);

        Product p1 = new Product(111,"Rtx4090", "Pc", 2000.00);
        Product p2 = new Product(222,"Rtx4080", "Pc", 1800.00);
        Product p3 = new Product(333,"Rtx4070", "Pc", 1500.00);
        Product p4 = new Product(444,"Topolino vol1", "Books", 2.00);
        Product p5 = new Product(555,"Scuola di cucina", "Books", 100.10);
        Product p6 = new Product(666,"Enciclopedia", "Books", 223.50);
        Product p7 = new Product(777,"Iphone 14", "Phone", 700.00);
        Product p8 = new Product(888,"Iphone 15", "Phone", 1000.00);
        Product p9 = new Product(999,"Iphone 16", "Phone", 1450.00);
        Product p10 = new Product(010,"Airpods", "Music", 200.00);

        List<Customer> allCustomers = new ArrayList<>();
        allCustomers.add(c1);
        allCustomers.add(c2);
        allCustomers.add(c3);
        allCustomers.add(c4);
        allCustomers.add(c5);
        allCustomers.add(c6);
        allCustomers.add(c7);
        allCustomers.add(c8);
        allCustomers.add(c9);
        allCustomers.add(c10);

        List<Product> allProduct = new ArrayList<>();
        allProduct.add(p1);
        allProduct.add(p2);
        allProduct.add(p3);
        allProduct.add(p4);
        allProduct.add(p5);
        allProduct.add(p6);
        allProduct.add(p7);
        allProduct.add(p8);
        allProduct.add(p9);
        allProduct.add(p10);


        List<Product> booksOver100 =allProduct.stream().filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100).toList();
        System.out.print(booksOver100);


    }




}