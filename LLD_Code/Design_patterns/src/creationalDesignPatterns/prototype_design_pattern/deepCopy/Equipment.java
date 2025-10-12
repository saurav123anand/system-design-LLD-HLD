package creationalDesignPatterns.prototype_design_pattern.deepCopy;

class Equipment {
    String weapon;
    String armor;

    public Equipment(String weapon, String armor) {
        this.weapon = weapon;
        this.armor = armor;
    }
    public Equipment(Equipment other){
        this.weapon=other.weapon;
        this.armor=other.armor;
    }

    @Override
    public String toString() {
        return "Equipment{weapon='" + weapon + "', armor='" + armor + "'}";
    }
}