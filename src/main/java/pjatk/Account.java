package pjatk;
import java.lang.annotation.*;

public class Account {

    @VerifyAccount(key = 1111)
    public long id;
    public long balance;
    public String owner;

    public Account(long id, long balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public Account(long id, String bankId, String name) {
    }

    public Account(long id, String bankId) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
