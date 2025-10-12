package creationalDesignPatterns.prototype_design_pattern.shallowCopy;

class Equipment {
    String weapon;
    String armor;

    public Equipment(String weapon, String armor) {
        this.weapon = weapon;
        this.armor = armor;
    }

    @Override
    public String toString() {
        return "Equipment{weapon='" + weapon + "', armor='" + armor + "'}";
    }
}