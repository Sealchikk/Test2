package amontov.products;

import javax.persistence.*;

@Entity
@Table(name = "Product")
public class Product {
    public Product() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;
    private String weight;
    private String manufacture;
}
