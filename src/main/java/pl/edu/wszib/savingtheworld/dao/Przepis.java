package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Przepis {

    @Id
    @GeneratedValue
    Long id;

    String tytul;

    @ManyToOne
    @Column(nullable = false)
    List<Skladniki> skladniki;

    @OneToOne
    @Column(nullable = false)
    Ksiazkakucharska ksiazkakucharska;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public List<Skladniki> getSkladniki() {
        return skladniki;
    }

    public void setSkladniki(List<Skladniki> skladniki) {
        this.skladniki = skladniki;
    }

    public Ksiazkakucharska getKsiazkakucharska() {
        return ksiazkakucharska;
    }

    public void setKsiazkakucharska(Ksiazkakucharska ksiazkakucharska) {
        this.ksiazkakucharska = ksiazkakucharska;
    }

    public Przepis() {
    }

}
