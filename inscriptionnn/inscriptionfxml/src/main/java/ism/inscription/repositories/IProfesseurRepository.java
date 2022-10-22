package ism.inscription.repositories;

import java.util.List;

import ism.inscription.entities.Professeur;

public interface IProfesseurRepository {
    public List<Professeur> findAll();

    public Professeur insert(Professeur professeur);

    public Professeur findByNci(String nc);

}
