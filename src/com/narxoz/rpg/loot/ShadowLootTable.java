package com.narxoz.rpg.loot;

import java.util.ArrayList;
import java.util.List;

public class ShadowLootTable implements LootTable {
    private List<String> items;
    private int goldDrop;
    private int experienceDrop;

    public ShadowLootTable() {
        this.items = new ArrayList<>();
        this.items.add("Shadow Gem");
        this.items.add("Dark Essence");
        this.items.add("Shadow Rune");
        this.goldDrop = 600;
        this.experienceDrop = 1200;
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
        ShadowLootTable clone = new ShadowLootTable();
        clone.items = new ArrayList<>(this.items);
        clone.goldDrop = this.goldDrop;
        clone.experienceDrop = this.experienceDrop;
        return clone;
    }
}