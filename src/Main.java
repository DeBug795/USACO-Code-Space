import java.util.*;

// Milk Measurement
class Main {

    public static int amountMilk(String dayNameMilkLINE, int initialMilk) {
        char[] charInputArr = dayNameMilkLINE.toCharArray();

        int arrLength = charInputArr.length;

        System.out.println(arrLength);

        int amountMilkGainedLost = charInputArr[charInputArr.length - 1];
        char operation = (charInputArr[charInputArr.length - 2]);

        if (operation == '+') {
            initialMilk += amountMilkGainedLost;
        } else {
            initialMilk -= amountMilkGainedLost;
        }

        return initialMilk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int initialMilk = 7;

        String[] daysNamesMilk = new String[N + 1];

        for (int i = 0; i <= N; i++) {
            daysNamesMilk[i] = scanner.nextLine();
        }

        Arrays.sort(daysNamesMilk);

        System.out.println("What does the input array contain");
        for (int y = 0; y <= N; y++) {
            System.out.println(daysNamesMilk[y]);
        }

        int counter = 0;

        for (int w = 1; w <= N-1; w++) {
            int[] milk = new int[N];
            milk[w] = amountMilk(daysNamesMilk[w], initialMilk);

            if (milk[w] > initialMilk) {
                counter++;
            }
        }

        System.out.println(counter + 1);

    }
}