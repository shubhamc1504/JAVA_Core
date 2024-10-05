import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReader {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        // InputStreamReader ir = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(ir);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
    }
}
