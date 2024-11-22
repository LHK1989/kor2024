package day23.Login.Model;

public class Dto {
    private String Id;
    private String password;

    public Dto(){}

    public Dto(String id, String password) {
        Id = id;
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public String getPassword() {
        return password;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "Id='" + Id + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
