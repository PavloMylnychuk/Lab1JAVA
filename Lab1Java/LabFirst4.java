// Варiант 6.

public class LabFirst4 {
    public static void main(String[] args) {
        String inputText = "Hello world, have are you today?"; // Текст.

        String[] words = inputText.split("\\s+");

        StringBuilder resultText = new StringBuilder();

        for (String word : words) {
            if (word.length() % 2 == 1) {
                int middleIndex = word.length() / 2;
                word = word.substring(0, middleIndex) + word.substring(middleIndex + 1);
            }
            resultText.append(word).append(" ");
        }

        String finalResult = resultText.toString().trim();

        System.out.println(finalResult);
    }
}
