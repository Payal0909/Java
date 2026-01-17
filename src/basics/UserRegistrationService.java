package basics;

public class UserRegistrationService {

    public static void main(String[] args) {
        String userName = "Payal";
        boolean isEmailVerified = true;
        int age = 25;

        if(validateAge(age) && validateEmail(isEmailVerified))
        {
            registerUser("Payal");
        }
        else
        {
            System.out.println("Validations Failed");
        }
    }

    public static boolean validateEmail(boolean isEmailVerified) {
        return isEmailVerified;
    }

    public static boolean validateAge(int age) {
        return age>=18;
    }

    public static void registerUser(String userName) {
        System.out.println("User "+userName+" registered successfully");
    }
}
