import java.util.Scanner;

public class TrucksAndContainers {
    public static void main(String[] args) {
        int truckCount = 0;
        int containerCount = 0;
        Scanner scanner = new Scanner(System.in);

        int boxes = scanner.nextInt();
        if (boxes > 0) {
            containerCount++;
            truckCount++;

            System.out.println("Грузовик: " + truckCount);
            System.out.println("\tКонтейнер: " + containerCount);

            for (int i = 1; i <= boxes; i++) {
                System.out.println("\t\tЯщик: " + i);
                if (i % 324 == 0 && i != boxes) {
                    truckCount += 1;
                    System.out.println("Грузовик: " + truckCount);
                }
                if (i % 27 == 0 && i != boxes) {
                    containerCount += 1;
                    System.out.println("\tКонтейнер: " + containerCount);
                }
            }
        }
        System.out.println("Необходимо: " + System.lineSeparator() + "грузовиков - " + truckCount +
                " шт." + System.lineSeparator() + "контейнеров - " + containerCount + " шт.");
    }
}