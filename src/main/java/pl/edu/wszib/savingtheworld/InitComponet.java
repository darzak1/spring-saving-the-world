package pl.edu.wszib.savingtheworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.Podatnik;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;
import pl.edu.wszib.savingtheworld.dto.Faktura;
import pl.edu.wszib.savingtheworld.dto.FakturaDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@Component
public class InitComponet {
    @Autowired
    PodatnikDAO podatnikDAO;

    @Autowired
    FakturaDAO fakturaDAO;

    @PostConstruct
    public void init() {
        IntStream.range(0, 10).forEach(i -> {
            Podatnik podatnik = new Podatnik("Adam" + i, "Zak" + i);
            Podatnik podatnikSaved = podatnikDAO.save(podatnik);

            IntStream.range(0, 10).forEach(j -> {
                Faktura faktura = new Faktura(3.5, "cos" + j);
                faktura.setPodatnik(podatnikSaved);
                faktura = fakturaDAO.save(faktura);
            });
        });

        System.out.println("");

    }

    @PreDestroy
    public void teardown() {

    }
}
