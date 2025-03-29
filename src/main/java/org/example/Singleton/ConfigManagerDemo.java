package org.example.Singleton;



public class ConfigManagerDemo {
    public static void main(String[] args) {
        ConfigurationManager configManager = ConfigurationManager.getInstance();

        configManager.printAllConfigs();


        configManager.setConfiguration("maxPlayers", "200");
        configManager.setConfiguration("defaultLanguage", "fr");
        configManager.setConfiguration("gameDifficulty", "hard");



        System.out.println("----------");
        configManager.printAllConfigs();
    }
}
