import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("enter first number: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second number: ");
        int b = sc.nextInt();
        System.out.println("enter operation to be performed: ");
        char op= sc.next().charAt(0);
        switch(op){
            case '+':
                int sum = a+b;
                System.out.println("sum is "+sum);
                break;
            case '-':
                int sub = a-b;
                System.out.println("subtraction is: "+ sub);
                break;
            case '/':
                float div = a/b;
                System.out.println("division is : "+div);
                break;
            case '*':
                int mul=a*b;
                System.out.println("multiplication is : "+ mul);
                break;
            default:
                System.out.println("enter a valid expression ");
        }


    }
}