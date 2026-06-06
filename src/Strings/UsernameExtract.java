package Strings;

import java.util.Scanner;

public class UsernameExtract {
    static void main() {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String userName="";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='@'){
                break;
            }else {
                userName+=str.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
