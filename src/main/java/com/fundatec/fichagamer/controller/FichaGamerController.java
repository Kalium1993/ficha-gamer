package com.fundatec.fichagamer.controller;

import com.fundatec.fichagamer.domain.FichaGamer;
import com.fundatec.fichagamer.repository.FichaGamerRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fichagamer")
public class FichaGamerController {
    @Autowired
    private FichaGamerRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<FichaGamer> getFichaGamer() {
        return repository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public FichaGamer getFichaGamerById(@PathVariable("id")ObjectId id) {
        return repository.findBy_id(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public FichaGamer createFichaGamer(@Valid @RequestBody FichaGamer fichaGamer) {
        fichaGamer.set_id(ObjectId.get());
        repository.save(fichaGamer);
        return fichaGamer;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void editFichaGamerById(@PathVariable("id") ObjectId id,
                             @Valid @RequestBody FichaGamer fichaGamer) {
        fichaGamer.set_id(id);
        repository.save(fichaGamer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteFichaGamer(@PathVariable ObjectId id) {
        repository.delete(repository.findBy_id(id));
    }

}
