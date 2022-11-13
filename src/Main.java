import java.io.*;
import java.util.*;

//  The Cow Signal
class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("cowsignal.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("cowsignal.out"));

        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        for(int i = 0; i < M; i++){
            String pic = scanner.next();
            String extended = "";

            for (char c: pic.toCharArray()) {
                for(int j = 0; j < K; j++){
                    extended += c;
                }
            }

            //code
            for(int j = 0; j < K; j++){
                pw.println(extended);
            }
        }

        pw.close();

    }
}