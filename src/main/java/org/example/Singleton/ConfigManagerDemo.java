package org.example.Singleton;



public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.printAllConfigs();

        ConfigurationManager configAdmin = ConfigurationManager.getInstance();
        configAdmin.setConfiguration("maxPlayers", "200");
        configAdmin.setConfiguration("defaultLanguage", "fr");
        configAdmin.setConfiguration("gameDifficulty", "hard");

        System.out.println("----------");
        configManager.printAllConfigs();
    }
}
