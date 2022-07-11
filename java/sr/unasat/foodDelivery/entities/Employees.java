package sr.unasat.foodDelivery.entities;

import javax.persistence.*;
import java.lang.reflect.AnnotatedArrayType;

@Entity
@Table(name = "employees", schema = "food_delivery")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    @Column(name = "voornaam")
    private String voornaam;
    @Column(name = "achternaam")
    private String achternaam;
    @Column(name = "salaris")
    private String salaris;
    @Column(name = "id_kaart", unique = true)
    private String idKaart;

    @OneToOne(mappedBy = "employees")
    @JoinColumn(name = "adres_id")
    private Address address;

    public Employees(int id, String voornaam, String achternaam, String salaris, String idKaart) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.salaris = salaris;
        this.idKaart = idKaart;
    }

    public Employees() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getSalaris() {
        return salaris;
    }

    public void setSalaris(String salaris) {
        this.salaris = salaris;
    }

    public String getIdKaart() {
        return idKaart;
    }

    public void setIdKaart(String idKaart) {
        this.idKaart = idKaart;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", salaris='" + salaris + '\'' +
                ", idKaart='" + idKaart + '\'' +
                '}';
    }
}
