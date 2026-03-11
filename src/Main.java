import app.LoggedUser;
import app.UnloggedUser;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
         UnloggedUser user1 = new UnloggedUser();

        user1.viwePagina();
        user1.appFunctionalitati();

        System.out.println("Public events available:");
        for(String pag: user1.browsePag())
        {
            System.out.println(pag);
        }

        user1.autentificareUser("Ana_are_mere","anamere6769@gmail.ro");
        user1.setupProfil("Palas","desenul");
        // 1. Instantiate the Logged User (Object)
        LoggedUser currentUser = new LoggedUser("USR-123", "AlexExplorer", "alex@example.com");

        // 2. Setup user state
        currentUser.addFriend("Maria_Travels");
        currentUser.addFriend("JohnDo");
        currentUser.setCalendarSynced(true);

        // 3. Define friends to invite
        List<String> friendsToInvite = List.of("Maria_Travels", "JohnDo");

        // 4. Call the important method (Initiate Planning)
        currentUser.initiateGroupPlanning("Weekend Rooftop Jazz Concert", friendsToInvite);

        // 5. Test UnloggedUser class
       
    }
}
