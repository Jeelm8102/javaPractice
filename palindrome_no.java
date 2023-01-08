import java.util.*;

class palindrome_no {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int r, sum = 0, temp;
            int x = sc.nextInt();
            temp = x;
            while (x > 0) {
                r = x % 10; // getting remainder
                sum = (sum * 10) + r;
                x = x / 10;
            }
        
            if (temp == sum) {
                System.out.println("It is a palindrome number");
            } else {
                System.out.println("It is not a palindrome number");
            }
        }
    }
}
