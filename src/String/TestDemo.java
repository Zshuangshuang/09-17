package String;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Description:
 * User:ZouSS
 * Date:2020-09-17
 * Time:13:41
 **/
public class TestDemo {
    public static String connection(String str1){
        String ret = "";
        String[] s = str1.split(" ");
        for (String ss:s) {
            ret += ss;

        }
        return  ret;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str = connection(str1);
        System.out.println(str);


    }
    public static boolean isNum(String str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9' ){
                return false;
            }
        }
        return true;
    }
    public static void main1(String[] args) {
        String str = "12bn";
        boolean ret = isNum(str);
        System.out.println(ret);


    }
}
