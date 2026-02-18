package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DragonBoss extends AbstractEnemy {
    private Map<Integer, Integer> phases;
    private boolean canFly;
    private boolean hasBreathAttack;
    private int wingspan;

    public DragonBoss(String name) {
        super(name);
        this.phases = new HashMap<>();
        this.canFly = true;
        this.hasBreathAttack = true;
        this.wingspan = 20;
        this.abilities = new ArrayList<>();
    }

    DragonBoss(String name, int health, int damage, int defense, int speed,
               String element, String aiBehavior,
               Map<Integer, Integer> phases,
               boolean canFly, boolean hasBreathAttack, int wingspan) {
        super(name);
        this.health = health;
        this.damage = damage;
        this.defense = defense;
        this.speed = speed;
        this.element = element;
        this.aiBehavior = aiBehavior;
        this.phases = phases != null ? new HashMap<>(phases) : new HashMap<>();
        this.canFly = canFly;
        this.hasBreathAttack = hasBreathAttack;
        this.wingspan = wingspan;
        this.abilities = new ArrayList<>();
    }

    public void setAbilitiesFromFactory(java.util.List<Ability> abilities) {
        this.abilities = new ArrayList<>(abilities);
    }

    public void setLootTableFromFactory(LootTable lootTable) {
        this.lootTable = lootTable;
    }

    public void addPhase(int phaseNumber, int threshold) {
        this.phases.put(phaseNumber, threshold);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Boss Phases: " + phases.size());
        for (Map.Entry<Integer, Integer> phase : phases.entrySet()) {
            System.out.println("  Phase " + phase.getKey() + ": triggers at " + phase.getValue() + " HP");
        }
        System.out.println("Can Fly: " + canFly + " | Breath Attack: " + hasBreathAttack +
                " | Wingspan: " + wingspan);
    }

    @Override
    public Enemy clone() {
        DragonBoss clone = new DragonBoss(this.name);
        clone.health = this.health;
        clone.damage = this.damage;
        clone.defense = this.defense;
        clone.speed = this.speed;
        clone.element = this.element;
        clone.aiBehavior = this.aiBehavior;
        clone.phases = new HashMap<>(this.phases);
        clone.canFly = this.canFly;
        clone.hasBreathAttack = this.hasBreathAttack;
        clone.wingspan = this.wingspan;

        clone.abilities = new ArrayList<>();
        for (Ability ability : this.abilities) {
            clone.abilities.add(ability.clone());
        }

        if (this.lootTable != null) {
            clone.lootTable = this.lootTable.clone();
        }

        return clone;
    }
}