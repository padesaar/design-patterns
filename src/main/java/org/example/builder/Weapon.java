package org.example.builder;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
    private String type;
    private String name;
    private int damage;
    private long durability;
    private List<String> perks;

    Weapon(String type, String name, int damage, long durability, List<String> perks){
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.durability = durability;
        this.perks = perks;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public long getDurability() {
        return durability;
    }

    public void setDurability(long durability) {
        this.durability = durability;
    }

    public List<String> getPerks() {
        return perks;
    }

    public void setPerks(List<String> perks) {
        this.perks = perks;
    }


}
