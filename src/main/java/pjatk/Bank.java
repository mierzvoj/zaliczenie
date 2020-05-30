package pjatk;

import java.awt.print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bank {


    String bankId;
    User u1 = new User(1111, "Mark");

    public List<Account> accList = new ArrayList<>();

    public Bank(String bankId) {

        this.bankId = bankId;
    }

    public Bank(List<Account> accList) {
        this.accList = accList;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId() {
        this.bankId = bankId;
    }

    public List<Account> findAllAccounts() {
        return this.accList;

    }

    public void accAdd(long id, String bankId, String owner) {

        Account acc1 = new Account(id, bankId, owner);
        accList.add(acc1);

    }

    public Optional<Account> findById(long id) {
        return accList.stream().filter(acc -> acc.getId() == id).findFirst();


    }

    public List<Account> findAllAcc() {
        return this.accList;

    }


}