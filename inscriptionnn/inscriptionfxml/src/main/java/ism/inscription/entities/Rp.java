package ism.inscription.entities;

public class Rp extends User {
    private String adresse;

    public Rp(String login, String password, String libelle, String adresse) {
        super(login, password, libelle);
        this.adresse = adresse;
        role = Role.Rp;
    }

    public Rp() {
        super();
        role = Role.Rp;
    }

    public Rp(String role, String adresse2) {
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
