package pjatk;

import java.awt.print.*;
import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BankService {


    Bank b1 = new Bank("bbbb");


    public BankService(Bank b1) {
        this.b1 = b1;
    }


    public BigDecimal accountBalance(User user, Bank b1) {

        User u1 = new User(111, "John");
        Account a1 = new Account(111111111,"bankid", "John");

        b1.findById(11111111);
        return a1.getBalance();

    }




}
