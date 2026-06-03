package brocode.OOP;

public class M28Product<T, U> {

    T item;
    U price;

    M28Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
