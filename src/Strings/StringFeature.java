package Strings;

public class StringFeature {
    static void main() {
        System.out.println("STRING CLASS");
        String str="Prajjawal";
        str.concat(" Gupta");
        System.out.println(str);
        System.out.println(str.concat(" Gupta"));

        System.out.println("STRINGBUILDER CLASS");

        StringBuilder sb=new StringBuilder("PRAJJAWAL ");
        sb.append("TANMAY");
        System.out.println("Append-> "+sb.toString());

        sb.insert(0,"GUPTA ");
        System.out.println("Insert-> "+sb.toString());

        sb.replace(1,3,"arch");
        System.out.println("Replace-> "+sb.toString());

        sb.delete(1,3);
        System.out.println("delete-> "+sb.toString());

        System.out.println("charAt 12 -> "+sb.charAt(12));

        System.out.println("Length-> "+sb.length());

        System.out.println("Substring-> "+sb.substring(6,14));

        sb.reverse();
        System.out.println("reverse-> "+sb.toString());


    }
}
