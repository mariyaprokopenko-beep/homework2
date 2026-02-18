package com.narxoz.rpg.combat;

public class FireShield implements Ability {
    private String name;
    private int damage;
    private String description;

    public FireShield() {
        this.name = "Fire Shield";
        this.damage = 0;
        this.description = "Envelops the enemy in flames, burning attackers";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getDescription() { return description; }

    @Override
    public Ability clone() {
        FireShield clone = new FireShield();
        clone.name = this.name;
        clone.damage = this.damage;
        clone.description = this.description;
        return clone;
    }
}
