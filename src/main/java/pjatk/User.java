package pjatk;

public class User {
    public String name;
    public long idUs;

    public User(long idUs, String name) {
        this.name = name;
        this.idUs = idUs;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return idUs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.idUs = id;
    }


}
