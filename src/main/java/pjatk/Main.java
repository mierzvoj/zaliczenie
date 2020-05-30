package pjatk;

import javax.validation.*;
import java.awt.print.*;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {

        User u1 = new User(111, "John");
        Account a1 = new Account(111111, 111111, "John");



        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        Set<ConstraintViolation<Account>> validate = validator.validate(a1);
        System.out.println(validate);


    }
}
