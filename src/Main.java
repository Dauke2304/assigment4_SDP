import Mediator.*;
public class Main {
    public static void main(String[] args) {
        // Create a chat room (mediator)
        ChatMediator chatRoom = new ChatRoom();

        // Create users
        User user1 = new RegularUser(chatRoom, "Alice");
        User user2 = new RegularUser(chatRoom, "Bob");
        User user3 = new PremiumUser(chatRoom, "Charlie");
        User user4 = new PremiumUser(chatRoom, "Diana");

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        // Users sending messages
        user1.send("Hello, everyone!");
        user3.send("Hi Alice!");
        user4.send("Good to see you all.");
    }
}