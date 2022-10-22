package ism.inscription.repositories;

import java.util.List;

import ism.inscription.entities.Etudiant;

public interface IEtudiantsRepository {
    public List<Etudiant> findAll();

    public Etudiant insert(Etudiant etudiant);

}
