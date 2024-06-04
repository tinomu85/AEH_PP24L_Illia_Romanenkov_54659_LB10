public class mojaDziesiataAplikacja {
    public static int[] countAndSumElements(int[] input) {
        // Sprawdzenie, czy tablica jest null lub pusta
        if (input == null || input.length == 0) {
            return new int[0]; // Zwrócenie pustej tablicy
        }

        int countNegative = 0; // Licznik liczb ujemnych
        int sumPositive = 0;   // Suma liczb dodatnich

        // Iteracja przez każdy element tablicy
        for (int number : input) {
            if (number < 0) {
                countNegative++; // Zwiększenie licznika liczb ujemnych
            } else if (number > 0) {
                sumPositive += number; // Dodanie liczby dodatniej do sumy
            }
        }

        // Zwrócenie wyniku w postaci tablicy
        return new int[] {countNegative, sumPositive};
    }

    // Przykładowe użycie
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println("Liczba ujemnych: " + result[0] + ", Suma dodatnich: " + result[1]);
    }

}

