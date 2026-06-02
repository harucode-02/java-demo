package brocode.OOP;

public class M15Library {
    String name;
    int year;
    M15Book[] books;

    M15Library(String name, int year, M15Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(M15Book book : books){
            System.out.println(book.displayInfo());
        }
    }
}
