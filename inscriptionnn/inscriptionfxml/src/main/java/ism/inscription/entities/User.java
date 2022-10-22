package ism.inscription.entities;

public class User {
    // private static int nbre;
    protected int id;
    protected String login;
    protected String password;
    protected Role role;

    public User(Role role) {
        this.role = role;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    protected String libelle;

    public User(String login, String password, String libelle) {
        this.login = login;
        this.password = password;
        this.libelle = libelle;
        // nbre++;
        // id=nbre;
        libelle = "USER_" + id;
        role = Role.Ac;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public User() {
        // nbre++;
        // id=nbre;
        libelle = "USER_" + id;
        role = Role.Ac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
