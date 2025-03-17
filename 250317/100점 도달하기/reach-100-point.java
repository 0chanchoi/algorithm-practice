import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for(int i = N; i<101; i++ ){
            if(i>=90){
                System.out.printf("A ");
            }
            else if(i>=80){
                System.out.printf("B ");
            }
            else if(i>=70){
                System.out.printf("C ");
            }
            else if(i>=60){
                System.out.printf("D ");
            }
            else{
                System.out.printf("F ");
            }
        }
    }
}