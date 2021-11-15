package com.il.java.tp3.api.controller;

import java.util.List;

import com.il.java.tp3.api.dao.PersonneDao;
import com.il.java.tp3.api.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonneController {

    @Autowired
    private PersonneDao personneDao;

    @GetMapping("/personne")
    public List<Personne> getPersonne() {
        return personneDao.getAll();
    }

    @GetMapping("/personne/{id}")
    public Personne getPersonne(@PathVariable int id) {
        return personneDao.findById(id);
    }

    @PutMapping("/personne/{id}")
    public Personne putPersonne(@PathVariable int id, @RequestBody Personne p) {
        return personneDao.update(id, p);
    }

    @PostMapping("/personne")
    public boolean postPersonne(@RequestBody Personne p) {
        return personneDao.add(p);
    }

    @DeleteMapping("/personne/{id}")
    public boolean deletePersonne(@PathVariable int id) {
        return personneDao.delete(id);
    }
}
