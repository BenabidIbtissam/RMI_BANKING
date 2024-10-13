package estm.dsic.Business;

import java.rmi.Remote;

import estm.dsic.Models.Account;

public interface IAccount extends Remote {

    public Account infosAccount(int id)throws Exception;
    public String deposit(Double amount)throws Exception;
    public Boolean withdraw(Double amount)throws Exception;
    public Boolean tansfert(double amount)throws Exception;
    public Boolean Balance()throws Exception;




}
