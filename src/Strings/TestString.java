package Strings;

import com.sun.security.jgss.GSSUtil;

public class TestString {
    static void main() {
        String s1=new String("Prajjawal");
        String s2=new String("Prajjawal");
        String s3="Prajjawal";
        String s4="prajjawal gupta";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s1.equals(s3));

        System.out.println(s4.length());
        System.out.println(s4.charAt(5));
        System.out.println(s4.compareTo(s3));
        int i = s4.compareToIgnoreCase(s3);
        System.out.println(i);

        System.out.println(s4.substring(5,s4.length()));
        System.out.println(s4.replace("gupta","tanmay"));
    }
}
