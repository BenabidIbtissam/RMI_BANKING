package estm.dsic.Models;

import java.io.Serializable;

public class User implements Serializable {
    
    private int ID ;
    private String Nom ;
    private String PRENOM;
    private String EMAIL;
    private String MDP;

public User(int ID, String NOM, String PRENOM, String EMAIL, String MDP) {
        this.ID = ID;
        this.Nom = NOM;
        this.PRENOM = PRENOM;
        this.EMAIL = EMAIL;
        this.MDP = MDP;
    }

    public User() {
       
    }

public int getID() {
    return ID;
}

public void setID(int iD) {
    ID = iD;
}

public String getNom() {
    return Nom;
}

public void setNom(String nom) {
    Nom = nom;
}

public String getPRENOM() {
    return PRENOM;
}

public void setPRENOM(String pRENOM) {
    PRENOM = pRENOM;
}

public String getEMAIL() {
    return EMAIL;
}

public void setEMAIL(String eMAIL) {
    EMAIL = eMAIL;
}

public String getMDP() {
    return MDP;
}

public void setMDP(String mDP) {
    MDP = mDP;
}
    

}