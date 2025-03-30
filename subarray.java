package Arrays;

public class subarray {
    
    public static void sub(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int start = i;

            for (int j = i; j < num.length; j++) {
                int end = j;
                int sum = 0;  // Reset sum for each subarray
                
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                    sum += num[k];
                }
                
                System.out.println(" -> Sum: " + sum);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        sub(num);
    }
}

