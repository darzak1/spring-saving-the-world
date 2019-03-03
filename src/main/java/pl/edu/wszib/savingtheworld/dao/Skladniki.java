package pl.edu.wszib.savingtheworld.dao;


import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
@Table
public class Skladniki {


    @Id
    @GeneratedValue
    Long id;

    @OneToOne
    @Column(nullable = false)
    TypSkladnika typSkladnika;
    int ilosc;

    @ManyToMany
    Przepis przepis;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypSkladnika getTypSkladnika() {
        return typSkladnika;
    }

    public void setTypSkladnika(TypSkladnika typSkladnika) {
        this.typSkladnika = typSkladnika;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }

    public Przepis getPrzepis() {
        return przepis;
    }

    public void setPrzepis(Przepis przepis) {
        this.przepis = przepis;
    }

    public Skladniki() {
    }
}
