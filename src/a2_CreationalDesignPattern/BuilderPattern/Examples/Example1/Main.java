package a2_CreationalDesignPattern.BuilderPattern.Examples.Example1;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder("John")
                .setEmail("Muhammet Kılın")
                .setEmail("muhammetgmail.com")
                .setAge(12)
                .build();

        UserValidator userValidator = new UserValidator(user);

        userValidator
                .ValidateName()
                .ValidateEmail()
                .ValidateAge()
                .Validate();

    }
}
