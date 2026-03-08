package com.monsterevolution;

public class MonsterStats {

    private int swordKills;
    private int bowKills;
    private int fireKills;

    public MonsterStats() {
        swordKills = 0;
        bowKills = 0;
        fireKills = 0;
    }

    public void addSwordKill() {
        swordKills++;
    }

    public void addBowKill() {
        bowKills++;
    }

    public void addFireKill() {
        fireKills++;
    }

    public int getSwordKills() {
        return swordKills;
    }

    public int getBowKills() {
        return bowKills;
    }

    public int getFireKills() {
        return fireKills;
    }
}