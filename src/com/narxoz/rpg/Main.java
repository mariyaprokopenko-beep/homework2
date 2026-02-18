package com.narxoz.rpg;

import com.narxoz.rpg.enemy.*;
import com.narxoz.rpg.combat.*;
import com.narxoz.rpg.loot.*;
import com.narxoz.rpg.factory.*;
import com.narxoz.rpg.builder.*;
import com.narxoz.rpg.prototype.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("RPG Enemy System\n");

        System.out.println("1. ABSTRACT FACTORY");
        EnemyComponentFactory fireFactory = new FireComponentFactory();
        System.out.println("Fire Factory OK");

        System.out.println("\n2. BUILDER");
        BossEnemyBuilder builder = new BossEnemyBuilder();
        Enemy dragon = builder
                .setName("Fire Dragon")
                .setHealth(1000)
                .setDamage(50)
                .setDefense(20)
                .setSpeed(30)
                .setElement("FIRE")
                .build();
        System.out.println("Dragon created");

        System.out.println("\n3. PROTOTYPE");
        EnemyRegistry registry = new EnemyRegistry();
        registry.registerTemplate("dragon", dragon);
        Enemy clone = registry.createFromTemplate("dragon");
        System.out.println("Clone created");

        System.out.println("\nDONE!");
    }
}