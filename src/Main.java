import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("hello world");
        System.out.println("goodbye world");
        int score = 0;
        System.out.println("Type an integer 1 to 9");
        score += scan.nextInt();
        System.out.println(score);
        if (score > 5) {
            System.out.println("high score!");
        }

    }
}
