import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s1 = "DIVYAAA";
        String s2 = "Ghatwani";
        String s3 = "divyaghatwani";
        String s4 = "Ghatwani";
        String s5 = "I have got nothing to do";
        String s6 = "";
        char[] ch = new char[10];
        char c1 = s1.charAt(4);
        System.out.println("character at 4 " + c1);
        System.out.println("string comparision:");
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s4));
        System.out.println("concatenation:");
        s3 = s3.concat(" is great");
        System.out.println(s3);
        System.out.println("String contains: ");
        System.out.println(s5.contains("a lot"));
        System.out.println("ends with: ");
        System.out.println(s5.endsWith("say"));
        System.out.println("equals: ");
        System.out.println(s1.equals(s3));
        System.out.println("equals ignore: ");
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("formating: ");
        s6 = String.format("name is %s ", s2);
        System.out.println(s6);
        System.out.println("bytes in s1:");
        byte[] bar = s1.getBytes();
        for (int i = 0; i < bar.length; i++) {
            System.out.println(bar[i]);
        }
        System.out.println("get char:");
        try {
            s5.getChars(2, 15, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println("index of:");
        int index1 = s5.indexOf("to");
        int index2 = s5.indexOf("say");
        System.out.println(index1 + "  " + index2);
        int index3 = s5.indexOf("to", 4);
        System.out.println(index3);
        int index4 = s5.indexOf('s');
        System.out.println(index4);
        System.out.println("Intern: ");
        s6 = s1.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s6);
        System.out.println("Empty: ");
        String s7 = "";
        System.out.println(s7.isEmpty());
        System.out.println(s1.isEmpty());
        System.out.println("join:");
        s7 = String.join(s1, s2, s3);
        System.out.println(s7);
        System.out.println("length: ");
        System.out.println(s1.length());
        System.out.println("replace:");
        s7 = s3.replace('a', 'e');
        System.out.println(s7);
        System.out.println("replace all:");
        String s8 = "My job is looking bob doing his job at his job";
        s7 = s8.replaceAll("job", "work");
        System.out.println(s7);
        String str = "Javatpointtt";
        System.out.println("Returning words:");
        String[] arr = str.split("t", 0);
        for (String w : arr) {
            System.out.println(w);
        }
        System.out.println("Split array length: " + arr.length);
        System.out.println("starts with :");
        System.out.println(s1.startsWith("Sa"));
        System.out.println("substring: ");
        System.out.println(s8.substring(3,10));
        System.out.println("Char Array: ");
        char[] c2=s1.toCharArray();
        for(int i=0;i<c2.length;i++){
            System.out.print(c2[i]);
        }
        System.out.println("lower case:");
        s7=s1.toLowerCase();
        System.out.println(s7);
        System.out.println("upper case:");
        s7=s3.toUpperCase();
        System.out.println(s7);
        System.out.println("trim:");
        System.out.println(s1+"is a girl");;
        System.out.println(s1.trim()+"is a girl");
        System.out.println("value of:");
        boolean bol=true;
        boolean bol2=false;
        String s9=String.valueOf(bol);
        String s10=String.valueOf(bol2);
        System.out.println(s9);
        System.out.println(s10);

    }

}