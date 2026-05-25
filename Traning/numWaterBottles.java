package Traning;

public class numWaterBottles {
    public static void main(String[] args) {
        
    
    int n = 9;
    int e = 3;
    int t = n;
    int emp=n;
    while(emp>=e)
    {
        int ne = (int) emp / e;
        t += ne;
        int rem = emp % e;

        emp = ne + rem;
    }
    System.out.println(t);
}
}
