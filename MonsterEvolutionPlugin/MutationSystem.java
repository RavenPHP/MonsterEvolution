package com.monsterevolution;

import java.util.HashSet;
import java.util.Set;

public class MutationSystem {

    private Set<String> activeMutations;

    public MutationSystem() {
        activeMutations = new HashSet<>();
    }

    public void enableMutation(String mutation) {

        if(!activeMutations.contains(mutation)) {
            activeMutations.add(mutation);
            System.out.println("New monster evolution unlocked: " + mutation);
        }

    }

    public boolean hasMutation(String mutation) {
        return activeMutations.contains(mutation);
    }

}