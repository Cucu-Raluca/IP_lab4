package app;

import java.util.List;
import java.util.ArrayList;

public class UnloggedUser {
    private boolean autentificat=false;

    public UnloggedUser(){this.autentificat=false;}

    public void viwePagina()
    {
        System.out.println("Loading limited selection of public event landing pages");
    }
    public List<String> browsePag(){
        List<String> listEvenimente= new ArrayList<>();
        listEvenimente.add("City Park");
        listEvenimente.add("Coffe1");
        listEvenimente.add("Palas");

        System.out.println("Top events........");
        return listEvenimente;
    }
    public void appFunctionalitati(){
        System.out.println("View features..");
    }
    public boolean autentificareUser(String userName,String eMail){
        System.out.println("Logged "+userName+"with email "+eMail);
        return autentificat=true;
    }
    public void setupProfil(String location, String interests) {
        if (autentificat) {
            System.out.println("Profile setup complete.");
            System.out.println("Location: " + location);
            System.out.println("Interests: " + interests);
        } else {
            System.out.println("You must create an account first.");
        }
    }

}
