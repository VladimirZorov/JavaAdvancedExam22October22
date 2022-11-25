import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        String racingNumber = scanner.nextLine();

        char[][] raceRoute = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            raceRoute[i] = line.toCharArray();
        }


        System.out.println();
    }
}
