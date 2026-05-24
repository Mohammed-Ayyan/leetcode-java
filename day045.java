public class day045 {
    public static String longestCommonPrefix(String[] strs) {
        int lastindex = 0;
        if (strs.length != 0) {
            for (int i = 0; i < strs.length - 1; i++) {
                int min = Math.min(strs[i].length(), strs[i + 1].length());
                for (int j = 0; j < min; j++) {
                    if (strs[0].charAt(j) == strs[i + 1].charAt(j)) {
                        lastindex = j;
                    } else {
                        break;
                    }
                    ;
                }

            }
            if (lastindex == 0) {

                return "";
            } else {

                return strs[0].substring(0, lastindex + 1);
            }
        } else {
            if (strs[0].length()==1) {
                
                return strs[0].substring(0, strs.length );
            }else{
                return strs[0].substring(0, strs.length+1 );
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = { "d" };
        System.out.println(longestCommonPrefix(arr));

    }
}
