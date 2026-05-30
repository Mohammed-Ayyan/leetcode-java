package Day3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Remove_Outermost_Parentheses {
    public static void main(String[] args) {
        Deque<Character> sta = new ArrayDeque<Character>();
        String str="(()())(())";
        String ans="";
        for(int i=0;i<str.length();i++){
            if(sta.isEmpty()){
                sta.push(str.charAt(i));
                System.out.println(sta.size());
            }else if(sta.size()>=1){
                if(str.charAt(i)=='('){
                    sta.push(str.charAt(i));
                    System.out.println(sta);
                    
                    ans+=(str.charAt(i));
                }else if(str.charAt(i)==')'){
                    sta.pop();
                    System.out.println(sta);
                    ans+=str.charAt(i);
                }
            }
        }
        
        System.out.println(ans);
    }
}
