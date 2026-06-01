package brocode.OOP;

import org.w3c.dom.ls.LSOutput;

public class M05Friend {

    static int numOfFriends; // DÙNG CHUNG cho cả class
    String name;  // RIÊNG mỗi object

    M05Friend(String name) { // constructor - chạy mỗi khi new
        this.name = name;
        numOfFriends++; // tăng biến chung lên 1
    }

    static void showFriends(){
        System.out.println("You have " + numOfFriends + " total friends");
    }

}
