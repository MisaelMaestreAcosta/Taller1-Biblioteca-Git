package App;

public class Person {
<<<<<<< HEAD

    private String id;
    private String name;
    private String phone;

=======
    
    private String id;
    private String name;
    private String phone;
    
>>>>>>> develop
    public Person(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
<<<<<<< HEAD

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{id=" + id + ", name=" + name + ", phone=" + phone + "}";

    }
=======
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    
    @Override
    public String toString() {
        return "Person{id=" + id + ", name=" + name + ", phone=" + phone + "}";
    }
    
>>>>>>> develop
}
