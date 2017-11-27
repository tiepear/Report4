public class Exception {
    public static void main(String[] args) {

        try {
            String str = "3．14";
            double value = Double.parseDouble(str);
            System.out.println(value);

        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");
            System.out.println(e.getMessage());
        }
    }
}
