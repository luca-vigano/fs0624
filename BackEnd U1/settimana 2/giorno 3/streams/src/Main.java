import jdk.jfr.Category;

import java.time.LocalDate;
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

        Product p1 = new Product(111,"Ciuccio", "Baby", 2000.00);
        Product p2 = new Product(222,"Pannolini", "Baby", 1800.00);
        Product p3 = new Product(333,"Culla", "Baby", 1500.00);
        Product p4 = new Product(444,"Topolino vol1", "Books", 2.00);
        Product p5 = new Product(555,"Scuola di cucina", "Books", 100.10);
        Product p6 = new Product(666,"Enciclopedia", "Books", 223.50);
        Product p7 = new Product(777,"Scarpe", "Boys", 700.00);
        Product p8 = new Product(888,"Felpa", "Boys", 1000.00);
        Product p9 = new Product(999,"T-shirt", "Boys", 1450.00);
        Product p10 = new Product(010,"Cappello", "Boys", 200.00);


        List<Product> order1 = new ArrayList<>();
        order1.add(p3);
        order1.add(p5);
        order1.add(p7);

        List<Product> order2 = new ArrayList<>();
        order2.add(p1);
        order2.add(p4);
        order2.add(p8);

        List<Product> order3 = new ArrayList<>();
        order3.add(p3);
        order3.add(p5);
        order3.add(p9);

        List<Product> order4 = new ArrayList<>();
        order4.add(p2);
        order4.add(p6);
        order4.add(p10);



        Order o1 = new Order(167323,"Close", LocalDate.now().minusMonths(1),LocalDate.now().minusDays(13),order1,c10);
        Order o2 = new Order(53764,"Close", LocalDate.now().minusMonths(2),LocalDate.now().minusDays(8),order2,c1);
        Order o3 = new Order(67673,"Close", LocalDate.now().minusMonths(2),LocalDate.now().minusDays(20),order3,c9);
        Order o4 = new Order(12632,"Close", LocalDate.now().minusMonths(3),LocalDate.now().minusMonths(1),order4,c5);
        Order o5 = new Order(38672,"Close", LocalDate.now().minusMonths(4),LocalDate.now().minusMonths(2),order3,c7);
        Order o6 = new Order(3752,"Close", LocalDate.now().minusMonths(5),LocalDate.now().minusMonths(3),order2,c8);
        Order o7 = new Order(3222,"Close", LocalDate.now().minusMonths(2),LocalDate.now().minusDays(1),order1,c2);

        List <Order> allOrder = new ArrayList<>();
        allOrder.add(o1);
        allOrder.add(o2);
        allOrder.add(o3);
        allOrder.add(o4);
        allOrder.add(o5);
        allOrder.add(o6);
        allOrder.add(o7);

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

        // ----------------------------------- ES1--------------------------------------------

        List<Product> booksOver100 =allProduct.stream().filter(product -> product.getCategory().equals("Books") && product.getPrice() > 100).toList();

        // ----------------------------------- ES2--------------------------------------------

        List<Order> allBabyOrder = allOrder.stream()
                .filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby")))
                .toList();

        // ----------------------------------- ES3--------------------------------------------

        List<Product> discount2 = allProduct.stream()
                .filter(product -> product.getCategory().equals("Boys"))
                .map(product -> new Product(product.getId(), product.getName(), product.getCategory(), product.getPrice() * 0.9))
                .toList();


        // ----------------------------------- ES4--------------------------------------------

        LocalDate startDate = LocalDate.of(2024, 8, 1);
        LocalDate endDate = LocalDate.of(2024, 8, 31);

        List<Product> orderTier2 = allOrder.stream()
                .filter(order -> order.getCustomer().getTier() == 2)
                .filter(order -> !order.getOrderDate().isBefore(startDate) && !order.getOrderDate().isAfter(endDate))
                .flatMap(order -> order.getProducts().stream())// metodo di conversione che non ho capito trovato su internet
                .toList();

        System.out.println(orderTier2);
    }




}