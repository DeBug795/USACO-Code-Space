import java.io.*;
import java.util.*;

//  Weird Algorithm CSES
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        System.out.print(N + " ");

        while(N != 1){
            if(N % 2 != 0){
                N = N * 3 + 1;
                System.out.print(N + " ");
            } else{
                N = N / 2;
                System.out.print(N + " ");
            }
        }

    }
}