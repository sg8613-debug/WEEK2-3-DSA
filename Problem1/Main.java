import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 🔹 Original Data
        ArrayList<Transaction> list1 = new ArrayList<>();
        list1.add(new Transaction("T1", 10.5, "10:00"));
        list1.add(new Transaction("T2", 25.0, "09:30"));
        list1.add(new Transaction("T3", 5.0, "10:15"));
        list1.add(new Transaction("T4", 60.0, "11:00"));
        list1.add(new Transaction("T5", 25.0, "08:45"));

        // Copy list for second sorting
        ArrayList<Transaction> list2 = new ArrayList<>(list1);

        // 🔹 Print Original
        System.out.println("Original Transactions:");
        for (Transaction t : list1) {
            System.out.println(t);
        }

        // 🔹 Bubble Sort
        SortingService.bubbleSort(list1);
        System.out.println("\nAfter Bubble Sort (by Fee):");
        for (Transaction t : list1) {
            System.out.println(t);
        }

        // 🔹 Insertion Sort
        SortingService.insertionSort(list2);
        System.out.println("\nAfter Insertion Sort (Fee + Timestamp):");
        for (Transaction t : list2) {
            System.out.println(t);
        }

        // 🔹 Outliers
        SortingService.detectOutliers(list1);
    }
}