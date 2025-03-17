package a2_CreationalDesignPattern.BuilderPattern.Examples.Example1;

import java.util.ArrayList;
import java.util.List;

public class UserValidator {
    private  User user;
    private List<String> erros = new ArrayList<>();

    public UserValidator(User user) {
        this.user = user;
    }

    public  UserValidator ValidateName(){
        if(user.name == null || user.name.isEmpty()) {
            erros.add("Name is required");
        }
        return this;
    }
    public  UserValidator ValidateEmail(){
        if(user.email == null || user.email.isEmpty()) {
            erros.add("Email is required");
        }
        if(!user.email.contains("@")) {
            erros.add("Email is invalid");
        }
        return this;
    }

    public  UserValidator ValidateAge(){
        if(user.age < 18) {
            erros.add("Age must be greater than 18");
        }
        return this;
    }

    public  void Validate() {
        if(!erros.isEmpty()) {
            for (String error : erros) {
                System.out.println(error);
            }
        } else {
            System.out.println("User is valid");
        }
    }
}
