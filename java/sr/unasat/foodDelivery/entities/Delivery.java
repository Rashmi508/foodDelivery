package sr.unasat.foodDelivery.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "delivery", schema = "food_delivery")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "delivery_id")
    private int id;
    @Column(name = "datum")
    private LocalDate datum;
    @Column(name = "delivery_nummer")
    private int deliveryNummer;

    public Delivery(int id, LocalDate datum, int deliveryNummer) {
        this.id = id;
        this.datum = datum;
        this.deliveryNummer = deliveryNummer;
    }

    public Delivery() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public int getDeliveryNummer() {
        return deliveryNummer;
    }

    public void setDeliveryNummer(int deliveryNummer) {
        this.deliveryNummer = deliveryNummer;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "id=" + id +
                ", datum=" + datum +
                ", deliveryNummer=" + deliveryNummer +
                '}';
    }
}
