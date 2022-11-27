import java.io.*;
import java.util.*;

public class AngryCowsUSACO {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("angry.in"));
        // Input:
        int n = sc.nextInt();
        int[] bales = new int[n];
        for (int i = 0; i < n; i++) {
            bales[i] = sc.nextInt();
        }
        Arrays.sort(bales);

        int ans = 1;
        // Find answer:
        for (int i = 0; i < n; i++) {
            int firstDrop = i;

            int currentLocation = i; // index in bales array
            int currentRadius = 1;
            // Go up as far as possible:
            while (true) {
                int newLocation = i + 1;
                while (newLocation < n && bales[newLocation] <= bales[currentLocation] + currentRadius) {
                    newLocation++;
                }
                // newLocation is the first index outside the blast radius
                newLocation--;
                // now newLocation is going to be the last index inside the blast radius
                if (currentLocation == newLocation) {
                    // no new bales are detonated
                    break;
                }
                currentLocation = newLocation;
                currentRadius++;
            }
            int furthestRight = currentLocation;

            currentLocation = i;
            currentRadius = 1;
            // Go down as far as possible:
            while (true) {
                int newLocation = i - 1;
                while (newLocation >= 0 && bales[newLocation] >= bales[currentLocation] - currentRadius) {
                    newLocation--;
                }
                // newLocation is the first index outside the blast radius
                newLocation++;
                // now newLocation is going to be the last index inside the blast radius
                if (currentLocation == newLocation) {
                    // no new bales are detonated
                    break;
                }
                currentLocation = newLocation;
                currentRadius++;
            }
            int furthestLeft = currentLocation;

            // furthestLeft ... furthestRight
            int range = furthestRight - furthestLeft + 1;

            ans = Math.max(ans, range);
        }

        FileOutputStream fos = new FileOutputStream("angry.out");
        fos.write(Integer.toString(ans).getBytes());

        fos.close();
        sc.close();
    }
}