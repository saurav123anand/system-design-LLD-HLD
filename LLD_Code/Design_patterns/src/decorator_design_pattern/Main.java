package decorator_design_pattern;

public class Main {
    public static void main(String[] args) {
        // margherita+extraCheese
        BasePizza extraCheese = new ExtraCheese(new MargheritaPizza());
        System.out.println(extraCheese.cost());

        // margherita+extraCheese+mushroom
        BasePizza mushroomExtraCheese = new Mushroom(new
                ExtraCheese(new MargheritaPizza()));
        System.out.println(mushroomExtraCheese.cost());

    }
}
