package ism.inscription.entities;

public class Classe {

    // constructeurs
    public Classe(String niveau, String filiere) {
        this.niveau = niveau;
        this.filiere = filiere;
        nbre++;
        id = nbre;
        libelle = "CL_" + nbre;
    }

    private static int nbre;
    private int id;// 0
    private String libelle;// NULL
    private String niveau;// null
    private String filiere;// null

    // constructeurs par defaut

    public Classe(int id, String libelle, String niveau, String filiere) {
        this.id = id;
        this.libelle = libelle;
        this.niveau = niveau;
        this.filiere = filiere;
    }

    public Classe() {
        nbre++;
        id = nbre;
        libelle = "CL_" + nbre;
    }

    public Classe(int int1) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Classe [filiere=" + filiere + ", id=" + id + ", libelle=" + libelle + ", niveau=" + niveau + "]";
    }

    public Object getProfesseur() {
        return null;
    }

    // public Object getProfesseur() {
    // return null;
    // }

}