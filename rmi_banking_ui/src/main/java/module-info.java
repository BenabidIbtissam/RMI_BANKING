module estm.dsic {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    requires java.rmi ;
    requires transitive javafx.graphics;
    requires transitive javafx.base;
    opens estm.dsic to javafx.fxml;
    exports estm.dsic;
    exports estm.dsic.Models;

         opens estm.dsic.Controllers;
         opens estm.dsic.Business;

    
}