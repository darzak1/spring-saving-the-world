package pl.edu.wszib.savingtheworld.dto;

import pl.edu.wszib.savingtheworld.dao.Podatnik;

import javax.persistence.*;
import java.util.stream.StreamSupport;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long id;
    double kwota;
    String tytuł;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "podatnik ID", nullable = false)
    Podatnik podatnik;

    public Podatnik getPodatnik() {
        return podatnik;
    }

    public void setPodatnik(Podatnik podatnik) {
        this.podatnik = podatnik;
    }

    public Faktura() {
    }

    public Faktura(double kwota, String tytuł) {
        this.kwota = kwota;
        this.tytuł = tytuł;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getKwota() {
        return kwota;
    }

    public void setKwota(double kwota) {
        this.kwota = kwota;
    }

    public String getTytuł() {
        return tytuł;
    }

    public void setTytuł(String tytuł) {
        this.tytuł = tytuł;
    }
}
