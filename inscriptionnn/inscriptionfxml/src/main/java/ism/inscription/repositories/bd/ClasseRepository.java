package ism.inscription.repositories.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import ism.inscription.entities.Classe;

//import com.mysql.jdbc.Statement;


public class ClasseRepository implements ism.inscription.repositories.IClasseRepository {

    @Override
    public List<Classe> findAll() {
        List<Classe> classes = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8000/ges_inscription", "root",
                    "root");
            System.out.println("connexion reussie");
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery("select * from classe");

            while (rs.next()) {
                Classe cl = new Classe(rs.getInt("id"),
                        rs.getString("niveau"),
                        rs.getString("filiere"),
                        rs.getString("libelle"));
                classes.add(cl);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // TODO Auto-generated method c
        return classes;
    }

    @Override
    public Classe insert(Classe classe) {

        String sql = " INSERT INTO `classe` ( `niveau`, `filiere`, `libelle`) VALUES (?, ?, ?)";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8000/ges_inscription", "root",
                    "root");
            System.out.println("connexion reussie");

            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, classe.getNiveau());
            pstm.setString(2, classe.getFiliere());
            pstm.setString(3, classe.getLibelle());
            int nbre_Ligne = pstm.executeUpdate();

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return classe;

    }

    @Override
    public Classe findByLibelle(String lib) {
        Classe classe = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8000/ges_inscription", "root",
                    "root");
            Statement stm = (Statement) conn.createStatement();
            ResultSet rs = stm.executeQuery("select classe* from libelle='" + lib + "' ");
            if (rs.next()) {
                classe = new Classe(rs.getInt("id"));
                rs.getString("niveau");
                rs.getString("filiere");
                rs.getString("libelle");
            }
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return classe;
    }

    @Override
    public List<Classe> findByProfesseur(String nci) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
