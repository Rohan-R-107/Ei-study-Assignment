Exercise 1: Design Patterns Implementation
Introduction:
In this exercise, six different software design patterns are implemented in Java, covering behavioral, creational, and structural patterns. Each pattern is demonstrated with specific use cases.

Design Patterns Implemented:
Behavioral Design Patterns:

Observer Pattern: A chat room where users are notified when a new message is posted.
Strategy Pattern: A payment system where the payment method can be Credit Card or PayPal.
Creational Design Patterns:

Singleton Pattern: A configuration manager to manage application settings, ensuring only one instance exists.
Factory Pattern: A notification system that creates different types of notifications like Email, SMS, or Push Notifications.
Structural Design Patterns:

Adapter Pattern: A media player that adapts to play video files through an adapter.
Facade Pattern: A home entertainment system where the facade provides simplified controls for complex subsystems like a TV, Speaker System, and Media Player.

How to Run:
Requirements:
JDK 8 or above.
An IDE like IntelliJ IDEA or Eclipse for Java development.

Steps to Run:
Clone the repository from GitHub.
Open the project in your IDE.
Run the individual Java files for each pattern by navigating to the main method of each pattern's Java file.
Directory Structure:
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
Detailed Use Cases:
Observer Pattern:

A chat room where users (observers) get notified when a new message is posted.
You can test the code by running ObserverPattern.java.
Strategy Pattern:

A payment context where payment strategies (Credit Card or PayPal) can be switched dynamically.
Run the StrategyPattern.java to simulate different payment methods.
Singleton Pattern:

A configuration manager is used to ensure that only one instance manages application configurations.
Test the singleton pattern by running SingletonPattern.java.
Factory Pattern:

A notification factory that generates different types of notifications (Email, SMS, or Push).
You can run FactoryPattern.java to see the factory in action.
Adapter Pattern:

A media player adapted to play video files through a Video Player Adapter.
Test this by running AdapterPattern.java.
Facade Pattern:

A home entertainment system that provides a simplified interface to control complex subsystems like a TV, Speaker System, and Media Player.
Run FacadePattern.java to observe the Facade in action.
Exercise 2: Real-time Chat Application Using Design Patterns
Introduction:
This exercise implements a real-time chat application using Java and demonstrates the usage of multiple design patterns like Singleton, Observer, and Adapter patterns.

Key Design Patterns:
Singleton Pattern: Used for managing the state of the chat room.
Observer Pattern: Used to notify users in real-time when a new message is received.
Adapter Pattern: Used to abstract different types of communication protocols (e.g., WebSocket).
How to Run:
Requirements:

JDK 8 or above.
An IDE like IntelliJ IDEA or Eclipse for Java development.
Command line or terminal for user input.
Steps to Run:

Clone the repository from GitHub.
Open the project in your IDE.
Run the Main.java file to start the chat application.

Directory Structure:

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

Explanation of Core Components:
ChatRoom (Singleton):
Manages the chat room creation and user management using the Singleton pattern, ensuring only one instance of the ChatRoom exists.

MessageObserver Interface:
Defines the observer pattern for receiving new messages in a chat room. All users (observers) are notified when a new message is sent.

WebSocketAdapter:
Implements an adapter for WebSocket communication. The WebSocketAdapter class adapts the CommunicationAdapter interface to simulate real-time message sending via WebSockets.

ChatRoomService:
This service handles the real-time interaction between users. It uses the observer pattern to notify users of new messages and ensures the ChatRoom class (Singleton) is used for room management.
