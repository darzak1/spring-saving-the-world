package pl.edu.wszib.savingtheworld.dao;

import javax.persistence.*;


@Entity
@Table
public class TypSkladnika {


    @Id
    @GeneratedValue
    @Column(nullable = false)
    Long id;
    @Column(nullable = false)
    String nazwa; //umikalna

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public TypSkladnika(Long id, String nazwa) {
        this.id = id;
        this.nazwa = nazwa;
    }

    public TypSkladnika() {
    }

}
