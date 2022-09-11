package section07;

public class StringFunctions {
    public static void main(String[] args) {
        String string = " abcde FGHIJ ABC abc DEFG             ";

        String stringLower = string.toLowerCase();
        String stringUpper = string.toUpperCase();
        String stringTrim = string.trim();
        String substringFrom2 = stringTrim.substring(2);
        String substringAt2To9 = stringTrim.substring(2, 9);
        String stringReplace = stringTrim.replace('a', 'x');
        String substringReplace = stringTrim.replace("abc", "xy");

        int bcFirstIndex = stringTrim.indexOf("bc");
        int bcLastIndex = stringTrim.lastIndexOf("bc");

        System.out.println("Original string: |" + string + "|");
        System.out.println("Lower string: |" + stringLower + "|");
        System.out.println("Upper string: |" + stringUpper + "|");
        System.out.println("Trim string: |" + stringTrim + "|");
        System.out.println("Substring from 2: |" + substringFrom2 + "|");
        System.out.println("Substring at 2 to 9: |" + substringAt2To9 + "|");
        System.out.println("Replace string: |" + stringReplace + "|");
        System.out.println("Replace substring: |" + substringReplace + "|");
        System.out.println("First index of 'bc': " + bcFirstIndex);
        System.out.println("Last index of 'bc': " + bcLastIndex);
        System.out.println("-------------------\n");

        String stringVector = "potato apple lemon orange";

        String[] vector = stringVector.split(" ");

        System.out.println(stringVector);
        System.out.println(vector[0]);
        System.out.println(vector[1]);
        System.out.println(vector[2]);
        System.out.println(vector[3]);
    }
}
