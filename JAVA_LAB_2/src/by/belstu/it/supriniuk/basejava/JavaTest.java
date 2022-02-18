package by.belstu.it.supriniuk.basejava;
import by.belstu.it.supruniuk.TestFunction;

import static java.lang.Math.*;

/**
 * @author EvgenySupruniuk
 * @version 1.0
 */

public class JavaTest {

    static int sint;
    final int finalInt = 5;
    public final int publicFinalInt = 10;
    public static final int publicStaticFinalInt = 33;

    public static void Ex3b(){
        char charVar = 'a';
        System.out.println(charVar);
        int intVar = 1;
        System.out.println(intVar);
        short shortVar = 2;
        System.out.println(shortVar);
        byte byteVar = 3;
        System.out.println(byteVar);
        long longVar = 4;
        System.out.println(longVar);
        boolean boolVar = true;
        System.out.println(boolVar);
        String stringVar = "string";
        System.out.println(stringVar);
        double doubleVar = 1.234;
        System.out.println(doubleVar);

        System.out.println(stringVar + intVar);
        System.out.println(stringVar + charVar);
        System.out.println(stringVar + doubleVar);

        byte byteInt = (byte)(byteVar + intVar);
        int intDoubleLong = (int)(doubleVar + longVar);
        long longIntPlusNumber = intVar + 2147483647;
        boolean boolAnd = boolVar && false;
        boolean boolXor = boolVar ^ false;

        //System.out.println(boolAnd + boolXor); нельзя
        long number = 9223372036854775807L;
        long numberOX = 0x7fff_ffff_fffL;
        char charUnicode = '\u0061';
        char charCode = 97;
        System.out.println(charVar+charUnicode+charCode);
        System.out.println(3.45%2.4);
        System.out.println(1.0/0.0);
        System.out.println(0.0/0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));
        System.out.println();
    }

    public static void Ex3d(){
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.round(Math.PI));
        System.out.println(Math.round(Math.E));
        System.out.println(Math.min(Math.PI, Math.E));
        System.out.println(Math.random());
        System.out.println();
    }

    public static void Ex3e(){
        Boolean objBool = true;
        Character objChar = 'C';
        Integer objInt = 123;
        Byte objByte = 9;
        Short objShort = 13;
        Long objLong = 16418237414L;
        Double objDouble = 3514.14135;

        System.out.println(objInt+objByte);
        System.out.println(objLong & objShort);
        System.out.println(objInt >>> 3);
        System.out.println(objBool && objBool);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int unboxInt = objInt;
        objInt = 345;
        byte unboxByte = objByte;
        objByte = 78;

        System.out.println(Integer.parseInt("12345"));
        System.out.println(Integer.toHexString(256));
        System.out.println(Integer.compare(123, 321));
        System.out.println(Integer.toString(7890));
        System.out.println(Integer.bitCount(136418));//количество битов в состоянии 1
        System.out.println(Double.isNaN(0.0/0.0));
        System.out.println();
    }

    public static void Ex3f(){
        String s34 = "2345";
        int s1 = new Integer(s34);
        int s2 = Integer.valueOf(s34);
        int s3 = Integer.parseInt(s34);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        byte[] array =  s34.getBytes();
        String fromArray = new String(array);
        boolean boolean1 = Boolean.parseBoolean(s34);
        boolean boolean2 = Boolean.parseBoolean(s34);
        System.out.println(boolean1);
        System.out.println(boolean2);
        System.out.println(fromArray);

        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2));

        str2 = null;
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        //System.out.println(str1.compareTo(str2)); Exception

        String[] split = str1.split("");
        for (var item : split) {
            System.out.print(item + " ");
        }
        System.out.println(str1.contains("e"));
        System.out.println(str1.hashCode());
        System.out.println(str1.indexOf('l'));
        System.out.println(str1.length());
        System.out.println(str1.replace('o', ' '));
        System.out.println();
    }

    public static void Ex3g(){
        char[][] c1;
        char[] c2[];
        char c3[][];

        c1 = new char[3][];
        c1[0] = new char[0];
        c1[1] = new char[1];
        c1[2] = new char[2];
        c2 = new char[][]{{'1', '2'}, {'3', '4'}};
        c3 = new char[][]{{'a', 'b'}, {'c', 'd'}};
        boolean comRez = c2 == c3;
        c2 = c3;
        for (var strAr : c3) {
            for(var item : strAr) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println(comRez);
        //System.out.println(c2[0][5]); Exception
        System.out.println();
    }

    public static void Ex3h(){
        System.out.println("Exercise 3h");
        WrapperString ws = new WrapperString("hello");
        ws.replace('o', 's');
        System.out.println(ws.getStr());

        var ws2 = new WrapperString("String") {
            @Override
            public void replace(char oldChar, char newChar) {
                System.out.println(oldChar);
            }

            public void delete(char newChar) {
                System.out.println(newChar);
            }
        };

        ws2.replace('a', 'b');
        ws2.delete('c');
    }

    public static void main(String[] args) {
        /**
         * @params
         */

        Ex3b();
        Ex3b();
        Ex3e();
        Ex3f();
        Ex3g();
        Ex3h();
    }
}
