import java.util.Scanner;

public class week {
    public static void main(String[] arg){
        System.out.println("enter day number: ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("it is Monday");
                break;
            case 2:
                System.out.println("it is Tuesday");
                break;
            case 3:
                System.out.println("it is wednesday");
                break;
            case 4:
                System.out.println("it is thursday");
                break;
            case 5:
                System.out.println("it is friday");
                break;
            case 6:
                System.out.println("it is saturday");
                break;
            case 7:
                System.out.println("it is sunday");
                break;
            default:
                System.out.println("enter a valid dday number ");
        }

    }
}
