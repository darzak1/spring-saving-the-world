package pl.edu.wszib.savingtheworld.dto;

public class PodatnikDTO {

    public Long pesel;
    public String imie;
    public String nazwisko;

    public Long getPesel(){
        return pesel;
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
