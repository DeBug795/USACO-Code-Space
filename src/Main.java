import java.util.*;
import java.io.*;

// Measuring Traffic
public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] segmentType = new String[N];
        int[] lowerBounds = new int[N];
        int[] upperBounds = new int[N];

        for(int i = 0; i < N; i++){
            segmentType[i] = scanner.next();
            lowerBounds[i] = scanner.nextInt();
            upperBounds[i] = scanner.nextInt();


            if((segmentType[i].equals("on") && segmentType[i+1].equals("none")) || (segmentType[i].equals("on") && segmentType[i+1].equals("on"))){
                int newLowerBounds = lowerBounds[i] + lowerBounds[i + 1];
                int newUpperBounds = upperBounds[i] + upperBounds[i + 1];
                System.out.println("New Lower Bounds: " + newLowerBounds);
                System.out.println("New Upper Bounds: " + newUpperBounds);
            }

        }

    }
}
