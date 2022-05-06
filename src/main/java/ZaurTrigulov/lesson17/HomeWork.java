package ZaurTrigulov.lesson17;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(ravenstvo(new StringBuilder("java"), new StringBuilder("java")));
    }

    public static boolean ravenstvo(StringBuilder sb1, StringBuilder sb2) {
        String s1 = new String(sb1);
        String s2 = new String(sb2);
        return (s1.equals(s2));
    }
}
