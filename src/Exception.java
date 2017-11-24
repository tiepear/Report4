public class Exception {
    public static void main(String[] args){

        try {
            String str = null;
            System.out.print(str.length());

        }catch (NullPointerException e) {
            System.out.println("NullPointerException occurred.");
            System.out.println(e.getMessage());
        }
    }
}
