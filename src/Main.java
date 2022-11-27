import java.util.*;

//  Do You Know Your ABCs? 2020 USACO
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] log = new String[N];

        for(int i = 0; i < N; i++){
            log[i] = scanner.next();
        }
        int B = 0, E = 0, D = 0, G = 0, A = 0, M = 0, H = 0;

        for(int i = 0; i < N; i++) {

            int space = log[i].indexOf(" ");
            String numString = log[i].substring(space, log[i].length() + 1);
            int amountMilk = Integer.parseInt(numString);

            char[] logC = log[i].toCharArray();
            System.out.println(amountMilk);
            if(logC[0] == 'B'){
                B += amountMilk;
            } else if(logC[0] == 'E'){
                E += amountMilk;
            } else if(logC[0] == 'D'){
                D += amountMilk;
            } else if(logC[0] == 'G'){
                G += amountMilk;
            } else if(logC[0] == 'A'){
                A += amountMilk;
            } else if(logC[0] == 'M'){
                M += amountMilk;
            } else{
                H += amountMilk;
            }

            if((B >= E) && (B >= D) && (B >= G) && (B >= A) && (B >= M) && (B >= H)){
                System.out.println("Bessie");
                break;
            } else if((E >= B) && (E >= D) && (E >= G) && (E >= A) && (E >= M) && (E >= H)){
                System.out.println("Elsie");
                break;
            } else if((D >= E) && (D >= B) && (D >= G) && (D >= A) && (D >= M) && (D >= H)){
                System.out.println("Daisy");
                break;
            } else if((G >= E) && (G >= D) && (G >= B) && (G >= A) && (G >= M) && (G >= H)){
                System.out.println("Gertie");
                break;
            } else if((A >= E) && (A >= D) && (A >= G) && (A >= B) && (A >= M) && (A >= H)){
                System.out.println("Annabelle");
                break;
            } else if((M >= E) && (M >= D) && (M >= G) && (M >= B) && (M >= A) && (M >= H)){
                System.out.println("Maggie");
                break;
            } else{
                System.out.println("Henrietta");
            }

            if ((B == E) && (D == G) && (A == M) && (B == H)) {
                System.out.println("Tie");
                break;
            }
        }

    }
}