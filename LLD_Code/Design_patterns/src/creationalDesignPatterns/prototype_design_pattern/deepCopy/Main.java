package creationalDesignPatterns.prototype_design_pattern.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Equipment sword = new Equipment("Excalibur", "Dragon Armor");
        List<String> skills = new ArrayList<>();
        skills.add("Fireball");
        skills.add("Heal");

        Character hero1 = new Character("Knight", 15, sword, skills);
        Character hero2 = hero1.deepClone();

        System.out.println("Before modification:");
        System.out.println("Original: " + hero1);
        System.out.println("Clone:    " + hero2);

        // Modify the clone
        hero2.equipment.weapon = "Shadow Blade";
        hero2.skills.add("Lightning Strike");

        System.out.println("\nAfter modifying clone:");
        System.out.println("Original: " + hero1);
        System.out.println("Clone:    " + hero2);
    }
}
