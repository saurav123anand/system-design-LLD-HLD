package creationalDesignPatterns.prototype_design_pattern.deepCopy;

import java.util.ArrayList;
import java.util.List;

public class Character{
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
    public Character(Character other){
        this.name=other.name;
        this.level=other.level;
        this.equipment=new Equipment(other.equipment);
        this.skills=new ArrayList<>(other.skills);

    }
    public Character deepClone(){
        return new Character(this);
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
