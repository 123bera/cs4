import java.sql.SQLOutput;
import java.util.Scanner;
public class student_detail {
    public static void main(String [] arg){
        System.out.println("enter student details: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name: ");
        String name= sc.nextLine();
        System.out.println("enter branch: ");
        String branch = sc.nextLine();
        System.out.println("enter roll number: ");
        int roll = sc.nextInt();
        System.out.println("the student detail is : ");
        System.out.println("Name-> "+ name);
        System.out.println("branch-> "+ branch);
        System.out.println("roll number-> "+ roll);

    }
}
