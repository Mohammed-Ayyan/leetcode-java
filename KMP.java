import java.util.ArrayList;
import java.util.List;

public class KMP {

    public static List<Integer> stringSearching(String t, String p) {

        int n = p.length(), m = t.length();

        String s = p + "#" + t;

        int[] pi = prefixFunction(s);

        List<Integer> ans = new ArrayList<>();

        for (int i = n + 1; i < n + 1 + m; i++) {

            if (pi[i] == n) {
                ans.add(i - 2 * n);
            }
        }

        return ans;
    }

    public static int[] prefixFunction(String s) {

        int n = s.length();

        int[] pi = new int[n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (s.substring(0, j + 1).equals(s.substring(i - j, i + 1))) {
                    pi[i] = j + 1;
                }
            }
        }

        return pi;
    }

    public static void main(String[] args) {

        String text = "gedeksgdeeksgedeks";
        String pattern = "geeks";

        System.out.println(stringSearching(text, pattern));
    }
}