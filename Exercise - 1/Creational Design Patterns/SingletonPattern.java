// Singleton Class
class ConfigurationManager {
    private static ConfigurationManager instance;
    private String config;

    private ConfigurationManager() {
        // private constructor to restrict instantiation
        config = "AppConfig";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }
}

// Test the Singleton Pattern
public class SingletonPattern {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        
        System.out.println(config1.getConfig()); // Output: AppConfig
        System.out.println(config1 == config2);  // Output: true (both are the same instance)
    }
}
