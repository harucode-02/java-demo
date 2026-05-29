package brocode.OOP;

public class M03User {

    String username;
    String email;
    int age;

    M03User(){
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    M03User(String username){
        this.username = username;
        this.email = "Not provided";
        this.age = 0;
    }
    M03User(String username, String email){
        this.username = username;
        this.email = email;
        this.age = 0;
    }
    M03User(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
    }
}
