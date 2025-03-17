import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        if(A.length()>B.length()){
            System.out.printf("%s %d",A, A.length());
        }
        else if(A.length()==B.length()){
            System.out.printf("same");
        }
        else{
            System.out.printf("%s %d",B, B.length());
        }
        
    }
}