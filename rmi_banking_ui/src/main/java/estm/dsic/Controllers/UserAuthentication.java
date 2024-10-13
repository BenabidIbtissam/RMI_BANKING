package estm.dsic.Controllers;

import java.io.IOException;

import java.net.URL;
import java.util.ResourceBundle;

import estm.dsic.MainApp;
import estm.dsic.Models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class UserAuthentication implements Initializable{

    @FXML
     TextField login;

    @FXML
     PasswordField mdp;


    public void connectClick(ActionEvent event)throws IOException{


        try {
         //   rmi = (IUser) Naming.lookup("//localhost:2021/RMI");
User u =MainApp.objClient.login(login.getText().toString(), mdp.getText().toString());
            if (u!= null) {
                MainApp.cureentUser=u;
            System.out.println("Authentication successful!");
            System.out.println(u.getEMAIL());
            new naviguer().navigateasat(event, "/fxml/home.fxml");



            } else {
            System.out.println("Authentication failed.");
            }
            } catch (Exception e) {
            e.printStackTrace();
            }
            }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
       
        
    }










      
    }
