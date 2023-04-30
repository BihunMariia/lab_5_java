package ua.lviv.iot;

import java.util.Scanner;

public class ReverseQuestionSentences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть речення: ");
        String sentence = scanner.nextLine();
        System.out.print("Введіть мінімальну кількість слів у запитальних реченнях: ");
        int minWords = scanner.nextInt();
        String[] sentences = sentence.split("\\.");
        StringBuilder reversedSentences = new StringBuilder();

        for (String s : sentences) {
            String trimmedSentence = s.trim();
            if (trimmedSentence.endsWith("?")) {
                String[] words = trimmedSentence.split(" ");
                if (words.length > minWords) {
                    for (int i = words.length - 1; i >= 0; i--) {
                        reversedSentences.append(words[i]);
                        reversedSentences.append(" ");
                    }
                } else {
                    reversedSentences.append(trimmedSentence);
                }
            } else {
                reversedSentences.append(trimmedSentence);
            }
            reversedSentences.append(". ");
        }

        System.out.println("Зворотні речення: ");
        System.out.println(reversedSentences.toString());
    }
}
