import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        boolean hasSpecialCharacter = false;

        for (char character : password.toCharArray()) {

            if (Character.isUpperCase(character)) {
                hasUppercase = true;
            }

            if (Character.isLowerCase(character)) {
                hasLowercase = true;
            }

            if (Character.isDigit(character)) {
                hasNumber = true;
            }

            if (!Character.isLetterOrDigit(character)) {
                hasSpecialCharacter = true;
            }
        }

        System.out.println("\nPassword Analysis");
        System.out.println("-----------------");

        System.out.println("Length: " + password.length());
        System.out.println("Uppercase: " + hasUppercase);
        System.out.println("Lowercase: " + hasLowercase);
        System.out.println("Number: " + hasNumber);
        System.out.println("Special Character: " + hasSpecialCharacter);

        scanner.close();
    }
}
