package users;

public class User {
    protected String nama;
    protected String id;

    public User(String nama, String id) {
        this.nama = nama;
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public String getId() {
        return id;
    }
}
