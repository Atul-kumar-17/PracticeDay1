public class string_comp {
    public static void main(String[] args) {
        String x = "ATUL";
        String y = "atul";
        String z = "ATUL";
        System.out.println(x.equals(y));
        //false
        System.out.println(x .equals(z));
        //true
        System.out.println(x .equalsIgnoreCase(y));

    }
}
