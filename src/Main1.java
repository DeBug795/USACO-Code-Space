import java.util.*;

// Angry Cows USACO
public class Main1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean done;
        int maxCount = 0;
        int finalCount = 0;
        int counterRadius = 1;
        int value;

        int N = scanner.nextInt();
        int[] input = new int[N];

        /*
        * Only takes last value of array and prints outputs. Doesn't compare any previous values, so it doens't know which one is the greatest.
        */

        // Values in array
        for(int i = 0; i < N; i++){
            input[i] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++){
            maxCount = 0;
            value = input[i];
            done = false;

            while (!done) {
                int valueHigher = value + counterRadius;
                int valueSmaller = value - counterRadius;

                for(int j = 0; j < N; j++){
                    if(input[j] == valueHigher){
                        counterRadius++;
                        maxCount++;
                    }
                    else if(input[j] == valueSmaller){
                        counterRadius++;
                        maxCount++;
                    }
                    else if(input[j] != valueSmaller || input[j] != valueHigher){
                        done = true;
                    }
                }

            }

            if(maxCount > finalCount){
                finalCount = maxCount;
            }
        }
        System.out.println(maxCount);
        System.out.println(finalCount);
    }
}
