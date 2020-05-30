package pjatk;
import java.lang.annotation.*;
import java.math.*;

public class Account {

    @VerifyAccount(key = 1111)
    public long id;
    public BigDecimal balance;
    public String owner;

    public Account(long id, BigDecimal balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }



    public Account(long id, String bankId, String name) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
