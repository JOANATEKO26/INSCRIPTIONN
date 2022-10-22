package ism.inscription.entities;

public class Professeur {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private static String nci;

    public static String getNci() {
        return nci;
    }

    public void setNci(String nci) {
        Professeur.nci = nci;
    }

    private static String nomcomplet;
    private String grade;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    private static int nbre;

    public Professeur(String nomcomplet, String grade) {
        Professeur.nomcomplet = nomcomplet;
        this.grade = grade;
        nbre++;
        id = nbre;
        nci = "PR_" + nbre;
    }

    public Professeur() {
        nbre++;
        id = nbre;
        nci = "PR_" + nbre;
    }

    public static String getNomcomplet() {
        return nomcomplet;
    }

    public void setNomcomplet(String nomcomplet) {
        Professeur.nomcomplet = nomcomplet;
    }

    @Override
    public String toString() {
        return "Professeur [grade=" + grade + ", id=" + id + ", nci=" + nci + ", nomcomplet=" + nomcomplet + "]";
    }

}
