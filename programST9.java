import java.util.Scanner;

public class programST9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the year:");
            int str1 = in.nextInt();
            if (str1%4==0) {
                System.out.println("leap year");
            } else {
                System.out.println("not a leap year");
            }
        } finally {
            in.close();
        }
    }
}