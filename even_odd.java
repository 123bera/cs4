import java.util.function.DoubleToIntFunction;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("even number ");
        }
        else{
            System.out.println("odd number ");
        }
    }
}
