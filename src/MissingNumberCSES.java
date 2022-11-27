import java.util.*;

public class MissingNumberCSES {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N-1];

        for(int i = 0; i < N-1; i++){
            input[i] = scanner.nextInt();
        }

        int actualSum = 0;
        for(int i = 0; i <= N; i++){
            actualSum += i;
        }

        int arraySum = 0;
        for(int i = 0; i < N-1; i++){
           arraySum += input[i];
        }

        System.out.println(actualSum - arraySum);

    }
}
