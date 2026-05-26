package Day2;

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> sum=new ArrayList<>();
		sum.removeLast();
		 if (sc.hasNextInt()) {
            int t = sc.nextInt();
 
            while (t-- > 0) {
        int n=sc.nextInt();
	    int m=sc.nextInt();
	    int d=sc.nextInt();
	    int a=(int)d/m;
	    a=a+1;
	    int f=n/a;
	    if (n%a==0)
	      { sum.add(f);}
	     else{sum.add(f+1);}
            }
        }
		for(int i=0;i<sum.size();i++)
		{
		    System.out.println(sum.get(i));
		}
		
	sc.close();
		
	}
}