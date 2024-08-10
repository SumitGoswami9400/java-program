public class checkprime {
    public static void check(int num){
        int i;
        int temp=0;
        boolean m=false;
            if(num>0){
            m=true;
            for(i=2;i<num;i++){
                if(num%i==0){
                    m=false;
                    break;
                }
            }
        }
            if(m==false){
                System.out.println(num+" is not a prime numbr");
            }
            if(m==true){
                System.out.println(num+" is prime number");
            }
        }
    
    public static void main(String[] args) {
        check(2);
    }
}



// public class checkprime{    
//     public static void main(String args[]){    
//      int i,m=0,flag=0;      
//      int n=3;//it is the number to be checked    
//      m=n/2;      
//      if(n==0||n==1){  
//       System.out.println(n+" is not prime number");      
//      }else{  
//       for(i=2;i<=m;i++){      
//        if(n%i==0){      
//         System.out.println(n+" is not prime number");      
//         flag=1;      
//         break;      
//        }      
//       }      
//       if(flag==0)  { System.out.println(n+" is prime number"); }  
//      }//end of else  
//    }    
//    }   
