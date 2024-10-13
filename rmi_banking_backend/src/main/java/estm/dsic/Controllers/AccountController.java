package estm.dsic.Controllers;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;

import estm.dsic.Business.IAccount;
import estm.dsic.DAO.AccountDAO;
import estm.dsic.Models.Account;

public class AccountController extends UnicastRemoteObject
implements IAccount {


    public AccountController() throws RemoteException, SQLException {
        super();
    }

    

    @Override
    public String deposit(Double amount) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Boolean withdraw(Double amount) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Boolean tansfert(double amount) throws Exception {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Boolean Balance() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }



    @Override
    public Account infosAccount(int id) throws Exception {

        AccountDAO clDao = new AccountDAO();
        Account cl = clDao.getIdClient(id);
        if (cl != null) {
            return cl;
        }
        return null;


    }

  

 

    
}
