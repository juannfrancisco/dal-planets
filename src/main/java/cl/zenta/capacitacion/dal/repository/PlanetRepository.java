package cl.zenta.capacitacion.dal.repository;

import cl.zenta.capacitacion.dal.entities.Planet;
import org.springframework.data.repository.CrudRepository;


public interface PlanetRepository extends CrudRepository<Planet, String> {
}
