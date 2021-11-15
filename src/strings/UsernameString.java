package strings;

import java.util.Scanner;

/** The username consists of 8 to 30 characters inclusive: {7,29}
 *  The username can only contain alphanumeric characters and underscores (_).
 *  Alphanumeric characters describe the character set consisting of lowercase characters ,
 *  uppercase characters , and digits . : (\w)
 *  The first character of the username must be an alphabetic character, : ^[a-zA-Z]
 */

class UsernameValidator{
   public static final String regularExpression = "^[a-zA-Z](\\w){7,29}";
}

public class UsernameString {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}
