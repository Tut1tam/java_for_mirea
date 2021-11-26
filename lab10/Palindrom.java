package lab10;

public class Palindrom {
    public static String recursion(String s) {
        if (s.length() == 1) {
            return "YES";
        } else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1, s.length()))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion(s.substring(1, s.length() - 1));
            } else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion("radar"));
    }
}
