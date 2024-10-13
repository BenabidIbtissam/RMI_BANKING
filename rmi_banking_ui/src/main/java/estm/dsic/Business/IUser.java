package estm.dsic.Business;

import java.rmi.Remote;
import java.rmi.RemoteException;

import estm.dsic.Models.User;


public interface IUser extends Remote{
    



   public  User  login(String email, String password) throws  RemoteException;


}