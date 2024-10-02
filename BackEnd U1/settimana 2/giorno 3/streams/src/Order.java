import java.time.LocalDate;
import java.util.List;

public class Order {

    Long id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;
}
