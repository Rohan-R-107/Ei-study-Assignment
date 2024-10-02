### README File for Both Exercises

---

# **Exercise 1: Design Patterns Implementation**

## **Introduction:**
In this exercise, six different software design patterns are implemented in Java, covering behavioral, creational, and structural patterns. Each pattern is demonstrated with specific use cases.

### **Design Patterns Implemented:**
1. **Behavioral Design Patterns**:
   - **Observer Pattern**: A chat room where users are notified when a new message is posted.
   - **Strategy Pattern**: A payment system where the payment method can be Credit Card or PayPal.

2. **Creational Design Patterns**:
   - **Singleton Pattern**: A configuration manager to manage application settings, ensuring only one instance exists.
   - **Factory Pattern**: A notification system that creates different types of notifications like Email, SMS, or Push Notifications.

3. **Structural Design Patterns**:
   - **Adapter Pattern**: A media player that adapts to play video files through an adapter.
   - **Facade Pattern**: A home entertainment system where the facade provides simplified controls for complex subsystems like a TV, Speaker System, and Media Player.

---

### **How to Run:**

- **Requirements**: 
  - JDK 8 or above.
  - An IDE like IntelliJ IDEA or Eclipse for Java development.
  
- **Steps to Run**:
  1. Clone the repository from GitHub.
  2. Open the project in your IDE.
  3. Run the individual Java files for each pattern by navigating to the `main` method of each pattern's Java file.
  
- **Directory Structure**:
    ```
    Exercise-1
    ├── Behavioral
    │   ├── ObserverPattern.java
    │   └── StrategyPattern.java
    ├── Creational
    │   ├── SingletonPattern.java
    │   └── FactoryPattern.java
    ├── Structural
    │   ├── AdapterPattern.java
    │   └── FacadePattern.java
    └── README.md
    ```

---

### **Detailed Use Cases:**

1. **Observer Pattern**:
   - A chat room where users (observers) get notified when a new message is posted.
   - You can test the code by running `ObserverPattern.java`.

2. **Strategy Pattern**:
   - A payment context where payment strategies (Credit Card or PayPal) can be switched dynamically.
   - Run the `StrategyPattern.java` to simulate different payment methods.

3. **Singleton Pattern**:
   - A configuration manager is used to ensure that only one instance manages application configurations.
   - Test the singleton pattern by running `SingletonPattern.java`.

4. **Factory Pattern**:
   - A notification factory that generates different types of notifications (Email, SMS, or Push).
   - You can run `FactoryPattern.java` to see the factory in action.

5. **Adapter Pattern**:
   - A media player adapted to play video files through a Video Player Adapter.
   - Test this by running `AdapterPattern.java`.

6. **Facade Pattern**:
   - A home entertainment system that provides a simplified interface to control complex subsystems like a TV, Speaker System, and Media Player.
   - Run `FacadePattern.java` to observe the Facade in action.

---

# **Exercise 2: Real-time Chat Application Using Design Patterns**

## **Introduction:**
This exercise implements a real-time chat application using Java and demonstrates the usage of multiple design patterns like Singleton, Observer, and Adapter patterns.

### **Key Design Patterns:**
1. **Singleton Pattern**: Used for managing the state of the chat room.
2. **Observer Pattern**: Used to notify users in real-time when a new message is received.
3. **Adapter Pattern**: Used to abstract different types of communication protocols (e.g., WebSocket).

---

### **How to Run:**

- **Requirements**: 
  - JDK 8 or above.
  - An IDE like IntelliJ IDEA or Eclipse for Java development.
  - Command line or terminal for user input.

- **Steps to Run**:
  1. Clone the repository from GitHub.
  2. Open the project in your IDE.
  3. Run the `Main.java` file to start the chat application.
  
- **Directory Structure**:
    ```
    Exercise-2
    ├── adapter
    │   ├── CommunicationAdapter.java
    │   └── WebSocketAdapter.java
    ├── model
    │   ├── ChatRoom.java
    │   ├── Message.java
    │   └── User.java
    ├── observer
    │   └── MessageObserver.java
    ├── service
    │   └── ChatRoomService.java
    ├── Main.java
    └── README.md
    ```

---

### **Explanation of Core Components:**

1. **ChatRoom (Singleton)**:
   - Manages the chat room creation and user management using the Singleton pattern, ensuring only one instance of the `ChatRoom` exists.
   
2. **MessageObserver Interface**:
   - Defines the observer pattern for receiving new messages in a chat room. All users (observers) are notified when a new message is sent.
   
3. **WebSocketAdapter**:
   - Implements an adapter for WebSocket communication. The `WebSocketAdapter` class adapts the `CommunicationAdapter` interface to simulate real-time message sending via WebSockets.
   
4. **ChatRoomService**:
   - This service handles the real-time interaction between users. It uses the observer pattern to notify users of new messages and ensures the `ChatRoom` class (Singleton) is used for room management.

---

### **Sample Output**:

1. **Starting the Application**:
   ```
   Enter your username: Alice
   Enter Room ID to join or create: Room1
   Joined room: Room1
   ```

2. **Sending Messages**:
   ```
   Enter message (type 'exit' to leave): Hello everyone!
   Sending message via WebSocket: Hello everyone!
   [Alice]: Hello everyone!
   ```

3. **Active Users in Room**:
   ```
   Active users in the room: [Alice, Bob]
   ```

---

### **Key Concepts Demonstrated:**
- **Singleton**: Ensures there is only one instance of `ChatRoom`.
- **Observer**: Users in the chat room get notified in real-time when new messages are posted.
- **Adapter**: The WebSocket adapter is used to abstract the communication layer, demonstrating the Adapter pattern.

---

### **Additional Notes:**
- The application runs in a loop, allowing users to send and receive messages in real-time until they choose to exit.
- The design pattern implementations are optimized for performance and maintainability with logging, error handling, and defensive programming strategies.

---

Feel free to fork the repository, and don't forget to reach out if you have any questions during the code walkthrough!

