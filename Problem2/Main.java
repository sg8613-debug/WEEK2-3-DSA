import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Client> list1 = new ArrayList<>();

        list1.add(new Client("A", 20, 5000));
        list1.add(new Client("B", 50, 8000));
        list1.add(new Client("C", 80, 2000));
        list1.add(new Client("D", 50, 10000));
        list1.add(new Client("E", 10, 3000));

        ArrayList<Client> list2 = new ArrayList<>(list1);

        System.out.println("Original Clients:");
        for (Client c : list1) {
            System.out.println(c);
        }

        SortingService.bubbleSort(list1);
        System.out.println("\nBubble Sort (Ascending Risk):");
        for (Client c : list1) {
            System.out.println(c);
        }

        SortingService.insertionSort(list2);
        System.out.println("\nInsertion Sort (Descending Risk + Balance):");
        for (Client c : list2) {
            System.out.println(c);
        }

        SortingService.topClients(list2);
    }
}