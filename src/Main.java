import java.io.*;
import java.util.*;

//  Marathon 2014 USACO
class Main {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] cowPosition = new int[N];
        int[] cowSpeed = new int[N];

        for(int i = 0; i < N; i++){
            cowPosition[i] = scanner.nextInt();
            cowSpeed[i] = scanner.nextInt();
        }

        int groupCounter = 0;
        //Changing the value of i changes the output.
        for(int i = 0; i < N - 1; i++){
            if(cowSpeed[i] < cowSpeed[i + 1]){
                groupCounter++;
            }else{
                groupCounter++;
            }
        }
        System.out.println(groupCounter);

    }
}