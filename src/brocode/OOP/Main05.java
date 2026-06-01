package brocode.OOP;

public class Main05 {
    static void main(String[] args) {
//        static = Makes a variable or method belong to the class
//        rather than to any specific object.
//        Commonly used for utility methods or shared resources.

//        Math.round(3.99);

        M05Friend friend1 = new M05Friend("Spongebob"); // this.name = "Spongebob" → object friend1 có name riêng
        M05Friend friend2 = new M05Friend("Patrick"); // friend2 có name riêng = "Patrick"
        M05Friend friend3 = new M05Friend("Squidward"); // Dòng 13, 14, 15: tạo thêm Squidward, Sandy, Gary
        M05Friend friend4 = new M05Friend("Sandy"); // Mỗi lần new, constructor lại chạy numOfFriends++.
        M05Friend friend5 = new M05Friend("Gary");

        M05Friend.showFriends();
//        System.out.println(M05Friend.numOfFriends);
    }
}
