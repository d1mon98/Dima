package ZaurTrigulov.lesson16;

public class Email {

    public void email(String e) {
        int a; // позиция символа @
        int b; // позиция символа .
        int c = 0; // позиция символа ;

        while (c < e.length() - 1) {
            a = e.indexOf("@", c);
            b = e.indexOf(".", c);
            c = e.indexOf(";", c + 1);
            System.out.println(e.substring(a + 1, b));
        }
    }

    public static void main(String[] args) {
        Email emails = new Email();
        emails.email("aslanov@ssau.ru; aibelousov@yahoo.com; kazansky@smr.ru; aynesterow@yandex.ru;uglova93@mail.ru;");
    }
}