package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class IceLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;

    public IceLootTable() {
        this.items = new ArrayList<>();
        this.items.add("Ice Gem");
        this.items.add("Frost Scale");
        this.items.add("Ice Rune");
        this.goldDrop = 450;
        this.experienceDrop = 900;
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
        IceLootTable clone = new IceLootTable();
        clone.items = new ArrayList<>(this.items);
        clone.goldDrop = this.goldDrop;
        clone.experienceDrop = this.experienceDrop;
        return clone;
    }
}