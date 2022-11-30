import java.util.Scanner;

public class CustomerLogin {

public static void main(String[] args) {

String userName;
String passWord;

Scanner userN = new Scanner(System.in);
System.out.println("Please Enter Username : ");
userName = userN.next();

Scanner pass = new Scanner(System.in);
System.out.println("Please Enter Password : ");
passWord = pass.next();

if (userName.equals(userN) && passWord.equals(pass)){
   System.out.println("Success! Welcome!");
} 
else if (userName.equals(userN)) {
        System.out.println("Invalid Password");
} 
else if (passWord.equals(pass)) {
        System.out.println("Invalid Username");
} 
else {
        System.out.println("Invalid Username and Password");
}

}

}