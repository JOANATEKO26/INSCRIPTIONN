package ism.inscription.services;

import java.util.List;

import ism.inscription.entities.Classe;
import ism.inscription.entities.Etudiant;
import ism.inscription.entities.Professeur;
import ism.inscription.entities.User;

public interface IInscriptionService {
    public List<ism.inscription.entities.Classe> listerClasse();

    public User seConnecter(String login, String password);

    public Classe creerClasse(Classe classe);

    public Classe filtreClasseParLibClasse(String lib);

    public List<Classe> listerlesClassesUnProfesseur(String nomcomplet);

    public User creerUser(User user);

    public List<Professeur> listerProfesseurs();

    public Etudiant creerEtudiant(Etudiant etudiant);

    public List<Etudiant> listerEtudiants();

    public Classe filtrerClasseParLib(String lib);

    // public Object listerProfesseur();
    public List<Professeur> listerProfesseur();

    public Professeur creerProfesseur(Professeur professeur);
}
