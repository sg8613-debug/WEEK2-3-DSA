import java.util.ArrayList;

public class SortingService {

    // 🔹 Bubble Sort (by fee ASC)
    public static void bubbleSort(ArrayList<Transaction> list) {
        int n = list.size();
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j).fee > list.get(j + 1).fee) {
                    // swap
                    Transaction temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    swapped = true;
                }
            }

            // optimization
            if (!swapped) break;
        }
    }

    // 🔹 Insertion Sort (fee + timestamp)
    public static void insertionSort(ArrayList<Transaction> list) {
        for (int i = 1; i < list.size(); i++) {
            Transaction key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                    (list.get(j).fee > key.fee ||
                     (list.get(j).fee == key.fee &&
                      list.get(j).timestamp.compareTo(key.timestamp) > 0))) {

                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }

    // 🔹 Outlier Detection
    public static void detectOutliers(ArrayList<Transaction> list) {
        System.out.println("\nHigh Fee Transactions (>50):");

        boolean found = false;

        for (Transaction t : list) {
            if (t.fee > 50) {
                System.out.println(t);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No outliers found");
        }
    }
}