package brocode.OOP;

public class Main15 {
    static void main(String[] args) {
//        Aggregation = Represents a "has-a" relationship between objects.
//                      One object contains another object as part of its structure,
//                      but the contained object/s can exist independently.

        M15Book book1 = new M15Book("The Fellow of the Ring", 423);
        M15Book book2 = new M15Book("The Two Towers", 352);
        M15Book book3 = new M15Book("The Return of the King", 416);

        M15Book[] books = {book1, book2, book3};

        M15Library library = new M15Library("NYC Public Library", 1897, books);

        library.displayInfo();
//        for(M15Book book : books){
//            System.out.println(book.displayInfo());
//        }
//        System.out.println(book3.displayInfo());

    }
}
