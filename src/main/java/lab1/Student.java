package lab1;

public class Student {
    private String guid;
    private String first_name;
    private String last_name;
    private String email;
    
    public Student(
     String guid,
     String first_name,
     String last_name,
     String email) {
     this.guid = guid;
     this.first_name = first_name;
     this.last_name = last_name;
     this.email = email;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
