package ism.inscription.Core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MysqlDb implements IDatabase {
    protected Connection conn;
    protected PreparedStatement ps;

    @Override
    public Void ouvrirConnexionBD() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:8000/ges_inscription", "root", "root");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public Void fermerConnexionBD() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {

                e.printStackTrace();
            }
        }
        return null;
    }

}
