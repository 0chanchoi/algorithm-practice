import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();


        if(((A>B)&&(B>C))||((A<B)&&(B<C)) ){
            System.out.printf("B");
        }
        else if(((B>A)&&(A>C))||((A<B)&&(B<C))){
            System.out.printf("A");
        }
        else if(((A>C)&&(C>B))||((A<C)&&(C<B))){
            System.out.printf("C");    
        }
    }
}