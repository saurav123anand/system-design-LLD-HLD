package creationalDesignPatterns.prototype_design_pattern.shallowCopy;

import java.util.List;

public class Character implements Cloneable{
    private String name;
    private int level;
    Equipment equipment;
    List<String> skills;

    public Character(String name, int level, Equipment equipment, List<String> skills) {
        this.name = name;
        this.level = level;
        this.equipment = equipment;
        this.skills = skills;
    }

    @Override
    protected Character clone() throws CloneNotSupportedException {
        return (Character)super.clone();
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", equipment=" + equipment +
                ", skills=" + skills +
                '}';
    }
}
