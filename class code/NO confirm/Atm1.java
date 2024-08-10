import java.util.*;;
public class Atm1 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        while (true) {
        System.err.println("Enter you choice \n1-credit\n2-debit\n3-exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                //call credit
                System.out.println("Credit is called ");
                break;
            case 2:
            // call debit
            System.out.println("debit is called");
            int x = 10;
            x++;
            System.out.println(x++*2+3);
            System.out.println(x);
            break;
            case 3:
            System.out.println("exit ho gya hai");
            System.exit(0);
            default:
                break;
        }
    }
    }
}
