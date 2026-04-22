import java.util.ArrayList;

public class SortingService {

    public static void bubbleSort(ArrayList<Client> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j).riskScore > list.get(j + 1).riskScore) {
                    Client temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void insertionSort(ArrayList<Client> list) {
        for (int i = 1; i < list.size(); i++) {
            Client key = list.get(i);
            int j = i - 1;

            while (j >= 0 &&
                  (list.get(j).riskScore < key.riskScore ||
                  (list.get(j).riskScore == key.riskScore &&
                   list.get(j).balance < key.balance))) {

                list.set(j + 1, list.get(j));
                j--;
            }

            list.set(j + 1, key);
        }
    }

    public static void topClients(ArrayList<Client> list) {
        System.out.println("\nTop Clients:");
        for (int i = 0; i < Math.min(10, list.size()); i++) {
            System.out.println(list.get(i));
        }
    }
}