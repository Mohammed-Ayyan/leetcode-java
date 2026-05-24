public class day42 {
    public static char getoppo(char s) {
        switch (s) {
            case '(':
                return ')';
            case '[':
                return ']';
            case '{':
                return '}';
            default:
                return 'I';
        }

    }
public static boolean check(String ab) {
        for(int i=0;i<ab.length()/2;i++){
            if(getoppo(ab.charAt(i))!=ab.charAt(ab.length()-i-1)){
                return false;
            };
        }
        return true;
    };
    public static void main(String[] args) {
        System.out.println(check("{[()]}"));
    }
}
