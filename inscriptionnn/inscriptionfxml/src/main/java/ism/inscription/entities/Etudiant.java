package ism.inscription.entities;

public class Etudiant {
    private static int nbre;
    private int id;

    public static int getNbre() {
        return nbre;
    }

    public static void setNbre(int nbre) {
        Etudiant.nbre = nbre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String matricule;
    private String nomcomplet;
    private String tuteur;

    public Etudiant(String nomcomplet, String tuteur) {
        this.nomcomplet = nomcomplet;
        this.tuteur = tuteur;
        nbre++;
        id = nbre;
        matricule = "Ma_" + nbre;
    }

    public Etudiant() {
        nbre++;
        id = nbre;
        matricule = "Ma_" + nbre;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }

    public String getTuteur() {
        return tuteur;
    }

    public void setTuteur(String tuteur) {
        this.tuteur = tuteur;

    }

    @Override
    public String toString() {
        return "Etudiant [id=" + id + ", matricule=" + matricule + ", nomcomplet=" + nomcomplet + ", tuteur=" + tuteur
                + "]";
    }

}
