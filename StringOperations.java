public class StringOperations {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenation: " + result);

        // Length
        System.out.println("Length of str1: " + str1.length());

        // Comparison
        System.out.println("Are strings equal? " + str1.equals(str2));

        // Substring
        System.out.println("Substring of str1 (1–4): " + str1.substring(1, 4));

        // Change case
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str2.toLowerCase());

        // Character at index
        System.out.println("Character at index 2 of str1: " + str1.charAt(2));
    }
}
