package pl.edu.wszib.savingtheworld.dao;


import pl.edu.wszib.savingtheworld.dto.Faktura;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Podatnik {

    @Id
    @GeneratedValue
    public Long pesel;
    @Column(nullable = false)
    public String imie;
    @Column(nullable = false)
    public String nazwisko;

    @OneToMany()
    List<Faktura> faktura;

    public Podatnik(){

    }

    public Podatnik(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public List<Faktura> getFaktura() {
        return faktura;
    }

    public void setFaktura(List<Faktura> faktura) {
        this.faktura = faktura;
    }



    public Long getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setPesel(Long pesel) {
        this.pesel = pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


}
