public class TypeCasting {
    public static void main(String[] args){
        int myInt = 100;
        double myDouble = myInt;
        float myFloat = 8.5f;
        double floatToDouble = myFloat;
        float intToFloat = myInt;

        System.out.println("Float to Double: " + floatToDouble);
        System.out.println("Int to Float" +intToFloat);

        char myChar = 'A';
        int charToInt = myChar;
        float charToFloat = myChar;

        System.out.println("Char value is: "+myChar);
        System.out.println("Char to Int: " +charToInt);
        System.out.println("Char to Float: "+charToFloat);

        double myDouble1 = 7.3;
        float doubleToFloat = (float) myDouble1;
        int doubleToInt = (int) myFloat;

        System.out.println("Double to Float: " + floatToDouble);
        System.out.println("Double to Int: "+ doubleToInt);

        char intToChar = (char) myInt;

        System.out.println("Int to Char: "+ intToChar);
    }
}
