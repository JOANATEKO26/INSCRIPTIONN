package ism.inscription.entities;

public class Ac extends User {
    private String email;

    public Ac(String login, String password, String libelle, String email) {
        super(login, password, libelle);
        this.email = email;
        role = Role.Ac;
    }

    public Ac() {
        super();

        role = Role.Ac;
    }

    public Ac(User role, String email) {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
