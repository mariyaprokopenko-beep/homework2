package com.narxoz.rpg.combat;

public class Blizzard implements Ability {
    private String name;
    private int damage;
    private String description;

    public Blizzard() {
        this.name = "Blizzard";
        this.damage = 120;
        this.description = "Massive snowstorm that damages and freezes enemies";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getDescription() { return description; }

    @Override
    public Ability clone() {
        Blizzard clone = new Blizzard();
        clone.name = this.name;
        clone.damage = this.damage;
        clone.description = this.description;
        return clone;
    }
}