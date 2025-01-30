import java.util.Scanner;

public class university_selection {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your GRE percent-> ");
        float gre = sc.nextFloat();
        System.out.println("enter your TOEFL percent-> ");
        float toefl = sc.nextFloat();
        System.out.println("your available choices are --> ");
        if(gre>70 && toefl>=70){
            System.out.println("oxford computer sc.eng");
        }
        if(gre>70 && toefl>=60){
            System.out.println("oxford electronics eng.");
        }
        if(gre>70 && toefl>=50){
            System.out.println("oxford electrical eng. ");
        }
        if(gre<=70 && gre>=60 && toefl>=50){
            System.out.println("MIT computer sc. eng. ");
        }
        if(gre<=59 && gre>=50 && toefl>=50){
            System.out.println("MIT chemical eng.");
        }
        if(gre>=50 && toefl >=50){
            System.out.println("MIT civil eng. ");
        }
        else {
            System.out.println("NIT Patna!! ");
        }
    }
}
