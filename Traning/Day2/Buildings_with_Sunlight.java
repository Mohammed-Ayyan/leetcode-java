package Day2;

public class Buildings_with_Sunlight {
    public static void main(String[] args) {
        int count=0;
        int max=0;
        
       
        int[] arr={6, 2, 8, 4, 11, 13};
        
        for(int i=0;i<arr.length;i++){
            
    

            if(arr[i]>=max){
                max=arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
