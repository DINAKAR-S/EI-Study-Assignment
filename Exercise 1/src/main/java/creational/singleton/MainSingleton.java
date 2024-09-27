package creational.singleton;

public class MainSingleton {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        config1.showConfiguration();
        System.out.println(config1 == config2); // This should print "true" indicating both are the same instance.
    }
}
