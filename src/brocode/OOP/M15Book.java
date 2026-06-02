package brocode.OOP;

public class M15Book {

    String title;
    int pages;

    M15Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + " pages)";
    }
}
