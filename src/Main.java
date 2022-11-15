import java.util.*;

//  Missing Number CSES
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] nums = new int[N-1];
        for(int i = 0; i < N - 1; i++){
            nums[i] = scanner.nextInt();
        }

        Arrays.sort(nums);

        for(int i = 1; i < N - 1; i++){
            if(nums[i + 1] != nums[i] + 1){
                System.out.println(nums[i] + 1);
                break;
            }
        }
    }
}