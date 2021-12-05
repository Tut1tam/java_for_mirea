public class ExpressionUtils {

    public static boolean isBracketsBalanced(String expression) {
        int value = 0;
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(') {
                value += 1;
            } else if (expression.charAt(i) == ')') {
                value -= 1;
            }
            if (value < 0) {
                return false;
            }
        }
        return value == 0;
    }

}