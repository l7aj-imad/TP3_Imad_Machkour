package com.il.java.tp3.api.service;

import com.il.java.tp3.api.dao.PersonneDao;
import com.il.java.tp3.api.model.Personne;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonneService implements PersonneDao {

    List<Personne> personnes;

    public PersonneService() {
        this.personnes = new ArrayList<Personne>();
        this.personnes.add(new Personne(1, "name1", 20,"nationality1"));
        this.personnes.add(new Personne(2, "name2", 21,"nationality2"));
        this.personnes.add(new Personne(3, "name3", 22,"nationality3"));
        this.personnes.add(new Personne(4, "name4", 23,"nationality4"));
    }

    public Personne findById(int id) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                return p;
            }
        }
        return null;
    }

    public List<Personne> getAll() {
        return this.personnes;
    }

    public Personne update(int id, Personne personne) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                p.setName(personne.getName());
                p.setAge(personne.getAge());
                p.setNationality(personne.getNationality());
                return p;
            }
        }
        return null;
    }

    public boolean add(Personne personne) {
        for (Personne p : this.personnes) {
            if (personne.getId() == p.getId()) {
                return false;
            }
        }
        return this.personnes.add(personne);
    }

    public boolean delete(int id) {
        for (Personne p : this.personnes) {
            if (id == p.getId()) {
                return this.personnes.remove(p);
            }
        }
        return false;
    }
}
