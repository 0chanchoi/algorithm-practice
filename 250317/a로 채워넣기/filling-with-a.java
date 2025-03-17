import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();

        String newText = A.substring(0,1)+"a"+A.substring(2,A.length()-2)+"a"+A.substring(A.length()-1);
        System.out.println(newText);
    }
}