import java.util.ArrayList;
import java.util.List;

// Observer Interface
interface UserObserver {
    void update(String message);
}

// Subject Class
class ChatRoom {
    private List<UserObserver> users = new ArrayList<>();
    
    public void join(UserObserver user) {
        users.add(user);
    }

    public void leave(UserObserver user) {
        users.remove(user);
    }

    public void sendMessage(String message) {
        for (UserObserver user : users) {
            user.update(message);
        }
    }
}

// Concrete Observer Class
class User implements UserObserver {
    private String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String message) {
        System.out.println(username + " received: " + message);
    }
}

// Test the Observer Pattern
public class ObserverPattern {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        chatRoom.join(user1);
        chatRoom.join(user2);
        
        chatRoom.sendMessage("Hello, everyone!");

        chatRoom.leave(user2);
        chatRoom.sendMessage("Bob left the chat.");
    }
}
