package estm.dsic.DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import estm.dsic.Models.DBconnection;
import estm.dsic.Models.User;

public class UserDAO {



 

    public User getInfos(String email){
       
        Connection con = null;
        User client = null;
         try {
            con=  DBconnection.getConnection();
            String qry = "Select * from User where EMAIL='" + email + "'";
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(qry);
            if (res.isBeforeFirst() || res.getRow() != 0) {
                while (res.next()) {
                    client = new User(
                            res.getInt("ID"),
                            res.getString("NOM"),
                            res.getString("PRENOM"),
                            res.getString("EMAIL"),
                            res.getString("MDP"));
                }
                return client;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } 
        return null;
    }












    
}
