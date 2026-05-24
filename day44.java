import java.util.Arrays;
public class day44 {
    public static void main(String[] args) {
        int[] num1={2,4};
        int[] num2={1,2,3,4};
        int[] out = new int[num1.length];
        for(int i=0;i<num1.length;i++){
             int index = -1;

            for(int j = 0; j < num2.length; j++) {
                if(num2[j] == num1[i]) {
                    index = j;
                    break;
                }
            }

            out[i] = -1;
            for(int j=index;j<num2.length;j++){
                if(num2[j]>num1[i]){
                    out[i]=num2[j];
                    break;
                }else{
                    out[i]=-1;
                }
            }
        }
        System.out.println(Arrays.toString(out));
    }
}
