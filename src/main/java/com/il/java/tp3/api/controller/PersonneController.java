package com.il.java.tp3.api.controller;

import java.util.List;

import com.il.java.tp3.api.dao.PersonneDao;
import com.il.java.tp3.api.model.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping("/personne")
public class PersonneController {

    @Autowired
    private PersonneDao personneDao;

    @GetMapping("/all")
    public List<Personne> getPersonne() {
        return personneDao.getAll();
    }

    @GetMapping("/find/{id}")
    public Personne getPersonneById(@PathVariable int id) {
        return personneDao.findById(id);
    }

    @PutMapping("/update/{id}")
    public Personne updatePersonne(@PathVariable int id, @RequestBody Personne p) {
        return personneDao.update(id, p);
    }

    @PostMapping("/add")
    public boolean addPersonne(@RequestBody Personne p) {
        return personneDao.add(p);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deletePersonne(@PathVariable int id) {
        return personneDao.delete(id);
    }
}
