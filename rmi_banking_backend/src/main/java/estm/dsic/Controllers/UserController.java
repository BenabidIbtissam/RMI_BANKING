package estm.dsic.Controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



import estm.dsic.Business.IUser;
import estm.dsic.DAO.UserDAO;
import estm.dsic.Models.User;



public class UserController extends UnicastRemoteObject
implements IUser {
   /**  private Connection connection;

    protected UserController() throws RemoteException, SQLException {
        super();
        connectToDatabase();
    }


  
    private void connectToDatabase() throws SQLException {
        // Connect to the MySQL database
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rmi_banking", "root", "");
    }



    @Override
    public Boolean authentication(String username, String password) throws RemoteException, SQLException {
         // Query the database for the user information
         Statement statement = connection.createStatement();
         ResultSet result = statement.executeQuery("SELECT * FROM User WHERE EMAIL = '" + username + "' AND MDP = '" + password + "'");
 
         // Return true if the user information is found in the database
         return result.next();
    }

    */

    public UserController() throws RemoteException {
    }


    @Override
    public User login(String email, String password) throws RemoteException {
        UserDAO clDao = new UserDAO();
        User cl = clDao.getInfos(email);
        if (cl != null) {
            return cl;
        }
        return null;
    }
    
    
}
