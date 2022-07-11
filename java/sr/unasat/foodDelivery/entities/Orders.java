package sr.unasat.foodDelivery.entities;

import javax.persistence.*;

@Entity
@Table(name = "orders", schema = "food_delivery")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "order_number", unique = true)
    private String orderNumber;
    @Column(name = "gerecht")
    private String gerecht;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "adres_id")
    private Address address;

    public Orders(int id, String name, String orderNumber, String gerecht, Address address) {
        this.id = id;
        this.name = name;
        this.orderNumber = orderNumber;
        this.gerecht = gerecht;
        this.address = address;
    }

    public Orders() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getGerecht() {
        return gerecht;
    }

    public void setGerecht(String gerecht) {
        this.gerecht = gerecht;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", gerecht='" + gerecht + '\'' +
                ", address=" + address +
                '}';
    }
}