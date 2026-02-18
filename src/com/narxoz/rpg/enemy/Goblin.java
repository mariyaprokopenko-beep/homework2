package com.narxoz.rpg.enemy;

import com.narxoz.rpg.combat.Ability;
import com.narxoz.rpg.loot.LootTable;
import java.util.ArrayList;

public class Goblin extends AbstractEnemy {

    public Goblin(String name) {
        super(name);
        this.health = 100;
        this.damage = 15;
        this.defense = 5;
        this.speed = 35;
        this.element = "None";
        this.aiBehavior = "BASIC";
        this.abilities = new ArrayList<>();
    }

    @Override
    public Enemy clone() {
        Goblin clone = new Goblin(this.name);
        clone.health = this.health;
        clone.damage = this.damage;
        clone.defense = this.defense;
        clone.speed = this.speed;
        clone.element = this.element;
        clone.aiBehavior = this.aiBehavior;

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