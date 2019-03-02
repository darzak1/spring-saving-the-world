package pl.edu.wszib.savingtheworld.dao;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Podatnik {

    @Id
    String pesel;
    @Column(nullable = false)
    String imie;
    @Column(nullable = false)
    String nazwisko;

    public Podatnik(){

    }

    public Podatnik(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }


}
