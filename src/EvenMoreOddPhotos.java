import java.util.Scanner;

public class EvenMoreOddPhotos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] input = new int[N];

        for(int i = 0; i < N; i++){
            input[i] = scanner.nextInt();
        }

        for(int i = 0; i < N; i++){
            while(i < N){
                if(input[i] + input[i+1] % 2 == 0){

                }
            }
        }
    }
}
