package com.sunbeam.q5;

class TextAnalyzer {

    private String text;

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public void analyze() {
        int vowels = 0;
        int consonants = 0;
        int specialChars = 0;

        String str = text.toLowerCase();
        int totalChars = str.length();

        for (char ch : str.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else if (ch != ' ') {
                specialChars++;
            }
        }

        // Output counts
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        System.out.println("Special Characters: " + specialChars);

        // Statistics
        System.out.println("\nStatistics:");
        System.out.printf("Vowel Percentage      : %.2f%%\n", (vowels * 100.0) / totalChars);
        System.out.printf("Consonant Percentage  : %.2f%%\n", (consonants * 100.0) / totalChars);
        System.out.printf("Special Char Percentage: %.2f%%\n", (specialChars * 100.0) / totalChars);
    }
}

public class Program {
    public static void main(String[] args) {

        String input = "Hello Suyash! Java 123";

        TextAnalyzer analyzer = new TextAnalyzer(input);
        analyzer.analyze();
    }
}