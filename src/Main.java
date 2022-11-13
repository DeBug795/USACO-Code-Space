import java.io.*;
import java.util.*;

// Mixing Milk
class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("mixmilk.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("mixmilk.out"));

        int bucketACapacity = scanner.nextInt();
        int bucketAMilk = scanner.nextInt();

        int bucketBCapacity = scanner.nextInt();
        int bucketBMilk = scanner.nextInt();

        int bucketCCapacity = scanner.nextInt();
        int bucketCMilk = scanner.nextInt();

        for(int i = 0; i < 33; i++){
            int min1 = Math.min(bucketAMilk, bucketBCapacity-bucketBMilk);
            bucketAMilk -= min1;
            bucketBMilk += min1;

            int min2 = Math.min(bucketBMilk, bucketCCapacity-bucketCMilk);
            bucketBMilk -= min2;
            bucketCMilk += min2;

            int min3 = Math.min(bucketCMilk, bucketACapacity-bucketAMilk);
            bucketCMilk -= min3;
            bucketAMilk += min3;
        }

        int min1 = Math.min(bucketAMilk, bucketBCapacity-bucketBMilk);
        bucketAMilk -= min1;
        bucketBMilk += min1;

        pw.println(bucketAMilk);
        pw.println(bucketBMilk);
        pw.println(bucketCMilk);
        pw.close();

    }
}