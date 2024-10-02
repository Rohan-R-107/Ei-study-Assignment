// Product Interface
interface Notification {
    void notifyUser();
}

// Concrete Product 1
class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification.");
    }
}

// Concrete Product 2
class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an SMS notification.");
    }
}

// Concrete Product 3
class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a push notification.");
    }
}

// Factory Class
class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type) {
            case "Email": return new EmailNotification();
            case "SMS": return new SMSNotification();
            case "Push": return new PushNotification();
            default: throw new IllegalArgumentException("Unknown notification type");
        }
    }
}

// Test the Factory Pattern
public class FactoryPattern {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("Email");
        notification.notifyUser();
        
        Notification notification2 = NotificationFactory.createNotification("SMS");
        notification2.notifyUser();
    }
}
