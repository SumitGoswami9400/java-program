// this code is not working in negative value because we put largest number is 0 phle hi

public class largestNo {
    public static void main(String[] args) {
        int[] arr={12,15,14,18,15,80,81,41};
       int largest=0;
       for(int i=0;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
       }
       System.out.println(largest+" is the largest number of this array");
    }
}
