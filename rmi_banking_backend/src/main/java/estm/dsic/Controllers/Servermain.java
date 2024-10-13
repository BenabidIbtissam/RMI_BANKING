package estm.dsic.Controllers;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class Servermain {
   
    public static void main(String[] args) {
      /**  try {
        UserController server = new UserController();
        Naming.rebind("rmi://localhost:1099/RMI", server);
        System.out.println("Server ready.");
        } catch (Exception e) {
        System.out.println("Exception: " + e);}*/ 


        int port =2021  ;

        try {
          Registry registry = LocateRegistry.createRegistry(port);
          UserController login = new UserController() {};
          AccountController account = new AccountController() {};

            String URL = "rmi://localhost:"+2021+"/RMI";
            Naming.rebind(URL, login);

            String URL2= "rmi://localhost:"+2021+"/after";

            Naming.rebind(URL2, account);

           

            }catch (Exception e) {
                System.out.println("Exception: " + e);
        }
        }
}
