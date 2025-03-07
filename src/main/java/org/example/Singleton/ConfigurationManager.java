package org.example.Singleton;

import java.util.HashMap;
import java.util.Map;

class ConfigurationManager {
    private static ConfigurationManager instance;
    private final Map<String, String> configurations;

    private ConfigurationManager() {
        configurations = new HashMap<>();
        configurations.put("maxPlayers", "100");
        configurations.put("defaultLanguage", "en");
        configurations.put("gameDifficulty", "medium");
    }

    public static synchronized ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    public String getConfiguration(String key) {
        return configurations.getOrDefault(key, "Not found");
    }

    public void printAllConfigs() {
        configurations.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
