//1:- print value upto 20 numbers tak prime number
// 2:- check value under 20 numbers and print prime number
// public class printPrime {
//     public static void main(String[] args) {
//         int n=20;
//         boolean flag=true;
//         int check=2;
//         int k=0;

//         while (k<n) {
//             flag=false;
//             for(int i=2;i<check;i++){
//                 if(check%i==0){
//                     flag=true;
//                     break;
//                 }
//             }
// if(flag==false){
//     System.out.print(check+" , ");
// k++;
// }
// check++;
//         }

//     }
// }


public class printPrime {
    public static void main(String[] args) {
        int  num=20;
        boolean flag=true;
        int check=2;
        while (check<num) {
            flag=false;
            for(int i=0;i<check;i++){
                if(check%i==0){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                System.err.print(check+" , ");
            }
            check++;
        }
    }
}



