package Day2;

import java.util.*;
public class Postfix {

	public static void main(String[] args) {
		String s="5678+-*";
		ArrayList<Integer> a=new ArrayList<>();
		for(int i=0;i<s.length();i++)
		{
		    if (Character.isDigit(s.charAt(i))==true)
		    {
		        a.add(Character.getNumericValue(s.charAt(i)));
		    }
		    else{
		        int p=a.removeLast();
		        int q=a.removeLast();
		        if (s.charAt(i)=='+')
		        {
		            a.add(p+q);
		        }
		        else if (s.charAt(i)=='-')
		        {
		            a.add(p-q);
		        }
		        else if (s.charAt(i)=='*')
		        {
		            a.add(p*q);
		        }
		        else if (s.charAt(i)=='/')
		        {
		            a.add(p/q);
		        }
		    }
		}
		System.out.println(a.get(0));
	
	
}}

