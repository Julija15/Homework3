import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        int n;
        String s;
        n = 5;
        switch (n) {
            case 12:
            case 1:
            case 2:
                s = "Зима";
                System.out.println(s);
                break;
            case 3:
            case 4:
            case 5:
                s = "Весна";
                System.out.println(s);
                break;
            case 6:
            case 7:
            case 8:
                s = "Лето";
                System.out.println(s);
                break;
            case 9:
            case 10:
            case 11:
                s = "Осень";
                System.out.println(s);
        }
// task 2
        int m;
        m = 6;
        if (m == 12 || m == 1 || m == 2) {
            System.out.println("Зима");
        } else if (m == 3 || m == 4 || m == 5) {
            System.out.println("Весна");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.println("Лето");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.println("Осень");
        }
// task 3
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        if (n1 % 2 != 0) {
            System.out.println("Нечетное");
        } else {
            System.out.println("Четное");
        }
        // task 4
        int t;
        t = 5;
        if (t >= -5) {
            System.out.println("Тепло");
        } else if (t <= -5 || t >= -20) {
            System.out.println("Нормально");
        } else if (t <= -20) {
            System.out.println("Холодно");
        }

        // task 5
        int n2;
        n2 = 2;
        switch (n2) {
            case 1:
                System.out.println("красный");
                break;
            case 2:
                System.out.println("оранжевый");
                break;
            case 3:
                System.out.println("желтый");
                break;
            case 4:
                System.out.println("зеленый");
                break;
        }
        // task 6
        int s1=0;
        for (int j = 0; j <= 100; j++) {
            if (j % 2 == 0)
                s1 = s1 + 1;
            else
                s1 = s1 - 1;
        }
        System.out.println(s1 + "");

        // task 7

        for (int s2 = 5; s2 >= 0; s2--) {
            System.out.println(s2 + "");
        }

            // task 8

            Scanner scanner1 = new Scanner(System.in);
            int a ; int b ; int sum;
            a = 1; sum = 0; n = 5;
            while (a <= n)
            {
                sum += 2 * a;
                a++;

                // task 9
int f = 7; int p;
        while ((f+7))
            }
            }
    }






























