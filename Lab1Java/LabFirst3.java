//Варiант 17.

public class LabFirst3 {
    public static void main(String[] args) {
        int n = 20; // Масив чисел.
        int[][] M = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                M[i][j] = n + j; // Замiнити значення.
            }
        }

        boolean found = false;

        int[] rowSums = new int[n];
        int[] colSums = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += M[i][j];
                colSums[j] += M[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (rowSums[i] == colSums[j]) {
                    System.out.println(
                            "Рядок " + (i + 1) + " i стовпець " + (j + 1) + " мають однакову суму: " + rowSums[i]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Немає рядкiв i стовпцiв iз однаковими сумами.");
        }
    }
}
