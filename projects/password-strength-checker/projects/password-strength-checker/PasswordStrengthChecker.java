import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

     java.io.Console console = System.console();

String password;

if (console != null) {
    char[] passwordChars = console.readPassword("Enter password: ");
    password = new String(passwordChars);
} else {
    System.out.print("Enter password: ");
    password = scanner.nextLine();
}

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
int score = 0;

if (password.length() >= 8) {
    score++;
}

if (hasUppercase) {
    score++;
}

if (hasLowercase) {
    score++;
}

if (hasNumber) {
    score++;
}

if (hasSpecialCharacter) {
    score++;
}

String strength;

if (score <= 2) {
    strength = "WEAK";
} else if (score <= 4) {
    strength = "MODERATE";
} else {
    strength = "STRONG";
}

System.out.println("Score: " + score + "/5");
System.out.println("Strength: " + strength);

scanner.close();
