package brocode.OOP;

import org.w3c.dom.ls.LSOutput;

public class M05Friend {

    static int numOfFriends;
    String name;

    M05Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }

}
