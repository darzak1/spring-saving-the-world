package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PodatnikDAO extends CrudRepository<Podatnik, String> {
}
