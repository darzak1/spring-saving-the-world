package pl.edu.wszib.savingtheworld.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.stream.StreamSupport;

@Entity
@Table
public class Faktura {

    @Id
    @GeneratedValue
    Long id;
    double kwota;
    String tytuł;

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
