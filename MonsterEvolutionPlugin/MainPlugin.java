package com.monsterevolution;

public class MainPlugin {

    private static MainPlugin instance;
    private EvolutionManager evolutionManager;

    public void onEnable() {
        instance = this;

        evolutionManager = new EvolutionManager();

        System.out.println("MonsterEvolutionPlugin enabled!");
    }

    public void onDisable() {
        System.out.println("MonsterEvolutionPlugin disabled!");
    }

    public static MainPlugin getInstance() {
        return instance;
    }

    public EvolutionManager getEvolutionManager() {
        return evolutionManager;
    }
}