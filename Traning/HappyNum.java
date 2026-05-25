package Traning;

import java.util.ArrayList;

public class HappyNum {
    public static void main(String[] args) {
        
        int n = 19, remainder=0;
        ArrayList a = new ArrayList<>();
        while (n != 0) {
            int sum = 0;
            while (n > 0) {
                remainder = n % 10;
                sum += remainder * remainder;
                n =(int)n/ 10;
            }
            if(sum==1){
                System.out.println("Happy n");
                break;
            }
            if (a.contains(sum)) {
                System.out.println("Sad n");
                break;
            }
            a.add(sum);
            n=sum;
        }
    }
}
