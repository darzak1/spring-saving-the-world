package pl.edu.wszib.savingtheworld.dto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FakturaDAO extends CrudRepository<Faktura, Long> {

    List<Faktura> findAll();

}
