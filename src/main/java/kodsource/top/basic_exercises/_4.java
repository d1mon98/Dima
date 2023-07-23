/*
4. Напишите Java-программу для печати результата следующих операций. Перейти к редактору
Тестовые данные:
а. -5 + 8 * 6
б. (55 + 9)% 9
с. 20 + -3 * 5/8
д. 5 + 15/3 * 2 - 8% 3
Ожидаемый результат :
43
1
19
13

 */


package kodsource.top.basic_exercises;

public class _4 {
    public static void main(String[] args) {
        System.out.println(-5 + 8 * 6);                  //-5+48 = 43
        System.out.println((55 + 9) % 9);                // 64%9 = 1
        System.out.println(20 + -3 * 5 / 8);             // 20 -15/8 =20-1 = 19
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);      // 5+5*2 -2 =15-2 =13
     }
}
