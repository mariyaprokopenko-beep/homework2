package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class FireLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;

    public FireLootTable() {
        this.items = new ArrayList<>();
        this.items.add("Fire Gem");
        this.items.add("Dragon Scale");
        this.items.add("Flame Rune");
        this.goldDrop = 500;
        this.experienceDrop = 1000;
    }

    @Override
    public List<String> getItems() { return new ArrayList<>(items); }

    @Override
    public int getGoldDrop() { return goldDrop; }

    @Override
    public int getExperienceDrop() { return experienceDrop; }

    @Override
    public String getLootInfo() {
        return "Items: " + items + ", Gold: " + goldDrop + ", XP: " + experienceDrop;
    }

    @Override
    public LootTable clone() {
        FireLootTable clone = new FireLootTable();
        clone.items = new ArrayList<>(this.items);
        clone.goldDrop = this.goldDrop;
        clone.experienceDrop = this.experienceDrop;
        return clone;
    }
}