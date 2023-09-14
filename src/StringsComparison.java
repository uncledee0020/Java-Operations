public class StringsComparison {
    public static void main(String[] args){

        String x="Java";
        String y="Beverage";

        System.out.println("x.equals(\"Java\"): "+ x.equals("Java"));
        System.out.println("x.equals(\"java\"):\t" +(x.equals("java")));
        System.out.println("x.equals(y); " + (x.equals(y)));
        System.out.println("x.equalsIgnoreCase(\"java\"); " + (x.equalsIgnoreCase("java")));
        System.out.println("!x.equalsIgnoreCase(\"java\"): "+ (!x.equalsIgnoreCase("java")));

        System.out.format("\nFinal x =%s \t Final y = %s", x, y);

    }
}
