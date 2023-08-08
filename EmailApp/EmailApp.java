package EmailApp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name :- ");
        String firstname = sc.nextLine();
        System.out.println("Enter the Last Name :- ");
        String lastname = sc.nextLine();
        Email em1 = new Email(firstname, lastname);
        em1.showInfo();
    }

}
