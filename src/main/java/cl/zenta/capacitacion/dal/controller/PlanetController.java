package cl.zenta.capacitacion.dal.controller;

import cl.zenta.capacitacion.dal.entities.Planet;
import cl.zenta.capacitacion.dal.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.Optional;

@RestController
public class PlanetController {

    @Autowired
    private PlanetRepository repository;

    @RequestMapping(method = RequestMethod.GET , value="/planet/")
    public Iterator<Planet> getAll( ){
        return repository.findAll().iterator();
    }

    @RequestMapping(method = RequestMethod.GET , value="/planet/{id}")
    public Planet getById(@PathVariable("id") String id ){
        Optional<Planet> people =  repository.findById(id);
        return people.get();
    }

    @RequestMapping(method = RequestMethod.POST , value="/planet/")
    public void save( @RequestBody Planet object){
        repository.save(object);
    }

    @RequestMapping(method = RequestMethod.PUT , value="/planet/{id}")
    public void update( @RequestBody Planet object){
        repository.save(object);
    }

    @RequestMapping(method = RequestMethod.DELETE , value="/planet/{id}")
    public void delete( @PathVariable("id") String id ){
        repository.deleteById(id);
    }

}
