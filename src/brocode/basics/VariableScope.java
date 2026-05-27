package brocode.basics;

public class VariableScope {

    static int x = 3;
    static void main(String[] args) {

        // variable scope = where a variable can be assessed

        int x = 1; //LOCAL

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){

        int x = 2; //LOCAL

        System.out.println(x);
    }
}
