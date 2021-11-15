package com.il.java.tp3.api.dao;

import com.il.java.tp3.api.model.Personne;

import java.util.List;

public interface PersonneDao {

    public Personne findById(int id);

    public List<Personne> getAll();

    public Personne update(int id, Personne personne);

    public boolean add(Personne personne);

    public boolean delete(int id);
}
