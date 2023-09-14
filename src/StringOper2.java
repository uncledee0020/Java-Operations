public class StringOper2 {
    public static void main(String[] args){
        String phrase="   Live and let live!  ";

        System.out.println("The original string is: "+phrase);
        System.out.println("The length of the string is: "+phrase.length());
        System.out.println("The string in uppercase is: "+phrase.toUpperCase());
        System.out.println("The string to lowercase is: "+phrase.toLowerCase());
        System.out.println("The trimmed string is: "+phrase.trim());
        System.out.println("\nWhat is the location of the first 'v'? The index of 'v' is: "+phrase.indexOf('v'));
        System.out.println("\nWhat is the location of 'x'? The index of 'x' is: "+phrase.indexOf('x'));
        //'x' is not found in the string hence -1 is returned. Note that indexing starts at 0
        System.out.println("\nWhat is the location of the last 'v'? The index of 'v' is: "+phrase.lastIndexOf('v'));
        System.out.println("\nWhich character is found at index 10? : "+phrase.charAt(10));
        System.out.println("\nWhich character is found at index 40? : "+phrase.charAt(40));

    }
}
