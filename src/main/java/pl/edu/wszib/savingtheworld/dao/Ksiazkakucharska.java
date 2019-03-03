package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Ksiazkakucharska {

    @Id
    @GeneratedValue
    @Column(nullable = false)
    Long id;

    @Column(nullable = false)
    String tytul;

    @ManyToOne
    @Column(nullable = false)
    List<Przepis> przepisy;

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

    public List<Przepis> getPrzepisy() {
        return przepisy;
    }

    public void setPrzepisy(List<Przepis> przepisy) {
        this.przepisy = przepisy;
    }

    public Ksiazkakucharska() {
    }
}
