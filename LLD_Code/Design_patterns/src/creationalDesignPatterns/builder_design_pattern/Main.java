package creationalDesignPatterns.builder_design_pattern;

public class Main {
    public static void main(String[] args) {
        User user=new User.Builder().firstname("saurav")
                .lastname("jha")
                .age(25)
                .country("IND")
                .build();
        System.out.println(user);

    }
}
