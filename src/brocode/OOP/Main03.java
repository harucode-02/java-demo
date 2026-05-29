package brocode.OOP;

public class Main03 {
    static void main(String[] args) {
//        overloaded constructors = Allow a class to have multiple constructors
//                                  with different parameter lists.
//                                  Enable objects to be initialized in various ways.
        M03User user1 = new M03User("Spongebob");
        M03User user2 = new M03User("Patrick", "PStar@@aol.com");
        M03User user3 = new M03User("Sandy", "SCheeks@gmail.com", 27);
        M03User user4 = new M03User();


        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//
//        System.out.println(user2.username);
//        System.out.println(user2.email);
//        System.out.println(user2.age);
//
//        System.out.println(user3.username);
//        System.out.println(user3.email);
//        System.out.println(user3.age);
    }
}
