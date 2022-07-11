package sr.unasat.foodDelivery.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "address", schema = "food_delivery")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adres_id")
    private int id;
    @Column(name = "straat_naam")
    private String straatNaam;
    @Column(name = "nummer")
    private int nummer;

    @OneToMany( mappedBy = "address")
    @Column
    private Set<Customers> customers;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employees employees;

    @OneToMany(mappedBy = "address")
    private Set<Orders> orders;


    public Address(int id, String straatNaam, int nummer, Set<Customers> customers, Employees employees, Set<Orders> orders) {
        this.id = id;
        this.straatNaam = straatNaam;
        this.nummer = nummer;
        this.customers = customers;
        this.employees = employees;
        this.orders = orders;
    }

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStraatNaam() {
        return straatNaam;
    }

    public void setStraatNaam(String straatNaam) {
        this.straatNaam = straatNaam;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public Set<Customers> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customers> customers) {
        this.customers = customers;
    }

    public Employees getEmployees() {
        return employees;
    }

    public void setEmployees(Employees employees) {
        this.employees = employees;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", straatNaam='" + straatNaam + '\'' +
                ", nummer=" + nummer +
                ", customers=" + customers +
                ", employees=" + employees +
                ", orders=" + orders +
                '}';
    }
}
