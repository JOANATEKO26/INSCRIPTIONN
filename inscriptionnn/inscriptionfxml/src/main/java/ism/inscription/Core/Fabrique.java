package ism.inscription.Core;

import ism.inscription.repositories.IClasseRepository;

import ism.inscription.repositories.bd.ClasseRepository;
import ism.inscription.repositories.bd.EtudiantsRepository;
import ism.inscription.repositories.bd.ProfesseurRepository;
import ism.inscription.repositories.bd.UserRepository;
import ism.inscription.services.IInscriptionService;
import ism.inscription.services.InscriptionService;

public class Fabrique {
    public static IInscriptionService getService() {

        IClasseRepository classeRepository = new ClasseRepository();
        UserRepository userRepository = new UserRepository();
        ProfesseurRepository professeurRepository = new ProfesseurRepository();
        EtudiantsRepository etudiantsRepository = new EtudiantsRepository();
        return new InscriptionService(classeRepository, userRepository, professeurRepository, etudiantsRepository);

    }

}
