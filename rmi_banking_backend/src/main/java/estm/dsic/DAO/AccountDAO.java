package estm.dsic.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import estm.dsic.Models.Account;
import estm.dsic.Models.DBconnection;

public class AccountDAO {

    public Account  getIdClient(int id){
       
        Connection con = null;
        Account acc = null;
         try {
            con=  DBconnection.getConnection();
            String qry = "Select * from Account where ID='" + id + "'";
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(qry);
            if (res.isBeforeFirst() || res.getRow() != 0) {
                while (res.next()) {
                    acc = new Account(
                            res.getInt("ID"),
                            res.getInt("Account_Holder"),
                            res.getDouble("Balance"));
                           
                }
                return acc;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } return null;
    }
}