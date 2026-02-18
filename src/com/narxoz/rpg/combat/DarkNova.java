package com.narxoz.rpg.combat;

public class DarkNova implements Ability {
    private String name;
    private int damage;
    private String description;

    public DarkNova() {
        this.name = "Dark Nova";
        this.damage = 180;
        this.description = "Explosion of shadow energy that corrupts all enemies";
    }

    @Override
    public String getName() { return name; }

    @Override
    public int getDamage() { return damage; }

    @Override
    public String getDescription() { return description; }

    @Override
    public Ability clone() {
        DarkNova clone = new DarkNova();
        clone.name = this.name;
        clone.damage = this.damage;
        clone.description = this.description;
        return clone;
    }
}