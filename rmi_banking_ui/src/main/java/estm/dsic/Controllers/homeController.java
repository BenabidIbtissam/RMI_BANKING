package estm.dsic.Controllers;

import java.net.URL;
import java.util.ResourceBundle;

import estm.dsic.MainApp;
import estm.dsic.Models.Account;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class homeController implements Initializable{

@FXML
Label holder ;

@FXML
Label email ;

@FXML
Label acc_num ;

@FXML
Label balance ;

int id = MainApp.cureentUser.getID();

public void setinfo(){
    holder.setText(MainApp.cureentUser.getNom().toString()+ "   "+ MainApp.cureentUser.getPRENOM().toString()); 
    email.setText(MainApp.cureentUser.getEMAIL().toString()); 
    acc_num.setText(String.valueOf(MainApp.useraccount.getID()));
    balance.setText(String.valueOf(MainApp.useraccount.getBalance()));

}

public void setBalance(){
    

}



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
         try {
         //   rmi = (IUser) Naming.lookup("//localhost:2021/RMI");
         
       Account u =MainApp.acc.infosAccount(id);
            if (u!= null) {
                MainApp.useraccount=u;
        

            } else {
            System.out.println("Authentication failed.");
            }
            } catch (Exception e) {
            e.printStackTrace();
            }


setinfo();
setBalance();


            }


        


    
}
