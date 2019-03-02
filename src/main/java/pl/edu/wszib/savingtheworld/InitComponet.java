package pl.edu.wszib.savingtheworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.edu.wszib.savingtheworld.dao.Podatnik;
import pl.edu.wszib.savingtheworld.dao.PodatnikDAO;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class InitComponet {
    @Autowired
    PodatnikDAO podatnikDAO;

    @PostConstruct
    public void init(){
       Podatnik podatnik = podatnikDAO.save(new Podatnik("7804111230", "Adam", "Zak"));
        podatnik.getImie();
    }

    @PreDestroy
    public void teardown(){

    }
}
