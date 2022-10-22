package ism.inscription.repositories.bd;

import java.sql.SQLException;

import ism.inscription.Core.MysqlDb;

import ism.inscription.entities.User;
import ism.inscription.repositories.IUserRepository;

public class UserRepository extends MysqlDb implements IUserRepository{
    private final String SQL_CONNECT="SELECT * FROM `user` WHERE`login` LIKE ? AND `password` LIKE? ";


   
    @Override
    public User insert(User user) {
        this.ouvrirConnexionBD();
        try {
            ps=conn.prepareStatement(SQL_CONNECT,java.sql.PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1,user.getLogin());
            ps.setString(2,user.getLogin());
            
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        this.fermerConnexionBD();
        // TODO Auto-generated method stub
        return null;
    }



    
}