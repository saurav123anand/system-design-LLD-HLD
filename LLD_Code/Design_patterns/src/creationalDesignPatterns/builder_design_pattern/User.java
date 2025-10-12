package creationalDesignPatterns.builder_design_pattern;

public class User {
    private String firstname;
    private String lastname;
    private int age;
    private String city;
    private String country;
    private int phoneNumber;

    public User(Builder builder){
        this.firstname=builder.firstname;
        this.lastname=builder.lastname;
        this.age=builder.age;
        this.city=builder.city;
        this.country=builder.country;
        this.phoneNumber=builder.phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    // static Builder class

    public static class Builder{
        private String firstname;
        private String lastname;
        private int age;
        private String city;
        private String country;
        private int phoneNumber;

        public Builder firstname(String firstname){
            this.firstname=firstname;
            return this;
        }

        public Builder lastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder phoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public User build(){
            return new User(this);
        }
    }


}
