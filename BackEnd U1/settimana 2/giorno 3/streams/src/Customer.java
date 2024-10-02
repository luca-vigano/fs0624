import java.time.LocalDate;
import java.util.List;

public class Customer {

    long id;
    String name;
    Integer tier;

    public Customer(long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }
}
