package estm.dsic;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.Naming;

import estm.dsic.Business.IAccount;
import estm.dsic.Business.IUser;
import estm.dsic.Models.Account;
import estm.dsic.Models.User;


public class MainApp extends Application {
    private static Stage stage;
    public static IUser objClient = null;
    public static IAccount acc = null;

    public static User cureentUser = null;
    public static Account useraccount = null;

  
    public static void main(String[] args) {
       
        String URL = "//localhost:2021/RMI";
        try {
            objClient = (IUser) Naming.lookup(URL);

            String URL2= "//localhost:2021/after";

            acc = (IAccount) Naming.lookup(URL2);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        launch(args);
    }
    @Override
    public void start( Stage s) throws IOException {
        stage = s;
        setRoot("authentication", "");
    }

    static void setRoot(String fxml) throws IOException {
        setRoot(fxml, stage.getTitle());
    }

    static void setRoot(String fxml, String title) throws IOException {
        Scene scene = new Scene(loadFXML(fxml));
        stage.setTitle(title);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("/fxml/" + fxml + ".fxml"));
        return fxmlLoader.load();
    }

   
 

}