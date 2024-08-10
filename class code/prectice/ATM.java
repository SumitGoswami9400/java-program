import java.util.Scanner;

public class ATM {
    Scanner sc=new Scanner(System.in);
    public static void totalAmount(){
        System.out.println("total amount");
    }
    public static void WithrowAmount(){
        System.out.println("WithrowAmount");
    }
    public static void DepositeAmount(){
        System.out.println("Deposite amount");
    }
    public static void exit(){
        System.out.println("exit");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // sc.nextInt();
        while(true){
            System.out.println("select the number to be chacked ");
            System.out.println("1.total amount");
            System.out.println("2.WithrowAmount");
            System.out.println("3.Deposite Amount");
            System.out.println("4.Exit");
            switch (sc.nextInt()) {
                case 1:
                    totalAmount();
                    break;
                case 2:
                    WithrowAmount();
                    break;
                case 3:
                    DepositeAmount();
                    break;
                case 4:
                    exit();
                    break;
            
                default:
                System.out.println("enter number in invalid please enter the valid number");
                    break;
            }
        }
    }
}
