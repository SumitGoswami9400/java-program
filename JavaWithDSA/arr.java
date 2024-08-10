public class arr{
    public static int da(int m, int k){
    return m+k;

    }
    public static int ma(int[] arr){

        for(int i=0;i<arr.length;i++){
return arr[i];

        }
        
    }
    public static void main(String[] args){
        int[] arr={1,13,24,535,35,352};
        ma(arr);
       int sum= da(3,5);
        System.out.println(sum);
    
        // System.out.println("HEllo how are u");
    }
}