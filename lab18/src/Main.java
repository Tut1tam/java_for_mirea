public class Main {

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        System.out.println("Division by 0");
        try {
            demo.integer_zero();
        } catch (Exception e) {
            System.out.println("Error occurred: exception called");
        } finally {
            System.out.println("Division by 0 ended\n");
        }

        System.out.println("Division by 0.0");
        try {
            demo.double_zero();
            System.out.println("Done. No errors occurred");
        } catch (Exception e) {
            System.out.println("Error occurred: exception called");
        } finally {
            System.out.println("Division by 0.0 ended\n");
        }
    }

}