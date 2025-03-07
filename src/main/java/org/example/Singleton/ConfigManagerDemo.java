package org.example.Singleton;



public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        System.out.println("maxPlayers: " + configManager.getConfiguration("maxPlayers"));
        configManager.printAllConfigs();
    }
}
