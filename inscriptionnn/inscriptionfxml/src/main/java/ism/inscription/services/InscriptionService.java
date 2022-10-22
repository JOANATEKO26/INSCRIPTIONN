package ism.inscription.services;

import java.util.List;

import ism.inscription.entities.Classe;
import ism.inscription.entities.Etudiant;
import ism.inscription.entities.Professeur;
import ism.inscription.entities.User;
import ism.inscription.repositories.IClasseRepository;
import ism.inscription.repositories.IEtudiantsRepository;
import ism.inscription.repositories.IProfesseurRepository;
import ism.inscription.repositories.IUserRepository;
import ism.inscription.repositories.bd.EtudiantsRepository;
import ism.inscription.repositories.bd.ProfesseurRepository;
import ism.inscription.repositories.bd.UserRepository;

public class InscriptionService implements IInscriptionService {
    IClasseRepository classeRepository;
    IUserRepository userRepository;
    IProfesseurRepository professeurRepository;
    IEtudiantsRepository etudiantsRepository;

    public InscriptionService(IClasseRepository classeRepository, IUserRepository userRepository2,
            IProfesseurRepository professeurRepository2, IEtudiantsRepository etudiantsRepository) {
        this.classeRepository = classeRepository;
        this.userRepository = userRepository2;
        this.professeurRepository = professeurRepository2;
        this.etudiantsRepository = etudiantsRepository;
    }

    public InscriptionService(IClasseRepository classeRepository2, UserRepository userRepository2,
            ProfesseurRepository professeurRepository2, EtudiantsRepository etudiantsRepository2) {
    }

    public List<Classe> listerClasse() {
        return classeRepository.findAll();
    }

    public List<Professeur> listerProfesseur() {
        return professeurRepository.findAll();
    }

    public List<Etudiant> listerEtudiants() {
        return etudiantsRepository.findAll();
    }

    public Classe creerClasse(Classe classe) {
        return classeRepository.insert(classe);

    }

    public Professeur creerProfesseur(Professeur professeur) {
        return professeurRepository.insert(professeur);
    }

    public Classe filtrerClasseParLib(String lib) {
        return classeRepository.findByLibelle(lib);
    }

    public User creerUser(User user) {
        return userRepository.insert(user);

    }

    public Etudiant creerEtudiant(Etudiant etudiant) {
        return etudiantsRepository.insert(etudiant);
    }

    public List<Classe> listerlesClassesUnProfesseur(String Nomcomplet) {
        return classeRepository.findByProfesseur(Nomcomplet);
    }

    public Classe filtreClasseParLibClasse(String lib) {

        return null;
    }

    public List<Professeur> listerProfesseurs() {

        return null;
    }

   
    @Override
    public User seConnecter(String login, String password) {
        // TODO Auto-generated method stub
        return null;
    }

}
