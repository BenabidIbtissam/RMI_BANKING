package estm.dsic.Models;

import java.io.Serializable;

public class Account implements Serializable {
    private int ID ;
    private int Account_Holder ;
    private double Balance ;
    

    public Account(int iD, int account_Holder, Double balance) {
        this.ID = iD;
        this.Account_Holder = account_Holder;
        this.Balance = balance;
    }

   
    public Account() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int iD) {
        ID = iD;
    }

    public int getAccount_Holder() {
        return Account_Holder;
    }

    public void setAccount_Holder(int account_Holder) {
        Account_Holder = account_Holder;
    }

    public Double getBalance() {
        return Balance;
    }

    public void setBalance(int balance) {
        Balance = balance;
    }


    
}
