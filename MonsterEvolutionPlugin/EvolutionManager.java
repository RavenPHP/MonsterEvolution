package com.monsterevolution;

public class EvolutionManager {

    private MonsterStats stats;
    private MutationSystem mutationSystem;

    public EvolutionManager() {
        stats = new MonsterStats();
        mutationSystem = new MutationSystem();
    }

    public void recordKill(String damageType) {

        switch (damageType) {
            case "SWORD":
                stats.addSwordKill();
                break;

            case "BOW":
                stats.addBowKill();
                break;

            case "FIRE":
                stats.addFireKill();
                break;
        }

        checkEvolution();
    }

    private void checkEvolution() {

        if(stats.getSwordKills() > 50) {
            mutationSystem.enableMutation("MELEE_RESISTANCE");
        }

        if(stats.getBowKills() > 50) {
            mutationSystem.enableMutation("PROJECTILE_RESISTANCE");
        }

        if(stats.getFireKills() > 50) {
            mutationSystem.enableMutation("FIRE_IMMUNITY");
        }

    }

    public MutationSystem getMutationSystem() {
        return mutationSystem;
    }
}