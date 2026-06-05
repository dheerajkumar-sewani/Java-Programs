import java.util.*;
public class button {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        switch (num){
        case 1 : System.out.println("bhenchod");
        break;
        case 2 : System.out.println("madarchod");
        break;
        default : System.out.println("Invalid input");
        }
    }

}
