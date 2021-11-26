package lab23;



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        ArrayList<String> germany = new ArrayList<String>();
        ArrayList<String> usa = new ArrayList<String>();
        ArrayList<String> russia = new ArrayList<String>();

        germany.add("Berlin");
        germany.add("Munhen");
        germany.add("Shtutgart");

        usa.add("New York");
        usa.add("Washington");
        usa.add("Yel");

        russia.add("Moscow");
        russia.add("Serpukhov");
        russia.add("Kremenki");


        map.put("Germany", germany);
        map.put("Usa", usa);
        map.put("Russia", russia);

        Set<String> keys = map.keySet();

    }
}
