package sr.unasat.foodDelivery.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "customers", schema = "food_delivery")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int customerId;
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "achternaam")
    private String achternaam;
    @Column(name = "telefoon_nummer", unique = true)
    private String telefoonNummer;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "adres_id")
    private Address address;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "customer_account",
    joinColumns = {@JoinColumn(name = "customer_id")},
    inverseJoinColumns = {@JoinColumn(name = "acc_id")})
    private Set<Account> account;


    public Customers(int customerId, String voornaam, String achternaam, String telefoonNummer) {
        this.customerId = customerId;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoonNummer = telefoonNummer;
    }

    public Customers() {

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setTelefoonNummer(String telefoonNummer) {
        this.telefoonNummer = telefoonNummer;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<Account> getAccount() {
        return account;
    }

    public void setAccount(Set<Account> account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customerId=" + customerId +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", telefoonNummer='" + telefoonNummer + '\'' +
                '}';
    }
}
