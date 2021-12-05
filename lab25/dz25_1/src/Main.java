import java.util.List;

public class Main {

    public static void main(String[] args) {
        List.of(
                        "0300.0000.0002.0353",
                        "0xC0.0x00.0x02.0xEB",
                        "0300.0000.0002.0353",
                        "0xC00002EB",
                        "3221226219",
                        "030000001353",
                        "NotAddress"
                ).stream().map(AddressUtils::isValidIPv4)
                .forEach(System.out::println);
    }

}
