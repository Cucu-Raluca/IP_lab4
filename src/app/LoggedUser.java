package app;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents an authenticated user in the Socially ecosystem.
 * This class handles social interactions, calendar syncing, and
 * collaboration with the AI Agent.
 */
public class LoggedUser
{
    // Attributes based on requirements
    private String userId;
    private String username;
    private String email;
    private List<String> friendList;
    private List<String> userPreferences;
    private boolean isCalendarSynced;

    // Constructor
    public LoggedUser(String userId, String username, String email) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.friendList = new ArrayList<>();
        this.userPreferences = new ArrayList<>();
        this.isCalendarSynced = false;
    }

    /**
     * Core Method: initiateGroupPlanning
     * This method facilitates deep collaboration by identifying common free time
     * and inviting friends to a potential event.
     */
    public void initiateGroupPlanning(String eventTitle, List<String> invitedFriends) {
        if (!isCalendarSynced) {
            System.out.println("Notice: Please sync your Google Calendar to optimize group availability!");
        }

        System.out.println("--- Group Planning Session Started ---");
        System.out.println("User [" + username + "] is organizing: " + eventTitle);
        System.out.println("Inviting: " + String.join(", ", invitedFriends));

        // In a real system, this would trigger the AI Agent to scan for windows of opportunity
        System.out.println("Status: AI Agent is now scanning mutual availability for the group...");
    }

    // Setters and Getters
    public void setCalendarSynced(boolean synced) {
        this.isCalendarSynced = synced;
    }

    public void addFriend(String friendUsername) {
        this.friendList.add(friendUsername);
    }

    public String getUsername() {
        return username;
    }
}
