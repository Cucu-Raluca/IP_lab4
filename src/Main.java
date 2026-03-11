import app.LoggedUser;

import java.util.List;

public class Main
{
    public static void main(String[] args) {
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
    }
}