package by.belstu.it.supruniuk;

import by.belstu.it.supruniuk.TestFunction;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        TestFunction obj = new TestFunction(5);
        System.out.println(obj.getValue());

        for (int i=0; i<9; i++) {
            if (i>-1)
                if (i<10)
                    System.out.println(i);

        }

        for (int count = 0; count < 10; count++) {
            System.out.println("Counter "+count);
        }
    }
}