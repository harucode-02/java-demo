package brocode.basics;
import java.util.Scanner;

public class Substrings {
    static void main(String[] args) {
        // substring() = A method used to extract a portion of a string
        //               substring(start, end)
        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your mail: ");
//        String email = "Bro123@gmail.com";
//        String username = email.substring(0, 6);
//        String domain = email.substring(7);

        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") + 1);

            System.out.println(username);
            System.out.println(domain);
        }
        else{
            System.out.println("Emails must contain @");
        }
          scanner.close();
//        username = email.substring(0, email.indexOf("@"));
//        domain = email.substring(email.indexOf("@") + 1);
//
//        System.out.println(username);
//        System.out.println(domain);

//        String email = "BroCode1@gmail.com";
//        String username = email.substring(0, email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@") + 1);\
    }
}
