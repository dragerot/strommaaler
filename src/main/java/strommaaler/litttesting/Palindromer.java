package strommaaler.litttesting;

public class Palindromer {

    public static boolean validePalindromer(String arg) {
        if (arg.length() % 2 != 0) {
            int length = arg.length();
            int deLenght = length-1;
            int middle = (arg.length() - 1) / 2;
            for (int i = 0; i < middle; i++) {
                if (arg.charAt(i) != arg.charAt(deLenght- i)) {
                    return false;
                }
            }
           return true;
        }
        return false;
    }

    public static boolean palindromer(String arg) {
        return validePalindromer(arg);
    }
}
