package pjatk;

import java.awt.print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Bank {


    String bankId;

    private List<Account> accList = new ArrayList<>();

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

    public void accAdd(long id, String bankId) {

        Account acc1 = new Account(id, bankId);
        accList.add(acc1);

    }




}
