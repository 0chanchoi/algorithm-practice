import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner(System.in);

        int N = sc.nextInt();


        if(N>=90){
            System.out.printf("A");
        }
        else if(N>=80){
            System.out.printf("B");
        }
        else if(N>=70){
            System.out.printf("C");
        }
        else if(N>=60){
            System.out.printf("D");
        }
        else{
            System.out.printf("F");
        }
    }
}