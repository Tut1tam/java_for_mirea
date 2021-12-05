public class AddressUtils {

    public static boolean isValidIPv4(String address) {
        return address.matches("^(0[0-7]{10,11}|0([xX])[0-9a-fA-F]{8}|(\\b4\\d{8}[0-5]\\b|\\b[1-3]?\\d{8}\\d?\\b)|((2[0-5][0-5]|1\\d{2}|[1-9]\\d?)|(0([xX])[0-9a-fA-F]{2})|(0[0-7]{3}))(\\.((2[0-5][0-5]|1\\d{2}|\\d\\d?)|(0([xX])[0-9a-fA-F]{2})|(0[0-7]{3}))){3})$");
    }

}