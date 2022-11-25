import java.util.Scanner;

public class RallyRacing {
    private static int rowCar = 0;
    private static int collCar = 0;
    private  static boolean carIsFinished = false;
    private static int kilometerPassed = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);




        int N = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        String[][] raceRoute = new String[N][N];

        for (int i = 0; i < N; i++) {
            String[] line = scanner.nextLine().split(" ");
            raceRoute[i] = line;
        }

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            switch (command) {
                case "left":
                    moveCar(raceRoute, 0,-1);
                    break;
                case "right":
                    break;
                case "up":
                    break;
                case "down":
                    break;
            }

            if (raceRoute[rowCar][collCar].equals("F")) {
                carIsFinished = true;
                break;
            }
            command = scanner.nextLine();
        }

        if (carIsFinished) {
            System.out.printf("Racing car %s finished the stage!%n", racingNumber);
            System.out.printf("Distance covered %d km.", kilometerPassed);
        } else {
            System.out.printf("Racing car %s DNF.%n", racingNumber);
            System.out.printf("Distance covered %d km.", kilometerPassed);
        }
    }

    private static void moveCar(String[][] raceRoute, int rowMut, int colMut) {
        int nexRow = rowCar + rowMut;
        int nextColl = collCar + colMut;


    }
}
