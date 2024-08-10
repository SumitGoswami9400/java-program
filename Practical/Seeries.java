import java.util.Scanner;

class Series {
    public static void main(String[] args) {
        int a,b;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ");
        a = sc.nextInt();
        System.out.println("Enter the value of b ");
        b = sc.nextInt();
        System.out.println("Enter no of terms ");
        int n = sc.nextInt();
        Series ss = new Series();
        double d = Math.pow(a,b);
        System.out.println(d);

        int k = 1;
        double sum = 0.0;
        for(int i = 1; i<=n; i++){
            sum = sum + (Math.pow(a,k)) / (Math.pow(b,k+1));
            k = k+2;
        }
        System.out.println("The sum of this series for " + n +" terms is " + sum);
    }
}