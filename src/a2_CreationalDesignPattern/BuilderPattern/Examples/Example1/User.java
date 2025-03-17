package a2_CreationalDesignPattern.BuilderPattern.Examples.Example1;

public class User {
    public  String name;
    public String email;
    public int age;

    public User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
    }

    public static class UserBuilder {

        private String name;
        private String email;
        private int age;

        public UserBuilder(String name) {
            this.name = name;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
