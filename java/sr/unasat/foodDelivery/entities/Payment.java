package sr.unasat.foodDelivery.entities;

import javax.persistence.*;

@Entity
@Table(name = "payment", schema = "food_delivery")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "betalings_id")
    private int id;
    @Column(name = "prijs")
    private double prijs;
    @Column(name = "betalings_methode")
    private String betalingsMethode;

    public Payment(int id, double prijs, String betalingsMethode) {
        this.id = id;
        this.prijs = prijs;
        this.betalingsMethode = betalingsMethode;
    }

    public Payment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public String getBetalingsMethode() {
        return betalingsMethode;
    }

    public void setBetalingsMethode(String betalingsMethode) {
        this.betalingsMethode = betalingsMethode;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", prijs=" + prijs +
                ", betalingsMethode='" + betalingsMethode + '\'' +
                '}';
    }
}
