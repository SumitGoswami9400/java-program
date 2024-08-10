public class largestestno{
    public static void main(String[] args) {
        int[] arr={-120000,-13000,-4000,-54000,-67000,-89000};
        // int larger=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if(arr[0] < arr[i+1]){
                arr[0] = arr[i+1];
            }
        }
        System.out.println(arr[0]+" is of the larger number of the array");
        
    }
}