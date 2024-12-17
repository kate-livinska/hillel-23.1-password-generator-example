package app;

public class Main {
    public static void main(String[] args) {
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        int length = 12;
        String newPassword = passwordGenerator.generatePassword(length);

        if (newPassword.length() == length) {
            System.out.println(newPassword);
        } else {
            System.out.println("Invalid password created");
        }
    }
}
