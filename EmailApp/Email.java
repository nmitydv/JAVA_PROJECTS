package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private String email;
    private String department;
    private int defaultPasswordlength = 8;
    private int mailboxcapacity = 500;
    private String alternateEmail;
    private String companySuffix = "priti'scompany.com";

    // Constructor to receive the first name and l ast name
    public Email(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        System.out.println("Email Created : " + this.firstname + " " + this.lastname);
        // Call a method asking for the department - return the department
        this.department = setdepartment();

        // Call a method that return a random password
        this.password = randompassword(defaultPasswordlength);
        System.out.println("Your password is :- " + this.password);

        // Combine elements to generate email
        this.email = firstname.toLowerCase() + "." + lastname.toLowerCase() + "@" + department + companySuffix;
        System.out.println("your email is : " + email);
    }

    // Ask for the department
    private String setdepartment() {
        System.out.println(
                "Department Codes :- \n 1 for Sales \n 2 for Developer \n 3 for Accounting \n 0 for none \n Enter the Department code");
        Scanner sc = new Scanner(System.in);
        int depc = sc.nextInt();
        if (depc == 1) {
            return "Sales";
        } else if (depc == 2) {
            return "Developer";
        } else if (depc == 3) {
            return "Accounting";
        } else {
            return " ";
        }
    }

    // Generate a random password
    private String randompassword(int length) {
        String passwordSet = "AB01234756789!@#$%&*";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * password.length);
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set the mailbox capacity
    public void setmailboxcapacity(int capacity) {
        this.mailboxcapacity = altEmail;
    }

    // Change the password
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getmailboxcapacity() {
        return mailboxcapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getchangepassword() {
        return password;
    }

    public void showInfo() {
        System.out.println("\n");
        System.out.println(
                "========================================================" + "\n"
                        + "                       INFORMATION " + "\n" +
                        "========================================================" +
                        "\n" +
                        "Name :-    " + this.firstname + this.lastname + "\n" +
                        "Email :-   " + this.email + "\n" +
                        "Password :- " + this.password + "\n" +
                        "Department :- " + this.department + "\n" +
                        "MailboxCapacity :- " + mailboxcapacity);
    }
}
