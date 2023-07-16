import java.util.Scanner;

public class SplSubAG {
    public static int sequence(String str) {
        int res = 0;
        int k = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i) == 'k') {
                int count = 0;
                count++;

            }
            else if(str.charAt(i) == 'g') {
                res += k;
            }
        }
        return 0;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int value =  sequence(str);
        System.out.println(value);

    }

}