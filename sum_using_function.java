import java.util.Scanner;
public class sum_using_function {
    public static int add(int a ,int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a-> ");
        int a = sc.nextInt();
        System.out.println("enter b->");
        int b = sc.nextInt();
        int sum = add(a,b);
        System.out.println("value of a+b is "+sum);
    }
}
