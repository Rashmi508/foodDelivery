package sr.unasat.foodDelivery.entities;

import javax.persistence.*;

@Entity
@Table(name = "menu", schema = "food_delivery")
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private int id;
    @Column(name = "gerecht")
    private String gerecht;
    @Column(name = "prijs")
    private double prijs;

    public Menu(int id, String gerecht, double prijs) {
        this.id = id;
        this.gerecht = gerecht;
        this.prijs = prijs;
    }
    public Menu() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGerecht() {
        return gerecht;
    }

    public void setGerecht(String gerecht) {
        this.gerecht = gerecht;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", gerecht='" + gerecht + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}
